package com.solvd.laba.lab5.services;

import com.solvd.laba.lab1.model.Athlete;
import com.solvd.laba.lab5.interfaces.MyBatisService;
import com.solvd.laba.lab5.mappers.AthleteMapperJava;
import com.solvd.laba.lab5.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MBAthleteService implements MyBatisService<Athlete> {
    AthleteMapperJava athleteMapperJava;

    @Override
    public Athlete selectById(int id) {
        Athlete athlete = new Athlete();

        try (SqlSession sqlSession = MyBatisUtil.openSession()) {
            athleteMapperJava = MyBatisUtil.getMapper(sqlSession, AthleteMapperJava.class);
            athlete = athleteMapperJava.selectAthleteById(id);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return athlete;
    }

    @Override
    public List<Athlete> selectAll() {
        List<Athlete> athleteList = new ArrayList<>();
        try (SqlSession sqlSession = MyBatisUtil.openSession()) {

            athleteMapperJava = MyBatisUtil.getMapper(sqlSession, AthleteMapperJava.class);
            athleteList = athleteMapperJava.selectAll();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return athleteList;
    }

    @Override
    public void insert(Athlete athlete) {
        try (SqlSession sqlSession = MyBatisUtil.openSession()) {
            athleteMapperJava = MyBatisUtil.getMapper(sqlSession, AthleteMapperJava.class);
            athleteMapperJava.insertAthlete(athlete);
            sqlSession.commit();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
