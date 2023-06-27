package com.solvd.laba.lab5.mappers;

import com.solvd.laba.lab1.model.Result;

import java.util.List;

public interface ResultMapperJava {
    Result selectResultById(int id);

    List<Result> selectAll();

    void insertResult(Result result);

    void updateResult(Result result);

    void deleteResult(int id);
}
