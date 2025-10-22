package com.pluralsight;

public class Main {

    public static void main(String[] args) {

        Employee eldar = new Employee(1, "Omer", "R&D", 40.50, 0);

        eldar.punchTimeCard(8.30);

        eldar.punchTimeCard(04.30);

        System.out.println(eldar.getRegularHours());
        System.out.println(eldar.getTotalPay());
    }
}