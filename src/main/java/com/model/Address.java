package com.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by soner.ustel on 07/05/2017.
 */
@Entity
@Table(name = "ADDRESSES")
@NamedNativeQueries({
        @NamedNativeQuery(name = "GET_CITY", query = "SELECT DISTINCT(a.CITY) FROM ADDRESSES a"),
                @NamedNativeQuery(name = "GET_TOWN", query = "SELECT DISTINCT(a.TOWN) FROM ADDRESSES a WHERE a.CITY = :city"),
                @NamedNativeQuery(name = "GET_DISTRICT", query = "SELECT a.DISTRICT FROM ADDRESSES a WHERE a.CITY = :city AND a.TOWN = :town")})
public class Address implements Serializable, IModel{

    private static final long serialVersionUID = -1798807078331545676L;

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "DELETED")
    private Boolean deleted;

    @Column(name = "CITY")
    private String city;

    @Column(name = "TOWN")
    private String town;

    @Column(name = "DISTRICT")
    private String district;

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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

}