package com.main.quality.unit;

import com.main.quality.dto.PropertyDTO;
import com.main.quality.entity.Property;
import com.main.quality.helper.TestUtilsGenerator;
import com.main.quality.repository.DistrictRepository;
import com.main.quality.service.PropertyValuationService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class PropertyValuationServiceTest {

    @Mock
    DistrictRepository districtRepository;

    @InjectMocks
    PropertyValuationService propertyValuationService;

    PropertyDTO propertyDTO;

    @BeforeEach
    void init(){
        this.propertyDTO = TestUtilsGenerator.getRequestDTO();
    }

    @Test
    public void calculateTotalAreaTest() {
        Double expect = 15.0;
        Double result = propertyDTO.getTotalArea();
    }
}
