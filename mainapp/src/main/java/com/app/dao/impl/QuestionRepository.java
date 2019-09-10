package com.app.dao.impl;

import com.app.dao.Repository;
import com.app.dao.query.Query;
import com.app.entity.modelExt.Question;
import org.hibernate.Session;

import java.util.List;

public class QuestionRepository implements Repository<Question> {

    //Abstrcat Repo
//    public QuestionRepository() {
//        super(QuestionRepository.class);
//    }

    @Override
    public List<Question> read(Session session) {

        session.beginTransaction();
        return session
                .createQuery(Query.SELECT_QUESTION.getQuery(), Question.class)
                .list();
    }
}
