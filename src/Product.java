public class Product {
    int CurrentTime;
    int X_position;
    int Y_position;
    boolean Harvested;
    boolean Fresh;
    void ToLive(){};

    public Product(int currentTime, int x_position, int y_position, boolean harvested) {
        CurrentTime = currentTime;
        X_position = x_position;
        Y_position = y_position;
        Harvested = harvested;
        Fresh = true ;
    }
}
//در این کلاس تمامی محصولاتاعم از پودر ها کیک ها کلوچه ها و
//تمامی محصولاتی که حیوانات تولید  می کنند زیر کلاس این کلاس اند.
//تا بتوان  انها را سازمان دهی کرد و همه اناها را
//به یک چشم نگاه کرد.
