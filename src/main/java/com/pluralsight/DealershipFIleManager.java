package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class DealershipFIleManager {
    //reading the dealership file
    //parsing the data

    // This method loads and reads the inventory.csv file
    public Dealership getDealership() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("inventory.csv"));
        String line;
        while ((line = reader.readLine()) != null) {
            String[] values = line.split("|");  //pipe delimiter
        }
        reader.close();
        return null;
    }
    //methods

    // Creating a Dealership object filled with vehicles from the file
    Dealership DBUsedCars = new Dealership(ArrayList<vehicles>);

    // This method will overwrite the inventory.csv file with the current dealership information and inventory list.
    public saveDealership(){

    }




}
