package com.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by soner.ustel on 07/05/2017.
 */
@Entity
@Table(name = "APPOINTMENTS")
@NamedNativeQueries({
        @NamedNativeQuery(name = "GET_APPOINTMENTS", query = "SELECT a.* FROM APPOINTMENTS a")
})
public class Appointment implements Serializable, IModel{

    private static final long serialVersionUID = -1798807078331545676L;

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "DELETED")
    private Boolean deleted;

    @Column(name = "NAME")
    private String name;

    @Column(name = "SECTOR")
    private String sector;

    @Column(name = "CITY")
    private String city;

    @Column(name = "TOWN")
    private String town;

    @Column(name = "DISTRICT")
    private String district;

    @Column(name = "IMAGE")
    private String imagePath;

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

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }
}