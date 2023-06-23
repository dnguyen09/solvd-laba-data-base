package com.solvd.laba.lab5.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class MyBatisUtil {

    public static SqlSession openSession() throws IOException {
        InputStream inputStream = Resources.getResourceAsStream("mybatis/mybatis-config.xml");
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        return sessionFactory.openSession();
    }

    public static <T> T getMapper(SqlSession sqlSession, Class<T> interfaceMapperClass) {
        return sqlSession.getMapper(interfaceMapperClass);
    }

}
