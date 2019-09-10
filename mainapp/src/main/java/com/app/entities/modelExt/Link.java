package com.app.entities.modelExt;

import com.app.entities.Model;

import javax.persistence.*;

@Entity
@Table(name = "link")
public class Link extends Model {

    private String link;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "literatureid")
    private Literature literature;

    public Link() {
    }

    public Link(String link) {
        this.link = link;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Literature getLiterature() {
        return literature;
    }

    public void setLiterature(Literature literature) {
        this.literature = literature;
    }
}
