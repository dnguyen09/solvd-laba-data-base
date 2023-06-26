package com.solvd.laba.lab5.mappers;

import com.solvd.laba.lab1.model.InternationalOlympicCommitee;
import org.apache.ibatis.annotations.Select;

public interface IOCMapperJava {

    @Select("select IOC_id as iocId, president from international_olympic_commitee where IOC_id = #{id}")
    InternationalOlympicCommitee selectIOCById(int id);
}
