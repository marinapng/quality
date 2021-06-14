package com.main.quality.controller;

import com.main.quality.dto.PropertyDTO;
import com.main.quality.service.PropertyValuationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class PropertyValuationController {

        PropertyValuationService propertyValuationService;

        @Autowired
        public PropertyValuationController(PropertyValuationService propertyValuationService){
            this.propertyValuationService = propertyValuationService;
        }

        @PostMapping("/getHouseProperties")
        public PropertyDTO getHouseProperties(@Valid @RequestBody PropertyDTO houseRequest){
            return propertyValuationService.getHouseProperties(houseRequest);
        }

}
