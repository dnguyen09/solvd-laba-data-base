package com.solvd.laba.lab1.dao;

import java.util.List;

public interface DAO<T> {

    T getById(int id);

    List<T> getAll();

    int insert(T t);

    int update(T t);

    int delete(int t);

}
