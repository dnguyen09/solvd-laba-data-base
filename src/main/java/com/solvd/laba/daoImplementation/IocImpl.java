package com.solvd.laba.daoImplementation;

import com.solvd.laba.daoInterfaces.IocDAO;
import com.solvd.laba.model.InternationalOlympicCommitee;
import com.solvd.laba.utils.ConnectionUtil;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class IocImpl implements IocDAO {
    @Override
    public List<InternationalOlympicCommitee> getAll() {

        //initialize a list of ioc
        List<InternationalOlympicCommitee> iocList = new ArrayList<>();

        //establish database connection and createStatement
        try (Connection con = ConnectionUtil.getConnection();
             Statement statement = con.createStatement()) {

            //initializes ResultSet
            ResultSet rs = statement.executeQuery("SELECT * FROM international_olympic_commitee");

            //loop through rs
            while (rs.next()) {

                //initialize ioc variable to receive values from rs
                InternationalOlympicCommitee ioc = new InternationalOlympicCommitee();

                ioc.setIocId(rs.getInt(1));
                ioc.setIocName(rs.getString(2));
                ioc.setPresident(rs.getString(3));
                ioc.setHeadQuater(rs.getString(4));
                ioc.setYear_established(rs.getInt(5));

                //add ioc to the list
                iocList.add(ioc);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return iocList;
    }

    @Override
    public int insert(InternationalOlympicCommitee internationalOlympicCommitee) {
        return 0;
    }

}
