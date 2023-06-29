package com.solvd.laba.lab5.services;

import com.solvd.laba.lab1.model.Result;
import com.solvd.laba.lab5.interfaces.IResultService;
import com.solvd.laba.lab5.mappers.ResultMapperJava;
import com.solvd.laba.lab5.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.io.IOException;
import java.util.List;
import java.util.function.Function;

public class MBResultService implements IResultService {
    ResultMapperJava resultMapperJava;

    private <T> T openResultSession(Function<ResultMapperJava, T> action) {
        try (SqlSession sqlSession = MyBatisUtil.openSession()) {
            resultMapperJava = MyBatisUtil.getMapper(sqlSession, ResultMapperJava.class);
            return action.apply(resultMapperJava);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public Result selectResultById(int id) {
        return openResultSession(mapper -> mapper.selectResultById(id));
    }

    @Override
    public List<Result> selectAllResult() {
        return openResultSession(ResultMapperJava::selectAll);
    }

    @Override
    public void insertResult(Result result) {
        openResultSession(mapper -> {
            mapper.insertResult(result);
            return null;
        });
    }

    @Override
    public void updateResult(Result result) {
        openResultSession(mapper -> {
            mapper.updateResult(result);
            return null;
        });
    }

    @Override
    public void deleteResult(int id) {
        openResultSession(mapper -> {
            mapper.deleteResult(id);
            return null;
        });
    }
}
