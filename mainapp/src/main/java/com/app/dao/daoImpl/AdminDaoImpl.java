package com.app.dao.daoImpl;

import com.app.dao.AdminDao;
import com.app.entities.modelExt.Statistic;
import com.app.entities.modelExt.Test;
import com.app.entities.modelExt.Topic;
import com.app.entities.modelExt.User;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class AdminDaoImpl implements AdminDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void addNewMember(User user) {
        sessionFactory.getCurrentSession().save(user);
    }

    @Override
    public void editMember(User user) {
        sessionFactory.getCurrentSession().update(user);
    }

    @Override
    public void removeMember(User user) {
        sessionFactory.getCurrentSession().delete(user);
    }

    @Override
    public void addNewTopic(Topic topic) {
        sessionFactory.getCurrentSession().save(topic);
    }

    @Override
    public void editTopic(Topic topic) {
        sessionFactory.getCurrentSession().update(topic);
    }

    @Override
    public void removeTopic(Topic topic) {
        sessionFactory.getCurrentSession().delete(topic);
    }

    @Override
    public List<Statistic> getMembersProgressGrid() {
        return sessionFactory.getCurrentSession().createQuery("from Statistic").list();
    }

    @Override
    public List<Test> getAllTests() {
        return sessionFactory.getCurrentSession().createQuery("from Test").list();
    }
}
