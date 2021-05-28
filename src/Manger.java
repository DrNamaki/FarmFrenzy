import java.util.ArrayList;

public class Manger {
    public ArrayList<DomesticAnimal> domestics = new ArrayList<>();
    public ArrayList<WildAnimal> Wilds = new ArrayList<>();
    public ArrayList<DefenderAnimal> Defenders = new ArrayList<>();
    public ArrayList<DomesticAnimal> allDomestics = new ArrayList<>();
    public ArrayList<WildAnimal> allWilds = new ArrayList<>();
    public ArrayList<DefenderAnimal> allDefenders = new ArrayList<>();
    public ArrayList<Cage> cages = new ArrayList<>();
    Bank bank = new Bank();
    public ArrayList<Labratory> labratories = new ArrayList<>();
    public ArrayList<Product> products = new ArrayList<>();
    public ArrayList<Grass> grasses = new ArrayList<>();

    public void BuyAnimal(String name) {

    }

    //
    //
    //
    public void ProductProcessing() {
        for (int i = 0; i < labratories.size(); i++) {
            if (labratories.get(i).isActive()) {
                labratories.get(i).setCurrentTime(labratories.get(i).getCurrentTime() - 1);
            }
            if (labratories.get(i).getCurrentTime() == 0) {
                labratories.get(i).setActive(false);
                //time ra be haman halat avvalie bargardan
                //TODO
            }
        }
    }

    public void RemoveDeadAnimals() {
        for (int i = 0; i < domestics.size(); i++) {
            domestics.get(i).setCurrentTime(domestics.get(i).getCurrentTime() - 1);
            if (domestics.get(i).getCurrentTime() <= 0)
                domestics.remove(i);
        }

    }

    public void RemoveCorruptProducts() {
        for (int i = 0; i < products.size(); i++) {
            products.get(i).setCurrentTime(products.get(i).getCurrentTime() - 1);
            if (products.get(i).getCurrentTime() == 0)
                products.remove(i);
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


    }


    public void Eating() {
        for (int i = 0; i < allDomestics.size(); i++) {
            if (allDomestics.get(i).isLive && allDomestics.get(i).getCurrentTime() <= 5) {
                for (Grass grass : grasses) {
                    if (grass.getX_position() == allDomestics.get(i).getX_position() &&
                            grass.getY_position() == allDomestics.get(i).getY_position()) {
                        allDomestics.get(i).setCurrentTime(DomesticAnimal.time);
                        grasses.remove(i);
                    }
                }
            }
        }
    }

    public void Turn(int n) {
        for (int j = 0; j < n; j++) {
            {
                RemoveCorruptProducts();
                RemoveDeadAnimals();
                ProductProcessing();
                ProducingProduct();
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
}
