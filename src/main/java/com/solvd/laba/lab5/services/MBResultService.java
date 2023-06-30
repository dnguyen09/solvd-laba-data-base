package com.solvd.laba.lab5.services;

import com.solvd.laba.lab1.model.Result;
import com.solvd.laba.lab5.interfaces.IResultService;
import com.solvd.laba.lab5.mappers.ResultMapperJava;
import com.solvd.laba.lab5.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.io.IOException;
import java.util.List;

public class MBResultService implements IResultService {
    ResultMapperJava resultMapperJava;

    @Override
    public Result selectResultById(int id) {
        Result result = null;

        try (SqlSession sqlSession = MyBatisUtil.openSession()) {
            resultMapperJava = MyBatisUtil.getMapper(sqlSession, ResultMapperJava.class);
            result = resultMapperJava.selectResultById(id);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return result;
    }

    @Override
    public List<Result> selectAllResult() {
        List<Result> result = null;

        try (SqlSession sqlSession = MyBatisUtil.openSession()) {
            resultMapperJava = MyBatisUtil.getMapper(sqlSession, ResultMapperJava.class);
            result = resultMapperJava.selectAll();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return result;
    }

    @Override
    public List<Result> selectResultByEventId(int eventId) {
        List<Result> result = null;

        try (SqlSession sqlSession = MyBatisUtil.openSession()) {
            resultMapperJava = MyBatisUtil.getMapper(sqlSession, ResultMapperJava.class);
            result = resultMapperJava.selectResultByEventId(eventId);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return result;
    }

    @Override
    public void insertResult(Result result) {
        try (SqlSession sqlSession = MyBatisUtil.openSession()) {
            resultMapperJava = MyBatisUtil.getMapper(sqlSession, ResultMapperJava.class);
            resultMapperJava.insertResult(result);
            sqlSession.commit();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void updateResult(Result result) {
        try (SqlSession sqlSession = MyBatisUtil.openSession()) {
            resultMapperJava = MyBatisUtil.getMapper(sqlSession, ResultMapperJava.class);
            resultMapperJava.updateResult(result);
            sqlSession.commit();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteResult(int id) {
        try (SqlSession sqlSession = MyBatisUtil.openSession()) {
            resultMapperJava = MyBatisUtil.getMapper(sqlSession, ResultMapperJava.class);
            resultMapperJava.deleteResult(id);
            sqlSession.commit();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void updateMedalByAthleteId(Result result) {
        try (SqlSession sqlSession = MyBatisUtil.openSession()) {
            resultMapperJava = MyBatisUtil.getMapper(sqlSession, ResultMapperJava.class);
            resultMapperJava.updateMedalByAthleteId(result);
            sqlSession.commit();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
