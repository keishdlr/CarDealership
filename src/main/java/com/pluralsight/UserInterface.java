package com.pluralsight;

import java.util.List;
import java.util.Scanner;

public class UserInterface {
    // responsible for all output to the screen
    // reading of user input
    // "dispatching" of the commands to the Dealership

    //variables
    private Dealership dealership;

    //constructor
    public UserInterface() {
    }

    // helper method to be used above
    private static void  displayVehicles(List<Vehicle> list) {
        if (list == null || list.isEmpty()) {
            System.out.println("No list found");
            return;
        }
        System.out.println("~~~~~~ Vehicle List ~~~~~~");
        for (Vehicle v : list) {
            System.out.println(v); //output will be in the format seen in the vehicle class
        }
    }

    //Methods
    private void init(){
        //create dealership object
        //assign the dealership that it returns to the userinterface this.dealership attribute
        DealershipFIleManager Dealership = new DealershipFIleManager();  //create instance of dealershiofilemanager
        DealershipFIleManager.getdealership();  //call its get dealership method
        this.dealership = Dealership.getDealership(); //assigns the dealership that returns to the  this.dealership attribute

    }

    public void display(){
        //call a private init() that loads the dealership
        init();
        System.out.println("Welcome to D & B Used Cars Dealerships");

        //loop with menu display, read user command, switch statement
        while (true) { // execute loop as long as condition is true

            // art
            System.out.println("                                                                                         \n" +
                    "                                                          ##***********#:::::-                      \n" +
                    "                                             ****###********##%@@@%***=:#**%%%%#%#*=                \n" +
                    "                                         **#**++==****+*#%%%@@@%####**.***###*%###%##*-             \n" +
                    "                                     %#***==--+****#%%%%%%%%%*++++*+#.-####*##%##*===*=+=           \n" +
                    "                                  @%##*+=--=+###*+*#%%%%%%#%%%%%@@##+.#%%**+==+#*+===+*==#:         \n" +
                    "                                @#***===+*++***#+*%%%@%@%%%#%%%%*%%+.-%=:..:----+*++++++=+-.:       \n" +
                    "                            .=%***+=+++*******++==+++++=====--:::-:::#%#@**####++====---::.....:    \n" +
                    "                        -=----:-=:.::::::::::::----:.......:.:::::::::::-++=:::::-::::::.:-+::::.=  \n" +
                    "               ...:--:::::::::::::::::::--::.........:::::::::::::::::::::-**+=--+*--::::::-:::::+  \n" +
                    "          ::::::::::::::::::::::::::.............::::::::::::::::#%%%*::::::=+-:::::::::::::::::::- \n" +
                    "       ::::::::-------.:::-----:...........*%#**#%#-:::::::::----:#@%+:::::--=+-----:-------:-%@=:- \n" +
                    "    ++:::::::::::=::::::::........-++==++=+=#%%#-%%#++:::.=*@@@%=----------=====-----=====---%###=- \n" +
                    "  =-=#:*@@@@@@@%-*@@%@#@#%%#@=::-+#%%*%#=+#+%##**=+::::::=@%###*@*---=================------+#@#%*- \n" +
                    "  =-*#-%%%@@%%@@+@%@%@%%@%@%@=:--+-+#%#*-**+-:....::::::=*%%%%@##%*--=======-============-=-#%#@@%= \n" +
                    " :....-*%@@@%@@%=%%@%@%@@%@@+--......:::::::---------::=*%#@@%%%%#%--===============------=-%%#%@%# \n" +
                    " -------=%%%%%%#-=%####%@%---------------------------:-@*%@%@%#%@%#========-------:::::::*+-#%#@@%# \n" +
                    "--:----=-----------------------------::::::::---------=#%%#@###@%##+=-----------::==+*=-::-=%%%%%## \n" +
                    "-----------------------------------::--::::::---------@#@%@#%@%#%%%==-------+*+*=-:::::--++#%@#%@%= \n" +
                    " #%@@@@+-++**+++=====----::.:=*####@@@@@@%@%=--------=##@%@@##+%%#%==++=++==-:::-+++##%@@@@@%@%*#*  \n" +
                    " *#%@@%-+*@@%@@%@%@%%@%%@%%@*::::-+*@@@@@%@%@=-------+%#%%%@%#%@@##=+=---=+##%@@        @@@%%%%%#=  \n" +
                    " *#@@%%=-%%%%%%%@%@%%@%%%@%%@=-:---:+#####%%%--------=%#%%%@#@#@%%*+%@@                             \n" +
                    " *###%%*:::::-==+++******+++===+###%#####%%%%+------=*%%%@%@#@@%%#%                                 \n" +
                    " *#%#%@@%%%%%%%%%%####%%%%%%@@@@@@@****+*#%%%%%%%%%#%%@%%%%%%%@%%%@                                 \n" +
                    "          @@@@@@@@@%%%%%%%%%%%%%%#%%%%%%@@@@@@@@     @@@%%@@%%#%%%%                                 \n" +
                    "                                                       @@@@@%%%#                                    \n" +
                    "                                                                                                    \n" +
                    "                                                                                                    "
            );

            // Menu turn this into a helper method
            System.out.println("-----Home Screen-----");
            System.out.println("    A) Filter by Price              ");
            System.out.println("    B) Filter by Make and Model     ");
            System.out.println("    C) Filter by Year               ");
            System.out.println("    D) Filter by Color              ");
            System.out.println("    E) Filter by Mileage            ");
            System.out.println("    F) Filter by Vehicle Type       ");
            System.out.println("    G) All Vehicle                  ");
            System.out.println("    H) Add Vehicle                  ");
            System.out.println("    I) Remove Vehicle               ");
            System.out.println("    X) Exit                         ");

            // with helper method
            Scanner Myscanner = new Scanner(System.in); //user input
            String selection = Myscanner.nextLine().toUpperCase(); // turns user input to uppercase
            switch (selection) {
                case "A":
                    List<Vehicle> getVehiclesByPrice = dealership.getVehiclesByPrice();
                    break;
                case "B":
                    List<Vehicle> getVehicleByMakeModel = dealership.getvehiclesByMakeModel();
                    break;
                case "C":
                    List<Vehicle> getVehicleByYear = dealership.getvehiclesByYear();
                    break;
                case "D":
                    List<Vehicle> getVehicleByColor = dealership.getvehiclesByColor();
                    break;
                case "E":
                    List<Vehicle> getVehicleByMileage = dealership.getvehiclesByMilage();
                    break;
                case "F":
                    List<Vehicle> getVehicleByType = dealership.getvehiclesByType();
                    break;
                case "G":
                    List<Vehicle> allVehicles = dealership.getAllVehicles();
                    displayVehicles(allVehicles);

                    break;
                case "H":
                    Scanner input = new Scanner(System.in);

                    System.out.println("Enter VIN:"); //optional check: add checks to 1) ensure vin doesn't already exist
                                                                                    // 2) ensure a valid input
                    int vin = Integer.parseInt(input.nextLine());

                    System.out.println("Enter Year:");
                    int year = Integer.parseInt(input.nextLine());

                    System.out.println("Enter Make:");
                    String make = input.nextLine();

                    System.out.println("Enter Model:");
                    String model = input.nextLine();

                    System.out.println("Enter Vehicle Type:");
                    String type = input.nextLine();

                    System.out.println("Enter Color:");
                    String color = input.nextLine();

                    System.out.println("Enter Odometer Reading:");
                    int odometer = Integer.parseInt(input.nextLine());

                    System.out.println("Enter Price:");
                    double price = Double.parseDouble(input.nextLine());

                    Vehicle newVehicle = new Vehicle(vin, year, make, model, type, color, odometer, price);
                    dealership.addVehicle(newVehicle());

                    DealershipFIleManager.saveDealership(dealership); //method to save vehicle to CSV file

                    System.out.println("✅🚘Vehicle added successfully!");
                    break;
                case "I":
                    System.out.println("Enter the VIN of the vehicle to remove:");
                    int vinToRemove = Integer.parseInt(Myscanner.nextLine());

                    // Finds the vehicle in inventory
                    Vehicle vehicleToRemove = null; // initializes a variable that will hold the vin if found
                    for (Vehicle v : dealership.getAllVehicles()) { // loops through the vehicles
                        if (v.getVin() == vinToRemove) { // checks for a match
                            vehicleToRemove = v; // stores the match found in vehicleToRemove
                            break; /// can end loop, no need to search for any other identifier
                        }
                    }
                    if (vehicleToRemove != null) { //if true match found
                        dealership.removeVehicle(vehicleToRemove); // calls the method to remove
                        System.out.println("✅ Vehicle removed successfully."); // gives the user confirmation
                    } else {
                        System.out.println("⚠️ Vehicle with VIN " + vinToRemove + " not found.");
                    }
                    break;
                case "X":
                    System.exit(0);  // if X is selected then it will exit the program
                default:
                    System.out.println("Invalid input. Try again");
            }
        }
        }

    //processes methods
    public void processGetByPriceRequest(){
        return ;
    }

    public void processGetByMakeModelRequest(){
    return;
    }

    public void processGetByYearRequest(){

    return;
    }

    public void processGetByColorRequest(){

    return;
    }

    public void processGetByMileage(){

    return;
    }

    public void processGetByVehicleType(){

    return;
    }

    public void processGetAllVehicleRequest(){
        dealership.getAllVehicles();
            return displayVehicles(List <Vehicle> List);
    }

    public void processAddVehicleRequest(){
        //call the dealership getAllvehicles method
        //call the displayVeicles(list returned from getallvehicles) helper method

    return;
    }

    public void processRemoveVehicleRequest(){

    return;
    }
}
