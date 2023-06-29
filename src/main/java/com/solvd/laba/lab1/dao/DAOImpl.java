package com.solvd.laba.lab1.dao;

import com.solvd.laba.lab1.utils.ConnectionUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public abstract class DAOImpl<T> implements DAO<T> {

    @Override
    public T getById(int id) {
        T entity = null;
        Connection con = null;

        try {
            con = ConnectionUtil.getConnection();
            try (PreparedStatement ps = con.prepareStatement(getByIdSQL())) {
                ps.setInt(1, id);
                ResultSet rs = ps.executeQuery();
                if (rs.next()) {
                    entity = buildFromResultSet(rs);
                }
            }
        } catch (SQLException | InterruptedException e) {
            e.printStackTrace();
        } finally {
            if (con != null) {
                ConnectionUtil.releaseConnection(con);
            }
        }

        return entity;
    }

    @Override
    public List<T> getAll() {
        //initialize a list of athlete
        List<T> list = new ArrayList<>();
        Connection con = null;

        //establish database connection and createStatement
        try {
            con = ConnectionUtil.getConnection();
            try (Statement statement = con.createStatement()) {

                //initializes ResultSet
                ResultSet rs = statement.executeQuery(getSQL());

                //loop through rs
                while (rs.next()) {
                    //add entity to the list
                    list.add(buildFromResultSet(rs));
                }

            }
        } catch (SQLException | InterruptedException e) {
            e.printStackTrace();
        } finally {
            ConnectionUtil.releaseConnection(con);
        }
        return list;
    }

    @Override
    public int insert(T entity) {
        int result = 0;
        Connection con = null;

        //establish database connection and preparedStatement
        try {
            con = ConnectionUtil.getConnection();
            try (PreparedStatement ps = con.prepareStatement(getInsertSQL())) {

                getInsertPS(ps, entity);

                result = ps.executeUpdate();

            }
        } catch (SQLException | InterruptedException e) {
            e.printStackTrace();
        } finally {
            ConnectionUtil.releaseConnection(con);
        }

        return result;
    }

    @Override
    public int update(T entity) {
        Connection con = null;
        int result = 0;

        //establish database connection and preparedStatement
        try {
            con = ConnectionUtil.getConnection();
            try (PreparedStatement ps = con.prepareStatement(getUpdateSQL())) {

                //call method
                getUpdatePS(ps, entity);

                result = ps.executeUpdate();
            }
        } catch (SQLException | InterruptedException e) {
            e.printStackTrace();
        } finally {
            ConnectionUtil.releaseConnection(con);
        }
        return result;
    }

    @Override
    public int delete(int id) {
        int result = 0;
        Connection con = null;
        //establish database connection and preparedStatement
        try {
            con = ConnectionUtil.getConnection();
            try (PreparedStatement ps = con.prepareStatement(getDeleteSQL())) {

                //execute SQL statement using ps
                ps.setInt(1, id);

                result = ps.executeUpdate();
            }
        } catch (SQLException | InterruptedException e) {
            e.printStackTrace();
        } finally {
            ConnectionUtil.releaseConnection(con);
        }

        return result;
    }

    /*Methods*/
    //String query
    protected abstract String getSQL();

    //method get SQL UPDATE
    protected abstract String getUpdateSQL();

    //method get SQL DELETE
    protected abstract String getDeleteSQL();

    //method get SQL by id
    protected abstract String getByIdSQL();

    //method get SQL INSERT
    protected abstract String getInsertSQL();

    //method adding value from a table to resultSet
    protected abstract T buildFromResultSet(ResultSet rs) throws SQLException;

    //method update value from table using preparedStatement
    protected abstract void getUpdatePS(PreparedStatement ps, T entity) throws SQLException;

    protected abstract void getInsertPS(PreparedStatement ps, T entity) throws SQLException;


}
