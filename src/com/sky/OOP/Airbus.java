package com.sky.OOP;

public class Airbus extends AirPlane{
    public Airbus(String airlines, int mileage, int topSpeed, int passengerCapacity, int cost){
        setAirlines(airlines);
        setMileage(mileage);
        setTopSpeed(topSpeed);
        setPassengerCapacity(passengerCapacity);
        setCost(cost);
    }
}
