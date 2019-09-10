package com.app.dao.impl;

import com.app.dao.Repository;
import com.app.dao.query.Query;
import com.app.entity.modelExt.Role;
import org.hibernate.Session;

import java.util.List;

public class RoleRepository implements Repository<Role> {

    @Override
    public List<Role> read(Session session) {

        session.beginTransaction();
        return session
                .createQuery(Query.SELECT_ROLE.getQuery(), Role.class)
                .list();
    }
}
