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
 + Once a room has been checked in, it should be occupied and marked as dirty.
 - When a guest checks out of a room it must first be cleaned by a housekeeper
 before another guest can check into the room.
 */

public class Room {
    private int numberOfBeds;
    private boolean occupied, dirty;
    private double price;

    public Room(int numberOfBeds, boolean occupied, boolean dirty, double price) {
        this.numberOfBeds = numberOfBeds;
        this.occupied = occupied;
        this.dirty = dirty;
        this.price = price;
    }

    public boolean cleanRoom(){
//        if (dirty){
            dirty=false;
//            return true;
//        }
//        else {
            return true;
//        }
    }

    public boolean checkOut(){
        if(occupied){
            occupied=false;
            dirty = true;
            return true;
        }else {
        return false;}
    }

    public boolean checkIn(){
        if(!this.dirty && !this.occupied){
            occupied=true;
            dirty = true;
            return true;
        }else {
        return false;}
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public boolean isOccupied() {
            return occupied;
    }

    public boolean isDirty() {
            return dirty;

    }

    public double getPrice() {
        return this.price;
    }

    public boolean isAvailable() {
        return (!this.dirty && !this.occupied);
    }
}