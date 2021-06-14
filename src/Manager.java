import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Manager<pubilc> {
    public ArrayList<DomesticAnimal> domestics = new ArrayList<>();
    public ArrayList<WildAnimal> Wilds = new ArrayList<>();
    public ArrayList<DefenderAnimal> Defenders = new ArrayList<>();
    public ArrayList<DomesticAnimal> allDomestics = new ArrayList<>();
    public ArrayList<WildAnimal> allWilds = new ArrayList<>();
    public ArrayList<DefenderAnimal> allDefenders = new ArrayList<>();
    public ArrayList<Cage> cages = new ArrayList<>();
    Bank bank = new Bank(1000);
    ArrayList<String> Logger = new ArrayList<>();
    public ArrayList<Labratory> labratories = new ArrayList<>();
    public ArrayList<Product> products = new ArrayList<>();
    WareHouse wareHouse = new WareHouse();
    int Grass[][] = new int[6][6];
    public ArrayList<HameKare> CurrentCages = new ArrayList<>();
    int level;
    static int turn = 0;
    Truck truck = new Truck();
    WaterWell well = new WaterWell();
    //TODO
//filing the arraylist of each class that is needed
    public void FillTheGrass() {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                Grass[i][j] = 0;
            }
        }
        LocalDateTime w=LocalDateTime.now();
        Logger.add(w.toString()+"  "+"the grass has been filled by 0");
    }

    public void BuyAnimal(String name) {
        int t=0;
   for(int i=0;i<domestics.size();i++){
       if(domestics.get(i).getNameOfAnimal().equalsIgnoreCase(name)){
           if(bank.getCoin()>=domestics.get(i).getPrice()){
               t=1;
               bank.setCoin(bank.getCoin()-domestics.get(i).getPrice());
           }
       }
   }
   if(t==1){
       if(name.equalsIgnoreCase("hen")){
//TODO
       }
       if(name.equalsIgnoreCase("hen")){
           Hen hen=new Hen();
           allDomestics.add(hen);
       }
       if(name.equalsIgnoreCase("hen")){

       }

       if(name.equalsIgnoreCase("dog")){
           Dog dog=new Dog();
           allDefenders.add(dog);
       }

       if(name.equalsIgnoreCase("cat")){
           Cat cat=new Cat();
           allDefenders.add(cat);
       }
       LocalDateTime w=LocalDateTime.now();
       Logger.add(w.toString()+"  "+"the animal has been bought");
   }
    }

    public void Well() {
        if (well.getCapacity() == 0) {
            well.setCapacity(5);
        } else System.out.println("the water well is already not empty");
        LocalDateTime w=LocalDateTime.now();
        Logger.add(w.toString()+"  "+"the well has been filled");
    }

    public void Plant(int x, int y) {
        if (well.getCapacity() > 0) {
            Grass[x][y] += 1;
            well.setCapacity(well.getCapacity() - 1);
        } else System.out.println("the water well is empty");
        LocalDateTime w=LocalDateTime.now();
        Logger.add(w.toString()+"  "+"the grass has been planted");
    }

    public void Workshop(String name) {
        for (int i = 0; i < labratories.size(); i++) {
            if (labratories.get(i).getName().equalsIgnoreCase(name)) {
                if (labratories.get(i).IsBuyed) {
                    labratories.get(i).Active = true;
                }
            }
        }
        LocalDateTime w=LocalDateTime.now();
        Logger.add(w.toString()+"  "+"the workshop has been actived");
    }

    public void BuildWorkShop(String name) {
        for (int i = 0; i < labratories.size(); i++) {
            if (labratories.get(i).getName().equalsIgnoreCase(name)) {
                if(bank.getCoin()>=labratories.get(i).getPrice()){
                    labratories.get(i).IsBuyed = true;
                    bank.setCoin(bank.getCoin()-labratories.get(i).getPrice());
                    LocalDateTime w=LocalDateTime.now();
                    Logger.add(w.toString()+"  "+"the workshop has been built");
                }
            }
        }

    }

    public void PickUp(int x, int y) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getX_position() == x && products.get(i).getY_position() == y) {
                if (AddToWareHouse(products.get(i))) {
                   products.remove(i);
                   i--;
                    LocalDateTime w=LocalDateTime.now();
                    Logger.add(w.toString()+"  "+"the good has been picked up");
                }
            }
        }

    }

    public void TruckLoad(String name) {
        if (!truck.Active) {
            for (int i = 0; i < wareHouse.products.size(); i++) {
                if (wareHouse.products.get(i).getNameOfProduct().equalsIgnoreCase(name)) {
                    if (truck.getAvailableCapacity() >= wareHouse.products.get(i).getSizeInWarehouse()) {
                        truck.setAvailableCapacity(truck.getAvailableCapacity() - wareHouse.products.get(i).getSizeInWarehouse());
                        truck.allgood.add(name);
                        truck.setMoney(truck.getMoney() + wareHouse.products.get(i).getPrice());
                        wareHouse.products.remove(i);
                        LocalDateTime w=LocalDateTime.now();
                        Logger.add(w.toString()+"  "+"the truck has been loaded");
                        i--;
                        break;
                    }
                }
            }
            for (int i = 0; i < wareHouse.animals.size(); i++) {
                if (wareHouse.animals.get(i).getNameOfAnimal().equalsIgnoreCase(name)) {
                    if (truck.getAvailableCapacity() >= wareHouse.animals.get(i).getSizaInWareHouse()) {
                        truck.setAvailableCapacity(truck.getAvailableCapacity() - wareHouse.animals.get(i).getSizaInWareHouse());
                        truck.allgood.add(name);
                        truck.setMoney(truck.getMoney() + wareHouse.animals.get(i).getPrice());
                        wareHouse.animals.remove(i);
                        i--;
                        LocalDateTime w=LocalDateTime.now();
                        Logger.add(w.toString()+"  "+"the truck has been loaded");
                        break;
                    }
                }
            }
        }

    }

    public void TruckUnload(String name) {
        if (!truck.Active) {
            for (int i = 0; i < truck.allgood.size(); i++) {
                if (truck.allgood.get(i).equalsIgnoreCase(name)) {
                    //TODO
                    //generate the good to the warehouselist
                    Hen hen=new Hen();
                    wareHouse.animals.add(hen);
                    truck.allgood.remove(i);
                    break;
                }
            }
        }
        LocalDateTime w=LocalDateTime.now();
        Logger.add(w.toString()+"  "+"the truck has been unloaded:)");
    }

    public void TruckGo() {
        truck.Active = true;
        truck.setEndedTime(turn + 10);
        LocalDateTime w=LocalDateTime.now();
        Logger.add(w.toString()+"  "+"truck has gone");
    }

    public void ProductProcessing() {
        for (int i = 0; i < labratories.size(); i++) {
            if (labratories.get(i).isActive()) {
                labratories.get(i).setCurrentTime(labratories.get(i).getCurrentTime() - 1);
            }
            if (labratories.get(i).getCurrentTime() == 0) {
                labratories.get(i).setActive(false);
                String primaryProduct = "";
                if (labratories.get(i) instanceof FlourFactory)
                    primaryProduct = "Egg";
                else if (labratories.get(i) instanceof WeavingFactory)
                    primaryProduct = "Feather";
                else if (labratories.get(i) instanceof MilkPackagingFactory)
                    primaryProduct = "Milk";
                else if (labratories.get(i) instanceof Bakery)
                    primaryProduct = "Flour";
                else if (labratories.get(i) instanceof Tailoring)
                    primaryProduct = "Cloth";
                else if (labratories.get(i) instanceof IceCreamShop)
                    primaryProduct = "PackagedMilk";

                boolean IsFoundPrimaryProduct = false;
                for (int j = 0; j < products.size(); j++) {
                    if (primaryProduct.equals("Egg")) {
                        if (products.get(i) instanceof Egg) {
                            products.remove(i);
                            IsFoundPrimaryProduct = true;
                            break;
                        }
                    } else if (primaryProduct.equals("Feather")) {
                        if (products.get(i) instanceof Feather) {
                            products.remove(i);
                            IsFoundPrimaryProduct = true;
                            break;
                        }
                    } else if (primaryProduct.equals("Milk")) {
                        if (products.get(i) instanceof Milk) {
                            products.remove(i);
                            IsFoundPrimaryProduct = true;
                            break;
                        }
                    } else if (primaryProduct.equals("Flour")) {
                        if (products.get(i) instanceof Flour) {
                            products.remove(i);
                            IsFoundPrimaryProduct = true;
                            break;
                        }
                    } else if (primaryProduct.equals("Cloth")) {
                        if (products.get(i) instanceof Cloth) {
                            products.remove(i);
                            IsFoundPrimaryProduct = true;
                            break;
                        }
                    } else if (primaryProduct.equals("PackagedMilk")) {
                        if (products.get(i) instanceof PackagedMilk) {
                            products.remove(i);
                            IsFoundPrimaryProduct = true;
                            break;
                        }
                    }
                }
                if (!IsFoundPrimaryProduct) {
                    System.out.println("We have no " + primaryProduct + " in ware house to provide flour");
                } else if (wareHouse.getAllCapacity() <= 30) {
                    if (primaryProduct.equals("Egg")) {
                        products.add(new Flour(Flour.timeOfCorrupting, labratories.get(i).getX_Positin(),
                                labratories.get(i).getY_Position(), false));
                    } else if (primaryProduct.equals("Feather")) {
                        products.add(new Cloth(Cloth.timeOfCorrupting, labratories.get(i).getX_Positin(),
                                labratories.get(i).getY_Position(), false));
                    } else if (primaryProduct.equals("Milk")) {
                        products.add(new PackagedMilk(PackagedMilk.timeOfCorrupting, labratories.get(i).getX_Positin(),
                                labratories.get(i).getY_Position(), false));
                    } else if (primaryProduct.equals("Flour")) {
                        products.add(new Bread(Bread.timeOfCorrupting, labratories.get(i).getX_Positin(),
                                labratories.get(i).getY_Position(), false));
                    } else if (primaryProduct.equals("Cloth")) {
                        products.add(new Shirt(Shirt.timeOfCorrupting, labratories.get(i).getX_Positin(),
                                labratories.get(i).getY_Position(), false));

                    } else if (primaryProduct.equals("PackagedMilk")) {
                        products.add(new IceCream(IceCream.timeOfCorrupting, labratories.get(i).getX_Positin(),
                                labratories.get(i).getY_Position(), false));

                    }
                }
            } else System.out.println("We have not enough storage in ware house");
        }
        LocalDateTime w=LocalDateTime.now();
        Logger.add(w.toString()+"  "+"the product is generating");
    }

    public void RemoveDeadAnimals() {
        for (int i = 0; i < domestics.size(); i++) {
            domestics.get(i).setCurrentTime(domestics.get(i).getCurrentTime() - 1);
            if (domestics.get(i).getCurrentTime() <= 0)
                domestics.remove(i);
            i--;
        }
        LocalDateTime w=LocalDateTime.now();
        Logger.add(w.toString()+"  "+"the dead animal has been removed");
    }

    public void RemoveCorruptProducts() {
        for (int i = 0; i < products.size(); i++) {
            products.get(i).setCurrentTime(products.get(i).getCurrentTime() - 1);
            if (products.get(i).getCurrentTime() == 0)
                products.remove(i);
            i--;
            LocalDateTime w=LocalDateTime.now();
            Logger.add(w.toString()+"  "+"the dead product has been removed");
        }

    }

    public void ProducingProduct() {
        for (int i = 0; i < allDomestics.size(); i++) {
            allDomestics.get(i).setProductcurrenttime(allDomestics.get(i).getProductcurrenttime() - 1);

            if (allDomestics.get(i).getProductcurrenttime() == 0) {
                switch (allDomestics.get(i).getNameOfAnimal()) {
                    case "Hen":
                        products.add(new Egg(Egg.Time, allDomestics.get(i).X_position,
                                allDomestics.get(i).Y_position, false));
                        break;
                    case "Ostrich":
                        products.add(new Feather(Feather.Time, allDomestics.get(i).X_position,
                                allDomestics.get(i).Y_position, false));
                        break;
                    case "Sheep":
                        products.add(new Milk(Milk.Time, allDomestics.get(i).X_position,
                                allDomestics.get(i).Y_position, false));
                        break;
                }
                allDomestics.get(i).setProductcurrenttime(allDomestics.get(i).getProductcurrenttime());
            }
        }

        LocalDateTime w=LocalDateTime.now();
        Logger.add(w.toString()+"  "+"the product from animal has been produced");
    }

    public void Eating() {
        for (int i = 0; i < allDomestics.size(); i++) {
            if (allDomestics.get(i).isLive && allDomestics.get(i).getCurrentTime() <= 5) {
                for (int j = 0; j < 6; j++) {
                    for (int k = 0; k < 6; k++) {
                        if (j == allDomestics.get(i).getX_position() &&
                                k == allDomestics.get(i).getY_position()) {
                            allDomestics.get(i).setCurrentTime(DomesticAnimal.time);
                            Grass[j][k]--;
                            LocalDateTime w=LocalDateTime.now();
                            Logger.add(w.toString()+"  "+"the animal has eaten grass");
                        }
                    }
                }
            }
        }

    }

    public boolean AddToWareHouse(Product product) {
        LocalDateTime w=LocalDateTime.now();
        Logger.add(w.toString()+"  "+"request to add to warehouse");
        if (wareHouse.AvailableCapacity >= product.SizeInWarehouse) {
            wareHouse.products.add(product);
            return true;
        }
        return false;
    }

    public boolean AddToWareHouse(Animal animal) {
        LocalDateTime w=LocalDateTime.now();
        Logger.add(w.toString()+"  "+"request to add to warehouse");
        if (wareHouse.AvailableCapacity >= animal.SizaInWareHouse) {
            wareHouse.animals.add(animal);
            return true;
        }
        return false;
    }

    public void Cage(int x, int y) {
        LocalDateTime w=LocalDateTime.now();
        Logger.add(w.toString()+"  "+"the cage has been put");
        int a = 0;
        for (int i = 0; i < cages.size(); i++) {
            if (cages.get(i).getX() == x && cages.get(i).getY() == y) {
                a = 1;
            }
        }
        if (a == 0) {
            for (int j = 0; j < allWilds.size(); j++) {
                if (allWilds.get(j).getX_position() == x && allWilds.get(j).getY_position() == y) {
                    Cage cage = new Cage(x, y, allWilds.get(j));
                    cages.add(cage);
                }
            }
        }
    }

    public void Cage() {
        LocalDateTime w=LocalDateTime.now();
        Logger.add(w.toString()+"  "+"the cage is working");
        for (int i = 0; i < cages.size(); i++) {
            if (cages.get(i).getCurrrenttime() != 0) {
                int a = 0;
                for (int j = 0; j < CurrentCages.size(); j++) {
                    if (cages.get(i).getX() == CurrentCages.get(j).getX() && cages.get(i).getY() == CurrentCages.get(j).getY()) {
                        cages.get(i).setCurrrenttime(cages.get(i).getCurrrenttime() - 1);
                        a = 1;
                    }
                }
                if (a == 0) {
                    cages.get(i).setCurrrenttime(cages.get(i).getCurrrenttime() + 1);
                }
            } else {
                if (cages.get(i).getCurrentcagetime() != 0) {
                    boolean s = AddToWareHouse(cages.get(i).getWildanimal());
                    if (s) {
                        //TODO
                        //remove the cage and the wildanimal from theirlist
                    }
                    if (!s) {
                        cages.get(i).setCurrentcagetime(cages.get(i).getCurrentcagetime() - 1);
                    }
                } else {
                    //TODO
                    //remove the cage and let the wild animal go
                }
            }
        }
    }

    public void Walk() {
        LocalDateTime w=LocalDateTime.now();
        Logger.add(w.toString()+"  "+"walking");
        //TODO
        // tamame adad dakhel ro bayad ghadr begiram
        for (int i = 0; i < allWilds.size(); i++) {
            if (allWilds.get(i).getCurrentTime() > 0 && allWilds.get(i).getX_position() < 6) {
                if (allWilds.get(i).getNameOfAnimal().equalsIgnoreCase("tiger")) {
                    allWilds.get(i).setPX_position(allWilds.get(i).getX_position() + 1);
                    allWilds.get(i).setX_position(allWilds.get(i).getX_position() + 2);
                } else {
                    allWilds.get(i).setPX_position(allWilds.get(i).getX_position());
                    allWilds.get(i).setX_position(allWilds.get(i).getX_position() + 1);
                }
            } else {

                allWilds.remove(i);
                i--;
            }
        }
        for (int i = 0; i < allDefenders.size(); i++) {
            if (allDefenders.get(i).getNameOfAnimal().equalsIgnoreCase("cat")) {
                int r = 0, x = 0, y = 0;
                for (int j = 0; j < products.size(); j++) {
                    if (products.get(j).getNameOfProduct().equalsIgnoreCase("egg") || products.get(j).getNameOfProduct().equalsIgnoreCase("milk") || products.get(j).getNameOfProduct().equalsIgnoreCase("feather")) {
                        if (r <= (products.get(j).getX_position() + products.get(j).getY_position() - allDefenders.get(i).getX_position() - allDefenders.get(i).getX_position())) {
                            r = (products.get(j).getX_position() + products.get(j).getY_position() - allDefenders.get(i).getX_position() - allDefenders.get(i).getX_position());
                            x = products.get(j).getX_position();
                            y = products.get(j).getY_position();
                        }
                    }
                }
                if (x == allDefenders.get(i).getX_position()) {
                    if (y >= allDefenders.get(i).getY_position())
                        allDefenders.get(i).setY_position(allDefenders.get(i).getY_position() + 1);
                    else allDefenders.get(i).setY_position(allDefenders.get(i).getY_position() - 1);
                } else if (y == allDefenders.get(i).getY_position()) {
                    if (x >= allDefenders.get(i).getX_position())
                        allDefenders.get(i).setX_position(allDefenders.get(i).getX_position() + 1);
                    else allDefenders.get(i).setX_position(allDefenders.get(i).getX_position() - 1);
                } else if (y >= allDefenders.get(i).getY_position())
                    allDefenders.get(i).setY_position(allDefenders.get(i).getY_position() + 1);
                else if (y < allDefenders.get(i).getY_position())
                    allDefenders.get(i).setY_position(allDefenders.get(i).getY_position() - 1);
            }
            if (allDefenders.get(i).getNameOfAnimal().equalsIgnoreCase("dog")) {
                int r = 0, x = 0, y = 0;
                for (int j = 0; j < allWilds.size(); j++) {
                    if (r <= (allWilds.get(j).getX_position() + allWilds.get(j).getY_position() - allDefenders.get(i).getX_position() - allDefenders.get(i).getX_position())) {
                        r = (allWilds.get(j).getX_position() + allWilds.get(j).getY_position() - allDefenders.get(i).getX_position() - allDefenders.get(i).getX_position());
                        x = allWilds.get(j).getX_position();
                        y = allWilds.get(j).getY_position();
                    }
                }
                if (x == allDefenders.get(i).getX_position()) {
                    if (y >= allDefenders.get(i).getY_position())
                        allDefenders.get(i).setY_position(allDefenders.get(i).getY_position() + 1);
                    else allDefenders.get(i).setY_position(allDefenders.get(i).getY_position() - 1);
                } else if (y == allDefenders.get(i).getY_position()) {
                    if (x >= allDefenders.get(i).getX_position())
                        allDefenders.get(i).setX_position(allDefenders.get(i).getX_position() + 1);
                    else allDefenders.get(i).setX_position(allDefenders.get(i).getX_position() - 1);
                } else if (y >= allDefenders.get(i).getY_position())
                    allDefenders.get(i).setY_position(allDefenders.get(i).getY_position() + 1);
                else if (y < allDefenders.get(i).getY_position())
                    allDefenders.get(i).setY_position(allDefenders.get(i).getY_position() - 1);
            }
        }
        for (int i = 0; i < allDomestics.size(); i++) {
            int r = 0, x = 0, y = 0;
            for (int j = 0; j < 6; j++) {
                for (int k = 0; k < 6; k++) {
                    if (r <= (k + j - allDomestics.get(i).getX_position() - allDomestics.get(i).getX_position())) {
                        r = (k + j - allDomestics.get(i).getX_position() - allDomestics.get(i).getX_position());
                        x = k;
                        y = k;
                    }
                }
            }
            if (x == allDomestics.get(i).getX_position()) {
                if (y >= allDomestics.get(i).getY_position())
                    allDomestics.get(i).setY_position(allDomestics.get(i).getY_position() + 1);
                else allDomestics.get(i).setY_position(allDomestics.get(i).getY_position() - 1);
            } else if (y == allDomestics.get(i).getY_position()) {
                if (x >= allDomestics.get(i).getX_position())
                    allDomestics.get(i).setX_position(allDomestics.get(i).getX_position() + 1);
                else allDomestics.get(i).setX_position(allDomestics.get(i).getX_position() - 1);
            } else if (y >= allDomestics.get(i).getY_position())
                allDomestics.get(i).setY_position(allDomestics.get(i).getY_position() + 1);
            else if (y < allDomestics.get(i).getY_position())
                allDomestics.get(i).setY_position(allDomestics.get(i).getY_position() - 1);
        }
    }

    public void Intersection() {
        LocalDateTime w=LocalDateTime.now();
        Logger.add(w.toString()+"  "+"intersect");
        for (int i = 0; i < allDomestics.size(); i++) {
            if (allDomestics.get(i).getCurrentTime() <= 5) {
                if (Grass[allDomestics.get(i).getX_position()][allDomestics.get(i).getY_position()] > 0) {
                    Grass[allDomestics.get(i).getX_position()][allDomestics.get(i).getY_position()]--;
                    allDomestics.get(i).setCurrentTime(10);
                }
            }
        }
        for (int i = 0; i < allDefenders.size(); i++) {
            if (allDefenders.get(i).getNameOfAnimal().equalsIgnoreCase("cat")) {
                for (int j = 0; j < products.size(); j++) {
                    if (products.get(i).getNameOfProduct().equalsIgnoreCase("feather") || products.get(i).getNameOfProduct().equalsIgnoreCase("milk") || products.get(i).getNameOfProduct().equalsIgnoreCase("egg")) {
                        if (allDefenders.get(i).getX_position() == products.get(j).getX_position() && allDefenders.get(i).getY_position() == products.get(j).getY_position()) {
                            boolean s = AddToWareHouse(products.get(j));
                            if (s) {
                                //TODO
                                //remove product from the list
                            }
                        }
                    }
                }
            }
        }
        ArrayList<DefenderAnimal> sagzapas = new ArrayList<>();
        for (int i = 0; i < allDefenders.size(); i++) {
            if (allDefenders.get(i).getNameOfAnimal().equalsIgnoreCase("dog")) {
                for (int j = 0; j < allWilds.size(); j++) {
                    if (allWilds.get(i).getNameOfAnimal().equalsIgnoreCase("tiger")) {
                        if (allDefenders.get(i).getX_position() == allWilds.get(j).getX_position() && allDefenders.get(i).getY_position() == allWilds.get(j).getY_position()) {
                            //TODO
                            //remove the wild and adding dog to the sagzapas th remove them in the end of the loop because one dog can kill more than one wildanimals
                            sagzapas.add(allDefenders.get(i));
                        } else if (allWilds.get(i).getX_position() > allWilds.get(i).getPX_position()) {
                            if (allWilds.get(i).getPX_position() <= allDefenders.get(i).getX_position() && allWilds.get(i).getPX_position() <= allDefenders.get(i).getPX_position() && allWilds.get(i).getX_position() >= allDefenders.get(i).getX_position() && allWilds.get(i).getX_position() >= allDefenders.get(i).getPX_position()) {
                                //TODO
                                //remove the wild and adding dog to the sagzapas th remove them in the end of the loop because one dog can kill more than one wildanimals
                                sagzapas.add(allDefenders.get(i));
                            }
                        } else if (allWilds.get(i).getX_position() < allWilds.get(i).getPX_position()) {
                            if (allWilds.get(i).getX_position() <= allDefenders.get(i).getX_position() && allWilds.get(i).getX_position() <= allDefenders.get(i).getPX_position() && allWilds.get(i).getPX_position() >= allDefenders.get(i).getX_position() && allWilds.get(i).getPX_position() >= allDefenders.get(i).getPX_position()) {
                                //TODO
                                //remove the wild and adding dog to the sagzapas th remove them in the end of the loop because one dog can kill more than one wildanimals
                                sagzapas.add(allDefenders.get(i));
                            }

                        } else if (allWilds.get(i).getY_position() > allWilds.get(i).getPY_position()) {
                            if (allWilds.get(i).getPY_position() <= allDefenders.get(i).getY_position() && allWilds.get(i).getPY_position() <= allDefenders.get(i).getPY_position() && allWilds.get(i).getY_position() >= allDefenders.get(i).getY_position() && allWilds.get(i).getY_position() >= allDefenders.get(i).getPY_position()) {
                                //TODO
                                //remove the wild and adding dog to the sagzapas th remove them in the end of the loop because one dog can kill more than one wildanimals
                                sagzapas.add(allDefenders.get(i));
                            }
                        } else if (allWilds.get(i).getY_position() < allWilds.get(i).getPY_position()) {
                            if (allWilds.get(i).getY_position() <= allDefenders.get(i).getY_position() && allWilds.get(i).getY_position() <= allDefenders.get(i).getPY_position() && allWilds.get(i).getPY_position() >= allDefenders.get(i).getY_position() && allWilds.get(i).getPY_position() >= allDefenders.get(i).getPY_position()) {
                                //TODO
                                //remove the wild and adding dog to the sagzapas th remove them in the end of the loop because one dog can kill more than one wildanimals
                                sagzapas.add(allDefenders.get(i));
                            }
                        }
                    } else {
                        if (allDefenders.get(i).getX_position() == allWilds.get(j).getX_position() && allDefenders.get(i).getY_position() == allWilds.get(j).getY_position()) {
                            //TODO
                            //remove the wild and adding dog to the sagzapas th remove them in the end of the loop because one dog can kill more than one wildanimals
                            sagzapas.add(allDefenders.get(i));
                        } else if (allDefenders.get(i).getX_position() == allWilds.get(j).getPX_position() && allDefenders.get(i).getY_position() == allWilds.get(j).getPY_position()) {
                            //TODO
                            //remove the wild and adding dog to the sagzapas th remove them in the end of the loop because one dog can kill more than one wildanimals
                            sagzapas.add(allDefenders.get(i));
                        }
                    }
                }
            }
        }
        //TODO
        //deleting the list of sagzapas from alldefenders
        for (int i = 0; i < allDomestics.size(); i++) {
            for (int j = 0; j < allWilds.size(); j++) {
                if (allWilds.get(i).getNameOfAnimal().equalsIgnoreCase("tiger")) {
                    if (allDomestics.get(i).getX_position() == allWilds.get(j).getX_position() && allDomestics.get(i).getY_position() == allWilds.get(j).getY_position()) {
                        //TODO
                        //remove the wild and adding dog to the sagzapas th remove them in the end of the loop because one dog can kill more than one wildanimals
                        sagzapas.add(allDefenders.get(i));
                    } else if (allWilds.get(i).getX_position() > allWilds.get(i).getPX_position()) {
                        if (allWilds.get(i).getPX_position() <= allDomestics.get(i).getX_position() && allWilds.get(i).getPX_position() <= allDomestics.get(i).getPX_position() && allWilds.get(i).getX_position() >= allDomestics.get(i).getX_position() && allWilds.get(i).getX_position() >= allDomestics.get(i).getPX_position()) {
                            //TODO
                            //remove the domestic

                        }
                    } else if (allWilds.get(i).getX_position() < allWilds.get(i).getPX_position()) {
                        if (allWilds.get(i).getX_position() <= allDomestics.get(i).getX_position() && allWilds.get(i).getX_position() <= allDomestics.get(i).getPX_position() && allWilds.get(i).getPX_position() >= allDomestics.get(i).getX_position() && allWilds.get(i).getPX_position() >= allDomestics.get(i).getPX_position()) {
                            //TODO
                            //remove domestic
                        }

                    } else if (allWilds.get(i).getY_position() > allWilds.get(i).getPY_position()) {
                        if (allWilds.get(i).getPY_position() <= allDomestics.get(i).getY_position() && allWilds.get(i).getPY_position() <= allDomestics.get(i).getPY_position() && allWilds.get(i).getY_position() >= allDomestics.get(i).getY_position() && allWilds.get(i).getY_position() >= allDomestics.get(i).getPY_position()) {
                            //TODO
                            //remove domestic
                        }
                    } else if (allWilds.get(i).getY_position() < allWilds.get(i).getPY_position()) {
                        if (allWilds.get(i).getY_position() <= allDomestics.get(i).getY_position() && allWilds.get(i).getY_position() <= allDomestics.get(i).getPY_position() && allWilds.get(i).getPY_position() >= allDomestics.get(i).getY_position() && allWilds.get(i).getPY_position() >= allDomestics.get(i).getPY_position()) {
                            //TODO
                            //remove domestic
                        }
                    }
                } else {
                    if (allDomestics.get(i).getX_position() == allWilds.get(j).getX_position() && allDomestics.get(i).getY_position() == allWilds.get(j).getY_position()) {
                        //TODO
                        //remove domestic
                    } else if (allDomestics.get(i).getX_position() == allWilds.get(j).getPX_position() && allDomestics.get(i).getY_position() == allWilds.get(j).getPY_position()) {
                        //TODO
                        //remove domestic
                    }
                }
            }
        }
        for (int i = 0; i < products.size(); i++) {
            for (int j = 0; j < allWilds.size(); j++) {
                if (allWilds.get(i).getNameOfAnimal().equalsIgnoreCase("tiger")) {
                    if (products.get(i).getX_position() == allWilds.get(j).getX_position() && products.get(i).getY_position() == allWilds.get(j).getY_position()) {
                        //TODO
                        //remove the wild and adding dog to the sagzapas th remove them in the end of the loop because one dog can kill more than one wildanimals
                        sagzapas.add(allDefenders.get(i));
                    } else if (allWilds.get(i).getX_position() > allWilds.get(i).getPX_position()) {
                        if (allWilds.get(i).getPX_position() <= products.get(i).getX_position() && allWilds.get(i).getPX_position() <= products.get(i).getPX_position() && allWilds.get(i).getX_position() >= products.get(i).getX_position() && allWilds.get(i).getX_position() >= products.get(i).getPX_position()) {
                            //TODO
                            //remove the domestic

                        }
                    } else if (allWilds.get(i).getX_position() < allWilds.get(i).getPX_position()) {
                        if (allWilds.get(i).getX_position() <= products.get(i).getX_position() && allWilds.get(i).getX_position() <= products.get(i).getPX_position() && allWilds.get(i).getPX_position() >= products.get(i).getX_position() && allWilds.get(i).getPX_position() >= products.get(i).getPX_position()) {
                            //TODO
                            //remove domestic
                        }

                    } else if (allWilds.get(i).getY_position() > allWilds.get(i).getPY_position()) {
                        if (allWilds.get(i).getPY_position() <= products.get(i).getY_position() && allWilds.get(i).getPY_position() <= products.get(i).getPY_position() && allWilds.get(i).getY_position() >= products.get(i).getY_position() && allWilds.get(i).getY_position() >= products.get(i).getPY_position()) {
                            //TODO
                            //remove domestic
                        }
                    } else if (allWilds.get(i).getY_position() < allWilds.get(i).getPY_position()) {
                        if (allWilds.get(i).getY_position() <= products.get(i).getY_position() && allWilds.get(i).getY_position() <= products.get(i).getPY_position() && allWilds.get(i).getPY_position() >= products.get(i).getY_position() && allWilds.get(i).getPY_position() >= products.get(i).getPY_position()) {
                            //TODO
                            //remove domestic
                        }
                    }
                } else {
                    if (products.get(i).getX_position() == allWilds.get(j).getX_position() && products.get(i).getY_position() == allWilds.get(j).getY_position()) {
                        //TODO
                        //remove domestic
                    } else if (products.get(i).getX_position() == allWilds.get(j).getPX_position() && products.get(i).getY_position() == allWilds.get(j).getPY_position()) {
                        //TODO
                        //remove domestic
                    }
                }
            }
        }
        //baraye alaf ham bezanam
    }

    public void Turn(int n) {
        for (int j = 0; j < n; j++) {
            Eating();
            RemoveCorruptProducts();
            RemoveDeadAnimals();
            ProductProcessing();
            ProducingProduct();
            Walk();
            if (truck.Active) {
                if (turn == truck.EndedTime) {
                    truck.Active = false;
                    bank.setCoin(bank.getCoin() + truck.getMoney());
                }
            }


            //checking cage
            //TODO
            //ranoom walk and hadafman
            //TODO
            //tabee ghaza khordan
            //TODO
            //tabee kam kardan az jan heivanat  va mahsoolatbar asas zaman
            //TODO
            //tabee niaz be ghaza peida kardan heivanat bar asas joooneshoon
            //TODO
            //Tabe toolid mahsoul tavasot heivanat
            //TODO
            //Tabe barkhrd vahshi ba mahsool va ahli  vahsi ba sag  , gorbe ba mahsool
            //TODO

        }
    }
    public void readLoggerFile(){
        try {
            File myObj = new File("Logger.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                Logger.add(data);
            }
            myReader.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    public void writeLoggerFile(){
        try {
            FileWriter myWriter = new FileWriter("Logger.txt");
            for(int i=0;i<Logger.size();i++){
                myWriter.write(Logger.get(i)+"\r\n");
            }



            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        }
        catch ( IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
