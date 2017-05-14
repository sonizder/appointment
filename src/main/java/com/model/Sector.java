package com.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by soner.ustel on 13/05/2017.
 */

@Entity
@Table(name = "SECTORS")
@NamedNativeQueries({
        @NamedNativeQuery(name = "GET_SECTOR", query = "SELECT s.* FROM SECTORS s")})
public class Sector implements Serializable, IModel {

    private static final long serialVersionUID = -1799780670278469936L;

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "DELETED")
    private Boolean deleted;

    @Column(name = "NAME")
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
