package com.pluralsight;

import java.time.LocalTime;

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

        Employee e = new Employee(1,
                "x",
                "cleaning",
                7.25f,
                45,
                8.30f,
                4.30f);
        System.out.printf("pi: %f po: %f",e.punchIn() , e.punchOut());
    }

}