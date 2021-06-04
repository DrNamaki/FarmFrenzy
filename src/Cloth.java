public class Cloth extends Product{
    static final int timeOfCorrupting = 5;
    static final int Price = 50 ;
    static final int SizeInWareHouse = 2 ;
    static final int Time = 5 ;
    public Cloth(int currentTime, int x_position, int y_position, boolean harvested) {
        super(currentTime, x_position, y_position, harvested);
    }
}
