package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Date;

public class ContractFileManager {
        // This method loads and reads the contracts.csv file
        public Contract getcontract() throws IOException {
            BufferedReader reader = new BufferedReader(new FileReader("contracts.csv"));
            String line = reader.readLine(); // First line = dealership info
            String[] contractInfo = line.split("\\|");
            Contract contract = new Contract();

            while ((line = reader.readLine()) != null) {
                String[] values = line.split("\\|");
                String contractType = values[0].trim();
                String date = values[1].trim();
                String customerName = values[2].trim();
                String customerEmail = values[3].trim();
                int vin = Integer.parseInt(values[4].trim());
                int year = Integer.parseInt(values[5].trim());
                String make = values[6].trim();
                String model = values[7].trim();
                String vehicleType = values[8].trim();
                String color = values[9].trim();
                int odometer = Integer.parseInt(values[10].trim());
                double price = Double.parseDouble(values[11].trim());

                if (contractType.equalsIgnoreCase("SALE")) {
                    double salesTax = Double.parseDouble(values[12].trim());
                    double recordingFee = Double.parseDouble(values[13].trim());
                    double processingFee = Double.parseDouble(values[14].trim());
                    boolean financeOption = Boolean.parseBoolean(values[15].trim());
                    double monthlyPayments = Double.parseDouble(values[16].trim());

                    contract = new SalesContract();
                } else if (contractType.equalsIgnoreCase("LEASE")) {
                    double expectedEndingValue = Double.parseDouble(values[12].trim());
                    double leaseFee = Double.parseDouble(values[13].trim());
                    int leaseTermMonths = Integer.parseInt(values[14].trim());

                    contract = new LeaseContract(date, customerName, customerEmail, vehicle,
                            expectedEndingValue, leaseFee, leaseTermMonths);
                } else {
                    continue; // Unknown contract type
                }

                contracts.add(contract);
            }


        // This method will overwrite the inventory.csv file with the current dealership information and inventory list.
        public void saveDealership(Dealership dealership) {
            // TODO: implement writing dealership and vehicles to inventory.csv
        }
    }

