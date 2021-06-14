package com.main.quality.repository;

import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public class DistrictRepository {

    private final Map<String, Double> districts = Map.of(
            "Trindade", 24.0,
            "Pantanal", 22.5,
            "Campeche", 19.0,
            "Canasvieiras", 18.5,
            "Coqueiros", 17.0
    );

    public Map<String, Double> getDistricts(){
        return districts;
    }

    public Double getDistrictValue(String districtName){
        return districts.get(districtName);
    }

}
