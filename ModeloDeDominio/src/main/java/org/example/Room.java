package org.example;

public class Room {
    private int number;
    private String name;
    private String type; // {Single, double, executive suit}
    private int floor;
    private String description;
    private double dailyRate;
    private double dimension; // {Square meters}

    public Room(int number, String type) {
        this.number = number;
        this.type = type;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getDailyRate() {
        return dailyRate;
    }

    public void setDailyRate(double dailyRate) {
        this.dailyRate = dailyRate;
    }

    public double getDimension() {
        return dimension;
    }

    public void setDimension(double dimension) {
        this.dimension = dimension;
    }
}
