package com.app.entity.modelExt;

import com.app.entity.Model;

import javax.persistence.*;

@Entity
@Table(name = "role")
public class Role extends Model {

    private boolean user;
    private boolean admin;
    private boolean tutor;
    @OneToMany(mappedBy = "role", fetch=FetchType.EAGER)
    private User userConnection;

    public Role() {
    }

    public Role(boolean user, boolean admin, boolean tutor) {
        this.user = user;
        this.admin = admin;
        this.tutor = tutor;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public boolean isUser() {
        return user;
    }

    public void setUser(boolean user) {
        this.user = user;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    public boolean isTutor() {
        return tutor;
    }

    public void setTutor(boolean tutor) {
        this.tutor = tutor;
    }

    public User getUserConnection() {
        return userConnection;
    }

    public void setUserConnection(User userConnection) {
        this.userConnection = userConnection;
    }
}
