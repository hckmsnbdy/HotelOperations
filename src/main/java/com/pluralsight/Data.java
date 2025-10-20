package com.pluralsight;

public class Data {

    public Data() {
    }

    public static class room {
        int numberOfBeds;
        double price;
        boolean occupied;
        boolean dirty;
        boolean available;

        public int getNumberOfBeds() {
            return numberOfBeds;
        }

        public void setNumberOfBeds(int numberOfBeds) {
            this.numberOfBeds = numberOfBeds;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public boolean isOccupied() {
            return occupied;
        }

        public void setOccupied(boolean occupied) {
            this.occupied = occupied;
        }

        public boolean isDirty() {
            return dirty;
        }

        public void setDirty(boolean dirty) {
            this.dirty = dirty;
        }

        public boolean isAvailable() {
            return available;
        }

        public void setAvailable(boolean available) {
            this.available = available;
        }

        public room(int numberOfBeds, double price, boolean occupied, boolean dirty, boolean available) {
            this.numberOfBeds = numberOfBeds;
            this.price = price;
            this.occupied = occupied;
            this.dirty = dirty;
            this.available = available;
        }
    }
    public static class reservation{

        String roomType;
        int price;
        int numberOfNights;
        boolean weekend;
        double resevationTotal;

        public reservation(String roomType, int price, int numberOfNights, boolean weekend, double resevationTotal) {
            this.roomType = roomType;
            this.price = price;
            this.numberOfNights = numberOfNights;
            this.weekend = weekend;
            this.resevationTotal = resevationTotal;
        }

        public String getRoomType() {
            return roomType;
        }

        public void setRoomType(String roomType) {
            this.roomType = roomType;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        public int getNumberOfNights() {
            return numberOfNights;
        }

        public void setNumberOfNights(int numberOfNights) {
            this.numberOfNights = numberOfNights;
        }

        public boolean isWeekend() {
            return weekend;
        }

        public void setWeekend(boolean weekend) {
            this.weekend = weekend;
        }

        public double getResevationTotal() {
            return resevationTotal;
        }

        public void setResevationTotal(double resevationTotal) {
            this.resevationTotal = resevationTotal;
        }
    }
    private static class employee{
        String id;
        String name;
        String department;
        float payRate;
        float hoursWorked;
        double totalPay;
        double regularHours;
        double overtimeHours;

        public employee(String id, String name, String department, float payRate, float hoursWorked, double totalPay, double regularHours, double overtimeHours) {
            this.id = id;
            this.name = name;
            this.department = department;
            this.payRate = payRate;
            this.hoursWorked = hoursWorked;
            this.totalPay = totalPay;
            this.regularHours = regularHours;
            this.overtimeHours = overtimeHours;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDepartment() {
            return department;
        }

        public void setDepartment(String department) {
            this.department = department;
        }

        public float getPayRate() {
            return payRate;
        }

        public void setPayRate(float payRate) {
            this.payRate = payRate;
        }

        public float getHoursWorked() {
            return hoursWorked;
        }

        public void setHoursWorked(float hoursWorked) {
            this.hoursWorked = hoursWorked;
        }

        public double getTotalPay() {
            return totalPay;
        }

        public void setTotalPay(double totalPay) {
            this.totalPay = totalPay;
        }

        public double getRegularHours() {
            return regularHours;
        }

        public void setRegularHours(double regularHours) {
            this.regularHours = regularHours;
        }

        public double getOvertimeHours() {
            return overtimeHours;
        }

        public void setOvertimeHours(double overtimeHours) {
            this.overtimeHours = overtimeHours;
        }
    }
}
