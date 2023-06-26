package com.solvd.laba.lab5.interfaces;

import java.util.List;

public interface MyBatisService<T> {

    T selectById(int id);

    List<T> selectAll();

    void insert(T t);

}
