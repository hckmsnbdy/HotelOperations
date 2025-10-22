package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class RoomTest {

    @org.junit.jupiter.api.Test
    void checkIn() {
        // arrange
        Room testRoom = new Room(5, 100);

        // act
        testRoom.checkIn();

        // assert
        assertTrue(testRoom.isOccupied());
        assertTrue(testRoom.isDirty());

    }
    @Test
    void checkOut(){
        // arrange
        Room testRoom = new Room(5, 100);

        // act
        testRoom.checkOut();

        // assert
        assertFalse(testRoom.isOccupied());

    }

    @Test
    void cleanRoom() {
        // arrange
        Room testRoom = new Room(5, 100);

        // act
        testRoom.cleanRoom();

        // assert
        assertFalse(testRoom.isDirty());
    }
}