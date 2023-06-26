package com.solvd.laba.lab5.services;

import com.solvd.laba.lab1.model.Team;
import com.solvd.laba.lab5.interfaces.ITeamService;
import com.solvd.laba.lab5.mappers.TeamMapperJava;
import com.solvd.laba.lab5.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.io.IOException;
import java.util.List;
import java.util.function.Function;

public class MBTeamService implements ITeamService {
    TeamMapperJava teamMapperJava;

    private <T> T openTeamSession(Function<TeamMapperJava, T> action) {
        try (SqlSession sqlSession = MyBatisUtil.openSession()) {
            teamMapperJava = MyBatisUtil.getMapper(sqlSession, TeamMapperJava.class);
            return action.apply(teamMapperJava);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public Team selectTeamById(int id) {
        return openTeamSession(mapper -> mapper.selectTeamById(id));
    }

    @Override
    public List<Team> selectAll() {
        return openTeamSession(TeamMapperJava::selectAll);
    }

    @Override
    public void insertTeam(Team team) {
        openTeamSession(mapper -> {
            mapper.insertTeam(team);
            return null;
        });
    }

    @Override
    public void updateTeam(Team team) {
        openTeamSession(mapper -> {
            mapper.updateTeam(team);
            return null;
        });
    }

    @Override
    public void deleteTeamById(int id) {
        openTeamSession(mapper -> {
            mapper.deleteTeam(id);
            return null;
        });
    }
}
