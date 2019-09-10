package com.app.dao;

import com.app.entities.modelExt.Statistic;
import com.app.entities.modelExt.Test;
import com.app.entities.modelExt.Topic;
import com.app.entities.modelExt.User;

import java.util.List;

public interface AdminDao {

    void addNewMember(User user);
    void editMember(User user);
    void removeMember(User user);

    void addNewTopic(Topic topic);
    void editTopic(Topic topic);
    void removeTopic(Topic topic);

    List<Statistic> getMembersProgressGrid();
    List<Test> getAllTests();

}
