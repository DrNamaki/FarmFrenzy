import java.util.ArrayList;

public class Manger {
    public ArrayList<DomesticAnimal> Domestics = new ArrayList<>();
    public ArrayList<WildAnimal> Wilds = new ArrayList<>();
    public ArrayList<DefenderAnimal> Defenders = new ArrayList<>();
    public ArrayList<DomesticAnimal> AllDomestics = new ArrayList<>();
    public ArrayList<WildAnimal> AllWilds = new ArrayList<>();
    public ArrayList<DefenderAnimal> AllDefenders = new ArrayList<>();
    public ArrayList<Cage> Cages = new ArrayList<>();
    Bank bank = new Bank();
    public ArrayList<Labratory> labratories = new ArrayList<>();
    public ArrayList<Product> products = new ArrayList<>();

    public void BuyAnimal(String name) {

    }

    //
    //
    //
    public void ProductProcessing() {
        for (int i = 0; i < labratories.size(); i++) {
            if (labratories.get(i).Active) {
                labratories.get(i).setCurrentTime(labratories.get(i).getCurrentTime() - 1);
            }
            if (labratories.get(i).getCurrentTime() == 0) {
                labratories.get(i).setActive(false);
                // new product
                //time ra be haman halat avvalie bargardan
                //TODO
            }
        }
    }

    public void ProducingProduct() {
        for (int i = 0; i < AllDomestics.size(); i++) {
            if (AllDomestics.get(i).isLive) {
                AllDomestics.get(i).setProductcurrenttime(AllDomestics.get(i).getProductcurrenttime() - 1);
            }
            if (AllDomestics.get(i).getProductcurrenttime() == 0) {
                switch (AllDomestics.get(i).getNameOfAnimal()) {
                    case "Hen":
                         products.add(new Egg(Egg.Time,AllDomestics.get(i).X_position,
                                 AllDomestics.get(i).Y_position,false));
                        break;
                    case "Ostrich":
                        products.add(new Feather(Feather.Time,AllDomestics.get(i).X_position,
                                AllDomestics.get(i).Y_position,false));
                        break;
                    case "Sheep":
                        products.add(new Milk(Milk.Time,AllDomestics.get(i).X_position,
                                AllDomestics.get(i).Y_position,false));
                        break;
                }
                AllDomestics.get(i).setProductcurrenttime(AllDomestics.get(i).getProductcurrenttime());
            }
        }


    }

    public void Turn(int n) {
        for (int j = 0; j < n; j++) {
            {
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
