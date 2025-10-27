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
        while (true) { // excecute loop as long as condition is true

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

            // Menu
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

            Scanner Myscanner = new Scanner(System.in);
            String selection = Myscanner.nextLine().toUpperCase();
            switch (selection) {
                case "A":
                    break;
                case "B":
                    break;
                case "C":
                    break;
                case "D":
                    break;
                case "E":
                    break;
                case "F":
                    break;
                case "G":
                    List<Vehicle> allVehicles = dealership.getAllVehicles(); // however you retrieve them
                    displayVehicles(allVehicles);

                    break;
                case "H":
                    break;
                case "I":
                    break;
                case "X":
                    System.exit(0);           // if X is selected then it will exit the program
                default:
                    System.out.println("Invalid input. Try again");
            }
        }
        }

    }
    // helper method to be used above
    private static void  displayVehicles(List<Vehicle> vehicles) {
        if (vehicles == null || vehicles.isEmpty()) {
            System.out.println("No vehicles found");
            return;
        }
        System.out.println("~~~~~~ Vehicle List ~~~~~~");
        for (Vehicle v : vehicles) {
            System.out.println(v);
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

    return;
    }
    public void processAddVehicleRequest(){
        //call the dealership getAllvehicles method
        //call the displayVeicles(list returned from getallvehicles) helper method
    return;
    }
    public void processRemoveVehicleRequest(){

    return;
    }
