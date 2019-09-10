package com.app.dao;

import com.app.entity.modelExt.Statistic;
import com.app.entity.modelExt.Test;
import com.app.entity.modelExt.Topic;
import com.app.entity.modelExt.User;

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
