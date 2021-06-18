import java.util.Scanner;

public class InputProcessor {
    private Manager manager;
    private Scanner scanner = new Scanner(System.in);
    boolean runFirst = false;

    public InputProcessor(Manager manager) {
        this.manager = manager;
    }

    public void run() {
        if (!runFirst) {
            runFirst = true;
            manager.readLoggerFile();

        }
        manager.Fill();
        String getCommand = "";
        System.out.println("Enter the desired command:");
        getCommand = scanner.nextLine();
        String[] add = getCommand.split("\\s+");
        while (true) {

            boolean loginToAccount = true;//changed
            String userName, password;
//            if (add.length == 1 && add[0].equalsIgnoreCase("SIGNUP")) {
//                System.out.println("Enter a username : ");
//                userName = scanner.next();
//                //TODO
//                //continue;
//                System.out.println("Enter a password : ");
//                password = scanner.next();
//                loginToAccount = true;
//            } else if (add.length == 1 && add[0].equalsIgnoreCase("LOG IN")) {
//                System.out.println("Enter your username : ");
//                userName = scanner.next();
//                //TODO
//                //continue
//                System.out.println("Enter your password : ");
//                password = scanner.next();
//                //TODO
//                loginToAccount = true;
//            } else {
//                System.out.println("Unknown command!");
//            }
            if (loginToAccount) {
                System.out.println("Enter your command :");
                while (!getCommand.equalsIgnoreCase("LOG OUT")) {
                    getCommand = scanner.nextLine();
                    add = getCommand.split("\\s+");
                    if (add.length == 2 && add[0].equalsIgnoreCase("START") && add[1].matches("^[0-9]+$")) {
                        //TODO
                        //file
                        while (!getCommand.equalsIgnoreCase("EXIT")) {
                            getCommand = scanner.nextLine();
                            add = getCommand.split("\\s+");
                            if (add.length == 2 && add[0].equalsIgnoreCase("BUY")) {
                                manager.BuyAnimal(add[1]);
                            } else if (add.length == 3 && add[0].equalsIgnoreCase("PICKUP") && add[1].matches("^[0-9]+$") &&
                                    add[2].matches("^[0-9]+$")) {
                                manager.PickUp(Integer.parseInt(add[1]), Integer.parseInt(add[2]));
                            } else if (add.length == 1 && add[0].equalsIgnoreCase("WELL")) {
                                manager.Well();
                            } else if (add.length == 3 && add[0].equalsIgnoreCase("PLANT") && add[1].matches("^[0-9]+$") &&
                                    add[2].matches("^[0-9]+$")) {
                                manager.Plant(Integer.parseInt(add[1]), Integer.parseInt(add[2]));
                            }else if (add.length == 3 && add[0].equalsIgnoreCase("BUILD") &&
                                    add[1].equalsIgnoreCase("Workshop")) {
                                manager.BuildWorkShop(add[2]);
                            }else if (add.length == 2 && add[0].equalsIgnoreCase("WORK")) {
                                manager.Workshop(add[1]);
                            } else if (add.length == 3 && add[0].equalsIgnoreCase("CAGE") && add[1].matches("^[0-9]+$") &&
                                    add[2].matches("^[0-9]+$")) {
                                manager.Cage(Integer.parseInt(add[1]), Integer.parseInt(add[2]));
                            } else if (add.length == 2 && add[0].equalsIgnoreCase("TURN") && add[1].matches("^[0-9]+$")) {
                                manager.Turn(Integer.parseInt(add[1]));
                                manager.Inquiary();
                            } else if (add.length == 3 && add[0].equalsIgnoreCase("TRUCK") && add[1].equalsIgnoreCase("LOAD")) {
                                manager.TruckLoad(add[2]);} else if (add.length == 3 && add[0].equalsIgnoreCase("TRUCK") &&
                                    add[1].equalsIgnoreCase("UNLOAD")) {
                                manager.TruckUnload(add[2]);
                            } else if (add.length == 2 && add[0].equalsIgnoreCase("TRUCK") && add[1].equalsIgnoreCase("GO")) {
                                manager.TruckGo();
                            } else if (add.length == 1 && add[0].equalsIgnoreCase("MENU")) {
                                //TODO
                            }
                        }
                        manager.writeLoggerFile();
                    } else if (add.length == 1 && add[0].equalsIgnoreCase("SETTINGS")) {
                        //TODO
                    }


                }


            }


        }


    }
}