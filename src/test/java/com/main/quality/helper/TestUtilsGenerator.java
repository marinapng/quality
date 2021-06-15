package com.main.quality.helper;

import com.main.quality.dto.PropertyDTO;
import com.main.quality.entity.Room;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class TestUtilsGenerator {

    public static PropertyDTO getRequestDTO(){
        PropertyDTO p = new PropertyDTO();
        p.setName("Casa Teste");
        p.setDistrict("Trindade");
        p.setRooms(createRooms());
        return p;
    }

    private static List<Room> createRooms() {
        List<Room> rooms = new ArrayList<>();
        Room room1 = new Room("Quarto1", 2.0, 1.0);
        Room room2 = new Room("Quarto2", 1.0, 3.0);
        Room room3 = new Room("Quarto3", 2.0, 2.0);
        Room room4 = new Room("Quarto4", 2.0, 3.0);

        Collections.addAll(rooms, room1, room2, room3, room4);
        return rooms;
    }


}
