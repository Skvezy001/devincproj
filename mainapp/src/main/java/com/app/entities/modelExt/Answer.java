package com.app.entities.modelExt;

import com.app.entities.Model;

import javax.persistence.*;


@Entity
@Table(name = "answer")
public class Answer extends Model {

    private String description;
    private String correct;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "questionid")
    private Question question;

    public Answer() {
    }

    public Answer(String description, String correct) {
        this.description = description;
        this.correct = correct;
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

    public String getCorrect() {
        return correct;
    }

    public void setCorrect(String correct) {
        this.correct = correct;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }
}
