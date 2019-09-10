package com.app.entities.modelExt;

import com.app.entities.Model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "question")
public class Question extends Model {

    private String description;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "answerid")
    private Answer answer;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "literatureid")
    private Literature literature;
    @OneToMany(mappedBy = "statistic", fetch=FetchType.EAGER)
    private List<Statistic> statisticList;
    @OneToMany(mappedBy = "statistic", fetch=FetchType.EAGER)
    private List<Test> testList;

    public Question() {
    }

    public Question(String description) {
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

    public Answer getAnswer() {
        return answer;
    }

    public void setAnswer(Answer answer) {
        this.answer = answer;
    }

    public Literature getLiterature() {
        return literature;
    }

    public void setLiterature(Literature literature) {
        this.literature = literature;
    }

    public List<Statistic> getStatisticList() {
        return statisticList;
    }

    public void setStatisticList(List<Statistic> statisticList) {
        this.statisticList = statisticList;
    }

    public List<Test> getTestList() {
        return testList;
    }

    public void setTestList(List<Test> testList) {
        this.testList = testList;
    }
}
