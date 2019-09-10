package com.app.dao.impl;

import com.app.dao.Repository;
import com.app.dao.query.Query;
import com.app.entity.modelExt.Answer;
import org.hibernate.Session;

import java.util.List;

public class AnswerRepository implements Repository<Answer> {

    @Override
    public List<Answer> read(Session session) {

        session.beginTransaction();
        return session
                    .createQuery(Query.SELECT_ANSWER.getQuery(), Answer.class)
                    .list();
    }
}
