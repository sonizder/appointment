package com.model;


import com.sun.istack.internal.Nullable;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by soner.ustel on 26/03/2017.
 */

@Entity
@Table(name = "USERS")
@NamedNativeQueries(
        { @NamedNativeQuery(name = "GET_USERS_BY_EMAIL", query = "SELECT * FROM USERS u WHERE u.EMAIL = :email", resultClass = User.class) })
public class User implements Serializable, IModel{


    private static final long serialVersionUID = -1798070786993154676L;

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "LASTNAME")
    private String lastName;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "PASSWORD")
    private String password;

    @Column(name = "JOB")
    private String job;

    @Column(name = "ROLE")
    private String role;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
