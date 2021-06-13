import java.util.Scanner;

public class InputProcessor {
    private Manager manager;
    private Scanner scanner = new Scanner(System.in);
boolean runn=false;
    public InputProcessor(Manager manager) {
        this.manager = manager;
    }

    public void run() {
        if(!runn){
            runn=true;
            manager.readloggerfile();

        }
        String getCommand = "";
        System.out.println("Enter the desired command:");
        getCommand = scanner.nextLine();
        String[] add = getCommand.split("\\s+");
        while (true) {
            boolean loginToAccount = false;
            String userName , password ;
            if (add.length == 1 && add[0].equalsIgnoreCase("SIGNUP")) {
                System.out.println("Enter a username : ");
                userName = scanner.next();
                //TODO
                System.out.println("Enter a password : ");
                password = scanner.next();
                //TODO
                loginToAccount = true;
            }
            else if(add.length == 1 && add[0].equalsIgnoreCase("LOG IN"))
            {
                System.out.println("Enter your username : ");
                userName = scanner.next();
                //TODO
                System.out.println("Enter your password : ");
                password = scanner.next();
                //TODO
                loginToAccount = true;
            }
            else {
                System.out.println("Unknown command!");
            }
            if (loginToAccount)
            {
             while (!getCommand.equals("LOG OUT"))
             {
                 getCommand = scanner.nextLine();
                 add = getCommand.split("\\s+");
                 if(add.length == 2 && add[0].equals("START") && add[1].matches("^[0-9]+$"))
                 {
                    //TODO
                    while (!getCommand.equals("EXIT")) {
                        getCommand = scanner.nextLine();
                        add = getCommand.split("\\s+");
                        if (add.length == 2 && add[0].equalsIgnoreCase("BUY")) {
                            manager.BuyAnimal(add[1]);
                        } else if (add.length == 3 && add[0].equals("PICKUP") && add[1].matches("^[0-9]+$") &&
                                add[2].matches("^[0-9]+$")) {
                            manager.PickUp(Integer.parseInt(add[1]),Integer.parseInt(add[2]));
                        } else if (add.length == 1 && add[0].equals("WELL")) {
                            manager.Well();
                        } else if (add.length == 3 && add[0].equals("PLANT") && add[1].matches("^[0-9]+$") &&
                                add[2].matches("^[0-9]+$")) {
                            manager.Plant(Integer.parseInt(add[1]),Integer.parseInt(add[2]));
                        } else if (add.length == 2 && add[0].equals("WORK")) {
                            //TODO
                        } else if (add.length == 3 && add[0].equals("CAGE") && add[1].matches("^[0-9]+$") &&
                                add[2].matches("^[0-9]+$")) {
                            manager.Cage(Integer.parseInt(add[1]),Integer.parseInt(add[2]));
                        } else if (add.length == 2 && add[0].equals("TURN") && add[1].matches("^[0-9]+$")) {
                            //TODO
                        } else if (add.length == 3 && add[0].equals("TRUCK") && add[1].equals("LOAD")) {
                            manager.TruckLoad(add[2]);
                        } else if (add.length == 3 && add[0].equals("TRUCK") && add[1].equals("UNLOAD")) {
                            manager.TruckUnload(add[2]);
                        } else if (add.length == 2 && add[0].equals("TRUCK") && add[1].equals("GO")) {
                            manager.TruckGo();
                        } else if (add.length == 1 && add[0].equals("MENU")) {
                            //TODO
                        }
                    }
                    }
                 else if(add.length == 1 && add[0].equals("SETTINGS"))
                 {
                     //TODO
                 }


             }




            }







        }


    }
}
