package com.solvd.laba.lab5;

import com.solvd.laba.lab1.model.Event;
import com.solvd.laba.lab5.mappers.EventMapperJava;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.io.InputStream;

public class MyBatisRunner {
    private static final Logger LOGGER = LogManager.getLogger(MyBatisRunner.class);

    public static void main(String[] args) {
        try (InputStream inputStream = Resources.getResourceAsStream("mybatis/mybatis-config.xml");
             SqlSession sqlSession = new SqlSessionFactoryBuilder().build(inputStream).openSession()) {

//            Athlete athlete = sqlSession.selectOne("com.solvd.laba.lab5.mapper.AthleteMapperJava.selectAthleteById", 1);

//            AthleteMapperJava athleteMapperJava = sqlSession.getMapper(AthleteMapperJava.class);
//            Athlete athlete = athleteMapperJava.selectAthleteById(3);
//            LOGGER.info(athlete);

//            IOCMapperJava iocMapperJava = sqlSession.getMapper(IOCMapperJava.class);
//            InternationalOlympicCommitee ioc = iocMapperJava.selectIOCById(1);
//            LOGGER.info(ioc);

//            TeamMapperJava teamMapperJava = sqlSession.getMapper(TeamMapperJava.class);
//            Team team = teamMapperJava.selectTeamById(2);
//            LOGGER.info(team);

            EventMapperJava eventMapperJava = sqlSession.getMapper(EventMapperJava.class);
            Event eventAthlete = eventMapperJava.selectEventAthleteById(4);
            LOGGER.info(eventAthlete);

            Event eventTeam = eventMapperJava.selectEventTeamById(8);
            LOGGER.info(eventTeam);

//            CityMapperJava cityMapperJava = sqlSession.getMapper(CityMapperJava.class);
//            City city = cityMapperJava.selectCityById(3);
//            LOGGER.info(city);

//            HotelMapperJava hotelMapperJava = sqlSession.getMapper(HotelMapperJava.class);
//            Hotel hotel = hotelMapperJava.selectHotelById(2);
//            LOGGER.info(hotel);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
