package com.solvd.laba.lab5.interfaces;

import com.solvd.laba.lab1.model.Result;

import java.util.List;

public interface IResultService {
    Result selectResultById(int id);

    List<Result> selectAllResult();

    void insertResult(Result result);

    void updateResult(Result result);

    void deleteResult(int id);
}
