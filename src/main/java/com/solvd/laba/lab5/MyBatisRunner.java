package com.solvd.laba.lab5;

import com.solvd.laba.lab1.model.Athlete;
import com.solvd.laba.lab5.factory.MyBatisServiceFactory;
import com.solvd.laba.lab5.interfaces.IAthleteService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MyBatisRunner {
    private static final Logger LOGGER = LogManager.getLogger(MyBatisRunner.class);

    public static void main(String[] args) {
//        MyBatisServiceFactory myBatisServiceFactory = new MyBatisServiceFactory();
//        IResultService mbResultService = myBatisServiceFactory.pickResultService("mybatis");
//        LOGGER.info(mbResultService.selectAllResult());


        MyBatisServiceFactory myBatisServiceFactory = new MyBatisServiceFactory();
//        IAthleteService athleteServiceDao = myBatisServiceFactory.pickAthleteService("dao");
//        LOGGER.info(athleteServiceDao.selectAllAthlete());
//
        IAthleteService mbAthleteService = myBatisServiceFactory.pickAthleteService("mybatis");
//        LOGGER.info(mbAthleteService.selectAthleteByEventName("sprint 100m"));

        LOGGER.info(mbAthleteService.selectAllAthlete());

        Athlete athlete19 = new Athlete(19, "Armando Mendez", "male", 35, new Team(5));
        mbAthleteService.insertAthlete(athlete19);
//
//
        Athlete athlete19Updated = new Athlete(19, "Armando Mendez", "male", 35, new Team(11));
        mbAthleteService.updateAthlete(athlete19Updated);
//
        mbAthleteService.deleteAthleteById(19);
//
//        ITeamService teamServiceDao = myBatisServiceFactory.pickTeamService("dao");
//        LOGGER.info(teamServiceDao.selectTeamById(8));
//
//        ITeamService MBTeamService = myBatisServiceFactory.pickTeamService("mybatis");
//        LOGGER.info(MBTeamService.selectTeamById(8));


//        MyBatisServiceFactory myBatisServiceFactory = new MyBatisServiceFactory();
//        MyBatisService<Athlete> athleteService = myBatisServiceFactory.createMBService("athlete");
//        LOGGER.info(athleteService.selectById(19));
//        LOGGER.info(athleteService.selectAll());
//
//        MyBatisService<Team> teamService = myBatisServiceFactory.createMBService("team");
//        LOGGER.info(teamService.selectById(5));
//        LOGGER.info(teamService.selectAll());

//        AthleteService athleteService = new AthleteService();
//        Athlete athlete19 = new Athlete(19, "Armando Mendez", "male", 35, new Team(5));
//        athleteService.insertAthlete(athlete19);


//        try (InputStream inputStream = Resources.getResourceAsStream("mybatis/mybatis-config.xml");
//             SqlSession sqlSession = new SqlSessionFactoryBuilder().build(inputStream).openSession()) {

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

//            EventMapperJava eventMapperJava = sqlSession.getMapper(EventMapperJava.class);
//            Event eventAthlete = eventMapperJava.selectEventAthleteById(4);
//            LOGGER.info(eventAthlete);
//
//            Event eventTeam = eventMapperJava.selectEventTeamById(8);
//            LOGGER.info(eventTeam);

//            CityMapperJava cityMapperJava = sqlSession.getMapper(CityMapperJava.class);
//            City city = cityMapperJava.selectCityById(3);
//            LOGGER.info(city);

//            HotelMapperJava hotelMapperJava = sqlSession.getMapper(HotelMapperJava.class);
//            Hotel hotel = hotelMapperJava.selectHotelById(2);
//            LOGGER.info(hotel);

//        } catch (IOException e) {
//            e.printStackTrace();
//        }

//        MyBatisUtil athleteService = new MyBatisUtil();
//        Athlete athlete = athleteService.selectAthleteById(3);
//        LOGGER.info(athlete);

//        LOGGER.info(new AthleteService().selectAthleteById(19));
//        LOGGER.info(new AthleteService().selectAll());


    }
}
