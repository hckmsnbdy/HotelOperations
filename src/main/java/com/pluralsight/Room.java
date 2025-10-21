package com.pluralsight;

/**
 * The Room class is responsible for knowing everything related to a hotel room. A
 * room is only available if it is clean and not currently occupied. Create the class
 * with the following getters:
 * getNumberOfBeds() +
 * getPrice() +
 * isOccupied() +
 * isDirty() +
 * isAvailable()
 */

/**
 Modify the Room class to add checkIn(), checkout() and cleanroom()
 methods to the room.
 Once a room has been checked in, it should be occupied and marked as dirty.
 When a guest checks out of a room it must first be cleaned by a housekeeper
 before another guest can check into the room.
 */

public class Room {
    private int numberOfBeds;
    private boolean occupied, dirty,cleanRoom ,checkIn ,checkOut ;
    private double price;

    public Room(int numberOfBeds, boolean occupied, boolean dirty, double price,boolean checkIn, boolean checkOut, boolean cleanRoom) {
        this.numberOfBeds = numberOfBeds;
        this.occupied = occupied;
        this.dirty = dirty;
        this.price = price;
        this.cleanRoom = cleanRoom;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public boolean cleanRoom(){
        return cleanRoom();
    }

    public boolean checkOut(){
        return checkOut();
    }
    public boolean checkIn(){
        return checkIn();
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public boolean isOccupied() {
        if (checkIn){
        return this.occupied;
        } else {
            return !occupied;
        }
    }

    public boolean isDirty() {
        if (checkIn){
            return this.dirty;
        } else {
            return !dirty;
        }
    }

    public double getPrice() {
        return this.price;
    }

    public boolean isAvailable() {
        return (!this.dirty && !this.occupied);
    }

}