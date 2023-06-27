package com.solvd.laba.lab5.services;

import com.solvd.laba.lab1.model.Athlete;
import com.solvd.laba.lab5.interfaces.IAthleteService;
import com.solvd.laba.lab5.mappers.AthleteMapperJava;
import com.solvd.laba.lab5.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.io.IOException;
import java.util.List;
import java.util.function.Function;

public class MBAthleteService implements IAthleteService {
    AthleteMapperJava athleteMapperJava;

    private <T> T openAthleteSession(Function<AthleteMapperJava, T> action) {
        try (SqlSession sqlSession = MyBatisUtil.openSession()) {
            athleteMapperJava = MyBatisUtil.getMapper(sqlSession, AthleteMapperJava.class);
            return action.apply(athleteMapperJava);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public Athlete selectById(int id) {
        return openAthleteSession(mapper -> mapper.selectAthleteById(id));
    }

    @Override
    public List<Athlete> selectAllAthlete() {
        return openAthleteSession(AthleteMapperJava::selectAll);
    }

    @Override
    public void insertAthlete(Athlete athlete) {
        openAthleteSession(mapper -> {
            mapper.insertAthlete(athlete);
            return null;
        });
    }

    @Override
    public void updateAthlete(Athlete athlete) {
        openAthleteSession(mapper -> {
            mapper.updateAthlete(athlete);
            return null;
        });
    }

    @Override
    public void deleteAthleteById(int id) {
        openAthleteSession(mapper -> {
            mapper.deleteAthlete(id);
            return null;
        });
    }

    @Override
    public List<Athlete> selectAthleteByEventName(String eventName) {
        return openAthleteSession(mapper -> mapper.selectAthleteByEventName(eventName));
    }
}
