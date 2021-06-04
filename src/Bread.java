public class Bread extends Product{
    static final int timeOfCorrupting = 6;
    static final int Price = 80 ;
    static final int SizeInWareHouse = 4 ;
    static final int Time = 5 ;
    public Bread(int currentTime, int x_position, int y_position, boolean harvested) {
        super(currentTime, x_position, y_position, harvested);
    }
}
