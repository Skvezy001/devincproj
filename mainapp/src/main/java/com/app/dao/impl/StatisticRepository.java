package com.app.dao.impl;

import com.app.dao.Repository;
import com.app.dao.query.Query;
import com.app.entity.modelExt.Statistic;
import org.hibernate.Session;

import java.util.List;

public class StatisticRepository implements Repository<Statistic> {

    @Override
    public List<Statistic> read(Session session) {

        session.beginTransaction();
        return session
                .createQuery(Query.SELECT_STATISTIC.getQuery(), Statistic.class)
                .list();
    }
}
