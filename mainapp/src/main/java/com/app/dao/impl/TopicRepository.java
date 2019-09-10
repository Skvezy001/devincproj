package com.app.dao.impl;

import com.app.dao.Repository;
import com.app.dao.query.Query;
import com.app.entity.modelExt.Topic;
import org.hibernate.Session;

import java.util.List;

public class TopicRepository implements Repository<Topic> {

    @Override
    public List<Topic> read(Session session) {

        session.beginTransaction();
        return session
                .createQuery(Query.SELECT_TOPIC.getQuery(), Topic.class)
                .list();
    }
}
