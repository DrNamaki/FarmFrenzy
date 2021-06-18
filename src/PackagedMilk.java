public class PackagedMilk extends Product {
    static final String nameOfProduct = "PackagedMilk";
    static final int timeOfCorrupting = 5;
    static final int Price = 60 ;
    static final int SizeInWareHouse = 2 ;
    static final int Time = 6 ;

    public PackagedMilk(int currentTime, int x_position, int y_position, boolean harvested) {
        super(nameOfProduct,currentTime, x_position, y_position, harvested);
    }
}
