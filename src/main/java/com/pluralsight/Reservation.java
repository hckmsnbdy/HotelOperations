package com.pluralsight;

/**
 * Reservation
 * The Reservation class is responsible for storing information related to a guest
 * stay.
 * Determine which backing variables you need to create and create a constructor to
 * set initial values.
 * The room type can be either "king" or "double". If the room type is "king" the
 * price per night is $139.00 if the room type is "double" the price per night is
 * $124.00
 * If the stay is over a weekend, the price per night should increase by 10%
 * Create the class with the following getters and setters:
 * getRoomType() +
 * setRoomType(String roomType) +
 * getPrice() +
 * getNumberOfNights() +
 * setNumberOfNights(int numberOfNights) +
 * isWeekend() +
 * setIsWeekend(boolean isWeekend) +
 * getReservationTotal() +
 */
public class Reservation {
    private String roomType;
    private double price;
    private int numberOfNights;
    private boolean isWeekend;

    public Reservation(String roomType, int numberOfNights, boolean isWeekend) {
        this.roomType = roomType.trim(); //Either "King" or "Double"

        if (roomType.toLowerCase().equals("king")) {
            this.price = 139.00;
        } else {
            this.price = 124.00;
        }

        this.numberOfNights = numberOfNights;
        this.isWeekend = isWeekend;
    }

    public double getPrice() {
        return price;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;

        if (roomType.toLowerCase().equals("king")) {
            this.price = 139.00;
        } else  {
            this.price = 124.00;
        }
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public boolean isWeekend() {
        return isWeekend;
    }

    public void setWeekend(boolean weekend) {
        isWeekend = weekend;
    }

    public double getReservationTotal() {
        double upCharge = this.price; //upCharge stays the same when it's not a weekend reservation

        if (this.isWeekend) {
            upCharge *= 1.1;
        }

        return this.numberOfNights * upCharge;
    }
}