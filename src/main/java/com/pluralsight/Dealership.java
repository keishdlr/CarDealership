package com.pluralsight;

import java.util.List;

public class Dealership {
    String name;
    String address;
    String phoneNumber;

    //inventory: arrayList<Vehicle>

    //constructor
    public Dealership(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    //getters
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    //setters

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // derived getters
    getVehiclesByPrice(min,max): List<Vehicle>;
    getvehiclesByMakeModel(make,model: List<Vehicle>);
    getvehiclesByYear(min,max): List<Vehicle>;
    getvehiclesByColor(color): List<Vehicle>;
    getvehiclesByMilage(min, max): List<Vehicle>;
    getvehiclesByType(vehicleType): List<Vehicle>;
    getAllVehicles(): List<Vehicle>;

    //other methods
    addVehicle(vehicle);

    removeVehicle(vehicle);