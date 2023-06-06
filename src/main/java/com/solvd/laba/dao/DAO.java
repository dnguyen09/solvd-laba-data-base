package com.solvd.laba.dao;

import java.util.List;

public interface DAO<T> {

    List<T> getAll();

    int insert(T t);

}
