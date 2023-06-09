package com.solvd.laba.dao;

import com.solvd.laba.utils.ConnectionUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public abstract class DAOImpl<T> implements DAO<T> {

    @Override
    public T getById(int id) {

        T entity = null;

        //establish database connection and preparedStatement
        try (Connection con = ConnectionUtil.getConnection();
             PreparedStatement ps = con.prepareStatement(getByIdSQL())) {

            //adding value to ps
            ps.setInt(1, id);

            //initialize resultSet
            ResultSet rs = ps.executeQuery();

            //loop through rs
            while (rs.next()) {
                entity = createEntity();

                getResultSet(rs, entity);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return entity;
    }

    @Override
    public List<T> getAll() {

        //initialize a list of athlete
        List<T> list = new ArrayList<>();

        //establish database connection and createStatement
        try (Connection con = ConnectionUtil.getConnection();
             Statement statement = con.createStatement()) {

            //initializes ResultSet
            ResultSet rs = statement.executeQuery(getSQL());

            //loop through rs
            while (rs.next()) {
                T entity = createEntity();

                getResultSet(rs, entity);

                //add entity to the list
                list.add(entity);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return list;
    }

    @Override
    public int insert(T entity) {
        int result = 0;

        //establish database connection and preparedStatement
        try (Connection con = ConnectionUtil.getConnection();
             PreparedStatement ps = con.prepareStatement(getInsertSQL())) {

            getInsertPS(ps, entity);

            result = ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return result;
    }

    @Override
    public int update(T entity) {

        int result = 0;

        //establish database connection and preparedStatement
        try (Connection con = ConnectionUtil.getConnection();
             PreparedStatement ps = con.prepareStatement(getUpdateSQL())) {

            //call method
            getUpdatePS(ps, entity);

            result = ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public int delete(int id) {
        int result = 0;

        //establish database connection and preparedStatement
        try (Connection con = ConnectionUtil.getConnection();
             PreparedStatement ps = con.prepareStatement(getDeleteSQL())) {

            //execute SQL statement using ps
            ps.setInt(1, id);

            result = ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
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

    //method create entity from table
    protected abstract T createEntity();

    //method adding value from a table to resultSet
    protected abstract void getResultSet(ResultSet rs, T entity) throws SQLException;

    //method update value from table using preparedStatement
    protected abstract void getUpdatePS(PreparedStatement ps, T entity) throws SQLException;

    protected abstract void getInsertPS(PreparedStatement ps, T entity) throws SQLException;


}
