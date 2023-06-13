package com.solvd.laba.lab1.daoInterfaces;

import com.solvd.laba.lab1.dao.DAO;
import com.solvd.laba.lab1.model.InternationalOlympicCommitee;

public interface IocDao extends DAO<InternationalOlympicCommitee> {
    InternationalOlympicCommitee getByHostCountryId(int hostCountryId);
}
