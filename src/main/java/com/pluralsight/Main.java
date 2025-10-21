package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        Reservation r = new Reservation("King", 40, true);

        System.out.println(r.getReservationTotal());

        Room room = new Room(
                4,
                true,
                true,
                r.getReservationTotal(),
                true,
                false,
                true);
    }
}