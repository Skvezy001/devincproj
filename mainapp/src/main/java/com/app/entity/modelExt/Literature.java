package com.app.entity.modelExt;

import com.app.entity.Model;

import javax.persistence.*;

@Entity
@Table(name = "literature")
public class Literature extends Model {

    private String description;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "questionid")
    private Question question;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "questionid")
    private Link link;

    public Literature() {
    }

    public Literature(String description) {
        this.description = description;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Link getLink() {
        return link;
    }

    public void setLink(Link link) {
        this.link = link;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }
}
