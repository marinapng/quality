package com.main.quality.unit;

import com.main.quality.dto.PropertyDTO;
import com.main.quality.entity.Property;
import com.main.quality.entity.Room;
import com.main.quality.helper.TestUtilsGenerator;
import com.main.quality.repository.DistrictRepository;
import com.main.quality.service.PropertyValuationService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class PropertyValuationServiceTest {

    @InjectMocks
    PropertyValuationService propertyValuationService;

    @Mock
    DistrictRepository mockDistrictRepository;

    PropertyDTO propertyDTO;

    @BeforeEach
    void init(){
        this.propertyDTO = TestUtilsGenerator.getRequestDTO();
    }

    @Test
    public void calculatePropertyTotalAreaTest(){
        Double expected = 15.0;
        Property p = new Property(propertyDTO.getName(), propertyDTO.getDistrict(), propertyDTO.getRooms());
        Double result = p.getArea();
        assertEquals(expected, result);
    }

    @Test
    public void calculateBiggestRoomTest(){
        Room expected = propertyDTO.getRooms().get(3);
        Property p = new Property(propertyDTO.getName(), propertyDTO.getDistrict(), propertyDTO.getRooms());
        Room result =  p.getBiggestRoom();
        assertEquals(expected, result);
    }

    @Test
    public void calculatePropertyValue(){
        Double expected = 360.0;
        Property p = new Property(propertyDTO.getName(), propertyDTO.getDistrict(), propertyDTO.getRooms());
        Double result = p.getArea() * mockDistrictRepository.getDistrictValue(p.getDistrict());
        assertEquals(expected, result);
    }

    @Test
    public void calculateEachRoomAreaTest(){
        List<Room> expected = propertyDTO.getRooms();
        expected.get(0).setArea(2.0);
        expected.get(1).setArea(3.0);
        expected.get(2).setArea(4.0);
        expected.get(3).setArea(6.0);
        Property p = new Property(propertyDTO.getName(), propertyDTO.getDistrict(), propertyDTO.getRooms());
        p.getArea();
        List<Room> result = p.getRooms();
        assertEquals(expected, result);
    }

    @Test
    public void findDistrictValueTest(){
        Double districtPrice = 24.0;
        Double districtPriceFound = mockDistrictRepository.getDistrictValue(propertyDTO.getDistrict());
        assertEquals(districtPrice, districtPriceFound);
    }

}
