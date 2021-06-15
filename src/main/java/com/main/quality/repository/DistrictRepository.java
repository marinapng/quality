package com.main.quality.repository;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class DistrictRepository {

    private final Map<String, Double> districts = new HashMap<>();

    public DistrictRepository(){
        districts.put("Trindade", 24.0);
        districts.put("Pantanal", 22.5);
        districts.put("Campeche", 19.0);
        districts.put("Canasvieiras", 18.5);
        districts.put("Coqueiros", 17.0);
    }

    public Map<String, Double> getDistricts(){
        return districts;
    }

    public Double getDistrictValue(String districtName){
        return districts.get(districtName);
    }

}
