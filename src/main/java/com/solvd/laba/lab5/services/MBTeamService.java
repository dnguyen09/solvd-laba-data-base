package com.solvd.laba.lab5.services;

import com.solvd.laba.lab1.model.Team;
import com.solvd.laba.lab5.interfaces.MyBatisService;
import com.solvd.laba.lab5.mappers.TeamMapperJava;
import com.solvd.laba.lab5.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MBTeamService implements MyBatisService<Team> {
    TeamMapperJava teamMapperJava;

    @Override
    public Team selectById(int id) {
        Team team = new Team();

        try (SqlSession sqlSession = MyBatisUtil.openSession()) {
            teamMapperJava = MyBatisUtil.getMapper(sqlSession, TeamMapperJava.class);
            team = teamMapperJava.selectTeamById(id);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return team;
    }

    @Override
    public List<Team> selectAll() {
        List<Team> teamList = new ArrayList<>();
        try (SqlSession sqlSession = MyBatisUtil.openSession()) {

            teamMapperJava = MyBatisUtil.getMapper(sqlSession, TeamMapperJava.class);
            teamList = teamMapperJava.selectAll();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return teamList;
    }

    @Override
    public void insert(Team team) {
        try (SqlSession sqlSession = MyBatisUtil.openSession()) {
            teamMapperJava = MyBatisUtil.getMapper(sqlSession, TeamMapperJava.class);
            teamMapperJava.insertTeam(team);
            sqlSession.commit();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
