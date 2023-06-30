package com.solvd.laba.lab5.services;

import com.solvd.laba.lab1.model.Athlete;
import com.solvd.laba.lab5.interfaces.IAthleteService;
import com.solvd.laba.lab5.mappers.AthleteMapperJava;
import com.solvd.laba.lab5.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.io.IOException;
import java.util.List;

public class MBAthleteService implements IAthleteService {
    AthleteMapperJava athleteMapperJava;

    @Override
    public Athlete selectById(int id) {
        Athlete athlete = null;

        try (SqlSession sqlSession = MyBatisUtil.openSession()) {
            athleteMapperJava = MyBatisUtil.getMapper(sqlSession, AthleteMapperJava.class);
            athlete = athleteMapperJava.selectAthleteById(id);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return athlete;
    }

    @Override
    public List<Athlete> selectAllAthlete() {
        List<Athlete> athletes = null;

        try (SqlSession sqlSession = MyBatisUtil.openSession()) {
            athleteMapperJava = MyBatisUtil.getMapper(sqlSession, AthleteMapperJava.class);
            athletes = athleteMapperJava.selectAll();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return athletes;
    }

    @Override
    public void insertAthlete(Athlete athlete) {
        try (SqlSession sqlSession = MyBatisUtil.openSession()) {
            athleteMapperJava = MyBatisUtil.getMapper(sqlSession, AthleteMapperJava.class);
            athleteMapperJava.insertAthlete(athlete);
            sqlSession.commit();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void updateAthlete(Athlete athlete) {
        try (SqlSession sqlSession = MyBatisUtil.openSession()) {
            athleteMapperJava = MyBatisUtil.getMapper(sqlSession, AthleteMapperJava.class);
            athleteMapperJava.updateAthlete(athlete);
            sqlSession.commit();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteAthleteById(int id) {
        try (SqlSession sqlSession = MyBatisUtil.openSession()) {
            athleteMapperJava = MyBatisUtil.getMapper(sqlSession, AthleteMapperJava.class);
            athleteMapperJava.deleteAthlete(id);
            sqlSession.commit();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Athlete> selectAthleteByEventName(String eventName) {
        List<Athlete> athletes = null;

        try (SqlSession sqlSession = MyBatisUtil.openSession()) {
            athleteMapperJava = MyBatisUtil.getMapper(sqlSession, AthleteMapperJava.class);
            athletes = athleteMapperJava.selectAthleteByEventName(eventName);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return athletes;
    }
}
