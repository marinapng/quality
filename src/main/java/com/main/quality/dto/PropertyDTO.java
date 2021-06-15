package com.main.quality.dto;

import com.main.quality.entity.Room;
import lombok.Data;

import javax.validation.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.List;

@Data
public class PropertyDTO {

    @NotBlank(message = "The property's name can't be empty")
    @Size(max = 30, message = "The max length of the property's name is 30 characters")
    @Pattern(regexp = "[A-Z].*", message = "The first name should start with a capital character")
    String  name;


    @NotBlank(message = "The district's name can't be empty")
    @Size(max = 45, message = "The max length of the property district is 45")
    String district;


    @NotNull(message = "You must have at least one room in the property")
    @Size(min = 1)
    @Valid
    List<Room> rooms;

    Double totalArea;

    Double price;

    Room biggestRoom;








}
