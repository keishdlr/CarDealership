package com.pluralsight;

public class UserInterface {
    // responsible for all output to the screen
    // reading of user input
    // "dispatching" of the commands to the Dealership

    // dealership: Dealership

    //constructor
    public UserInterface() {
    }

    //Methods
    private void init(){
        //create dealership object
        //instance of dealershiofilemanager
        //call its get dealership method
        //assign the dealership that it returns to the userinterface this.dealership attribute
    }

    public void display(){
        //call a private init() that loads the dealership
        init();
        System.out.println("Welcome to D & B Used Cars Dealerships");

        //loop with menu display, read user command, switch statement
    }


    //processes methods
    public processGetByPriceRequest(){
        return ;
    }

    public processGetByMakeModelRequest(){

    }
    public processGetByYearRequest(){

    }
    public processGetByColorRequest(){

    }
    public processGetByMileage(){

    }
    public processGetByVehicleType(){

    }
    public processGetAllVehicleRequest(){

    }
    public processAddVehicleRequest(){
        //call the dealership getAllvehicles method
        //call the displayVeicles(list returned from getallvehicles) helper method
    }
    public processRemoveVehicleRequest(){

    }
}
