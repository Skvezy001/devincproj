package com.app.entity.modelExt;

import com.app.entity.Model;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "user")
public class User extends Model {

    private String firstName;
    private String lastName;
    private String login;
    private Integer password;

    @OneToMany(mappedBy = "user", fetch = FetchType.EAGER)
    private Collection<Statistic> statisticList;

    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name = "roleid")
    private Role role;

    public User() {
    }

    public User(String firstName, String lastName, String login, Integer password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.login = login;
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public Integer getPassword() {
        return password;
    }

    public void setPassword(Integer password) {
        this.password = password;
    }
}
