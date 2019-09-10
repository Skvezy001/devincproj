package com.app.entities.modelExt;

import com.app.entities.Model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "test")
public class Test extends Model {

    private String name;
    private String description;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "topicid")
    private Topic topic;
    @OneToMany(mappedBy = "test", fetch = FetchType.EAGER)
    private List<Question> questionList;

    public Test() {
    }

    public Test(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Question> getQuestionList() {
        return questionList;
    }

    public void setQuestionList(List<Question> questionList) {
        this.questionList = questionList;
    }

    public Topic getTopic() {
        return topic;
    }

    public void setTopic(Topic topic) {
        this.topic = topic;
    }
}
