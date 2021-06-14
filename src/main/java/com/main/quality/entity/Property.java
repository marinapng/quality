package com.main.quality.entity;

import lombok.Data;

import java.util.List;

@Data
public class Property {

    String name;

    String district;

    List<Room> rooms;

    public Property(String name, String district, List<Room> rooms){
        this.name = name;
        this.district = district;
        this.rooms = rooms;
    }

    public Double getArea(){
        Double area = 0.0;
        for(Room r : this.rooms){
            area += r.getArea();
        }
        return area;
    }

    public Room getBiggestRoom(){
        Room biggest = new Room("biggest", 0.0, 0.0);
        for(Room r : this.rooms){
            if(r.getArea() > biggest.getArea()){
                biggest = r;
            }
        }
        return biggest;
    }
}
