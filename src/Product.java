public class Product {
    String nameOfProduct;
    int CurrentTime;
    int X_position;
    int Y_position;
    boolean Harvested;
    void ToLive(){};
    int SizeinWarehouse;

    public String getNameOfProduct() {
        return nameOfProduct;
    }

    public void setNameOfProduct(String nameOfProduct) {
        this.nameOfProduct = nameOfProduct;
    }

    public int getSizeinWarehouse() {
        return SizeinWarehouse;
    }

    public void setSizeinWarehouse(int sizeinWarehouse) {
        SizeinWarehouse = sizeinWarehouse;
    }

    public void setCurrentTime(int currentTime) {
        CurrentTime = currentTime;
    }

    public void setX_position(int x_position) {
        X_position = x_position;
    }

    public void setY_position(int y_position) {
        Y_position = y_position;
    }

    public void setHarvested(boolean harvested) {
        Harvested = harvested;
    }

    public boolean isHarvested() {
        return Harvested;
    }

    public int getCurrentTime() {
        return CurrentTime;
    }

    public int getX_position() {
        return X_position;
    }

    public int getY_position() {
        return Y_position;
    }

    public Product(int currentTime, int x_position, int y_position, boolean harvested) {
        CurrentTime = currentTime;
        X_position = x_position;
        Y_position = y_position;
        Harvested = harvested;
    }
}
//در این کلاس تمامی محصولاتاعم از پودر ها کیک ها کلوچه ها و
//تمامی محصولاتی که حیوانات تولید  می کنند زیر کلاس این کلاس اند.
//تا بتوان  انها را سازمان دهی کرد و همه اناها را
//به یک چشم نگاه کرد.
