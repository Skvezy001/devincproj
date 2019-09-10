package com.app.dao.impl;

import com.app.dao.Repository;
import com.app.dao.query.Query;
import com.app.entity.modelExt.Test;
import org.hibernate.Session;

import java.util.List;

public class TestRepository implements Repository<Test> {

    @Override
    public List<Test> read(Session session) {

        session.beginTransaction();
        return session
                .createQuery(Query.SELECT_TEST.getQuery(), Test.class)
                .list();
    }
}
