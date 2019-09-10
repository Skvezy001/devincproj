package com.app.entities.modelExt;

import com.app.entities.Model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "statistic")
public class Statistic extends Model {

    private Date date;
    private Integer correct;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "userid")
    private User user;

    private List<Question> questionList;

    public Statistic() {
    }

    public Statistic(Date date, Integer correct) {
        this.date = date;
        this.correct = correct;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getCorrect() {
        return correct;
    }

    public void setCorrect(Integer correct) {
        this.correct = correct;
    }
}
