package com.app.dao.impl;

import com.app.dao.Repository;
import com.app.dao.query.Query;
import com.app.entity.modelExt.Literature;
import org.hibernate.Session;

import java.util.List;

public class LiteratureRepository implements Repository<Literature> {

    @Override
    public List<Literature> read(Session session) {

        session.beginTransaction();
        return session
                .createQuery(Query.SELECT_LITERATURE.getQuery(), Literature.class)
                .list();
    }
}
