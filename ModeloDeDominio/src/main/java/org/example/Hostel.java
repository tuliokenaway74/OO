package org.example;

import java.util.ArrayList;

public class Hostel {
    private ArrayList<Guest> guests;
    private ArrayList<Room> rooms;
    private ArrayList<Employee> employees;
    private Adress adress;
    private String name = "Sparkling Water";
    private String homepageAdress;
    private String description;
    private String inaugurationDate;
    private String contact;

    public Hostel() {
        this.rooms = new ArrayList<>();
        this.guests = new ArrayList<>();
    }

    public void addRoom(Room room) {
        rooms.add(room);
    }

    public void addGuest(Guest guest) {
        guests.add(guest);
    }
}
