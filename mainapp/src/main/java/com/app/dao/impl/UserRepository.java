package com.app.dao.impl;

import com.app.dao.Repository;
import com.app.dao.query.Query;
import com.app.entity.modelExt.User;
import org.hibernate.Session;

import java.util.List;

public class UserRepository implements Repository<User> {

    @Override
    public List<User> read(Session session) {

        session.beginTransaction();
        return session
                .createQuery(Query.SELECT_USER.getQuery(), User.class)
                .list();
    }

    public User getUserByLoginAndPassword(User user, Session session){

        session.beginTransaction();
        return session
                .createQuery(Query.SELECT_USER_BY_LOGIN_AND_PASSWORD.getQuery(), User.class)
                .getSingleResult();
    }
}
