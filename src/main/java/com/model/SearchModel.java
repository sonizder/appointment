package com.model;

import java.util.HashMap;
import java.util.Map;
import static com.util.object.StringUtils.*;

/**
 * Created by soner.ustel on 19/05/2017.
 */
public class SearchModel {

    private String city;
    private String town;
    private String district;
    private String sector;

    public SearchModel() {}

    public SearchModel(String city, String town, String district, String sector) {
        this.city = city;
        this.town = town;
        this.district = district;
        this.sector = sector;
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

    public Map<String, String> getParams(){
        Map<String, String> params =  new HashMap<>();
        if(isNotEmpty(getCity())){
            params.put("city", getCity());
        }
        if(isNotEmpty(getTown())){
            params.put("town", getTown());
        }
        if(isNotEmpty(getDistrict())){
            params.put("district", getDistrict());
        }
        if(isNotEmpty(getSector())){
            params.put("sector", getSector());
        }
        return params;
    }
}
