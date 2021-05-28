public class Egg extends Product{
    static final int timeOfCorrupting = 4;
    static final int Price = 15 ;
    static final int SizeInWareHouse = 1 ;
    static final int Time = 2 ;
    public Egg(int currentTime, int x_position, int y_position, boolean harvested) {
        super(currentTime, x_position, y_position, harvested);
    }
}
