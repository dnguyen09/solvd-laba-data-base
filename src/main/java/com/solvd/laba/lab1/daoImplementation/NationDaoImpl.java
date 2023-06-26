package com.solvd.laba.lab1.daoImplementation;

import com.solvd.laba.lab1.dao.DAOImpl;
import com.solvd.laba.lab1.model.Nation;
import com.solvd.laba.lab1.utils.ConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class NationDaoImpl extends DAOImpl<Nation> {

    @Override
    protected String getSQL() {
        return "SELECT * FROM nations";
    }

    @Override
    protected String getUpdateSQL() {
        return "UPDATE nations SET nation_name = ? WHERE nation_id = ?";
    }

    @Override
    protected String getDeleteSQL() {
        return null;
    }

    @Override
    protected String getByIdSQL() {
        return "SELECT * FROM nations WHERE nation_id = ?";
    }

    @Override
    protected String getInsertSQL() {
        return null;
    }

    @Override
    protected Nation buildFromResultSet(ResultSet rs) throws SQLException {
        Nation nation = new Nation();
        nation.setNationId(rs.getInt("nation_id"));
        nation.setNationName(rs.getString("nation_name"));
        nation.setRegion(rs.getString("region"));
        return nation;
    }

    @Override
    protected void getUpdatePS(PreparedStatement ps, Nation nation) throws SQLException {
        ps.setString(1, nation.getNationName());
        ps.setInt(2, nation.getNationId());
    }

    @Override
    protected void getInsertPS(PreparedStatement ps, Nation entity) throws SQLException {

    }

    public Nation getNationByTeamId(int teamId) {
        Nation nation = new Nation();
        Connection con = null;
        try {
            con = ConnectionUtil.getConnection();

            try (PreparedStatement statement = con.prepareStatement("select * from teams t\n" +
                    "join nations n on n.nation_id = t.nation_id\n" +
                    "where t.team_id = ?")) {
                statement.setInt(1, teamId);
                ResultSet rs = statement.executeQuery();
                while (rs.next()) {
                    nation = buildFromResultSet(rs);
                }
            }
        } catch (InterruptedException | SQLException e) {
            e.printStackTrace();
        } finally {
            if (con != null) {
                ConnectionUtil.releaseConnection(con);
            }
        }

        return nation;
    }
}
