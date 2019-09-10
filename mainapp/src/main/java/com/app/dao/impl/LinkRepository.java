package com.app.dao.impl;

import com.app.dao.Repository;
import com.app.dao.query.Query;
import com.app.entity.modelExt.Link;
import org.hibernate.Session;

import java.util.List;

public class LinkRepository implements Repository<Link> {

    @Override
    public List<Link> read(Session session) {

        session.beginTransaction();
        return session
                .createQuery(Query.SELECT_LINK.getQuery(), Link.class)
                .list();
    }
}
