package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    void punchIn() {
        // arrange
        Employee testEmployee = new Employee(1, "Omer", "R&D", 40, 0);

        // act
        testEmployee.punchIn(9);
        testEmployee.punchOut(17);

        // assert
        assertEquals(8, testEmployee.getRegularHours());


    }

}