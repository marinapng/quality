package com.main.quality.service;

import com.main.quality.dto.PropertyDTO;
import com.main.quality.entity.Property;
import com.main.quality.repository.DistrictRepository;
import org.springframework.stereotype.Service;

@Service
public class PropertyValuationService {

    private final DistrictRepository districtRepository;

    public PropertyValuationService(DistrictRepository districtRepository){
        this.districtRepository = districtRepository;
    }

    public PropertyDTO getHouseProperties(PropertyDTO propertyRequest){
        Property h = new Property(propertyRequest.getName(), propertyRequest.getDistrict(), propertyRequest.getRooms());
        propertyRequest.setPrice(districtRepository.getDistrictValue(h.getDistrict()) * h.getArea());
        propertyRequest.setBiggestRoom(h.getBiggestRoom());
        propertyRequest.setTotalArea(h.getArea());

        return propertyRequest;
    }

}
