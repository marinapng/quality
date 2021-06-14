package com.main.quality.entity;

import lombok.Data;

import javax.validation.Valid;
import javax.validation.constraints.*;

@Data
@Valid
public class Room {

    @NotBlank(message = "The room's name can't be empty")
    @Size(max = 30, message = "The maximum length of property name is 30")
    @Pattern(regexp = "[A-Z].*", message = "The room's first name should start with a capital character")
    String name;

    @NotNull(message = "You must fill the room's width")
    @Max(value = 25, message = "The max length of the width is 25")
    @Min(value = 1, message = "The width should be at least 1")
    Double width;

    @NotNull(message = "You must fill the room's length")
    @Max(value = 33, message = "The max length of the length is 33")
    @Min(value = 1, message = "The length should be at least 1")
    Double length;

    Double area;

    public Room(String name, Double width, Double length){
        this.name = name;
        this.width = width;
        this.length = length;
    }

    public Double getArea(){
        this.area = this.length * this.width;
        return this.area;
    }

}
