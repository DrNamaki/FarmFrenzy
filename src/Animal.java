import java.util.Random;

public class Animal {
     int time = 10 ;
    String nameOfAnimal ;
    int X_position;
    int Y_position;
    int PX_position;
    int PY_position;
    boolean isLive;
    int SizaInWareHouse;
    int CurrentTime;
    int Producttime;
    int Productcurrenttime;
    int Price;

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }

    public  Animal() {
        Random rand=new Random();
        int a=0,b=5;
        int x=rand.nextInt((b-a)+1)+a;
        int y=rand.nextInt((b-a)+1)+a;;
        X_position =x;
        Y_position = y;
        this.isLive = true;

    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public void setNameOfAnimal(String nameOfAnimal) {
        this.nameOfAnimal = nameOfAnimal;
    }

    public int getPX_position() {
        return PX_position;
    }

    public void setPX_position(int PX_position) {
        this.PX_position = PX_position;
    }

    public int getPY_position() {
        return PY_position;
    }

    public void setPY_position(int PY_position) {
        this.PY_position = PY_position;
    }

    public String getNameOfAnimal() {
        return nameOfAnimal;
    }

    public int getX_position() {
        return X_position;
    }

    public void setX_position(int x_position) {
        X_position = x_position;
    }

    public int getY_position() {
        return Y_position;
    }

    public void setY_position(int y_position) {
        Y_position = y_position;
    }

    public boolean isLive() {
        return isLive;
    }

    public void setLive(boolean live) {
        isLive = live;
    }

    public int getSizaInWareHouse() {
        return SizaInWareHouse;
    }

    public void setSizaInWareHouse(int sizaInWareHouse) {
        SizaInWareHouse = sizaInWareHouse;
    }

    public int getCurrentTime() {
        return CurrentTime;
    }

    public void setCurrentTime(int currentTime) {
        CurrentTime = currentTime;
    }

    public int getProducttime() {
        return Producttime;
    }

    public void setProducttime(int producttime) {
        Producttime = producttime;
    }

    public int getProductcurrenttime() {
        return Productcurrenttime;
    }

    public void setProductcurrenttime(int productcurrenttime) {
        Productcurrenttime = productcurrenttime;
    }
    //انهایی که تایم خالی دارند در واقع  نشان دهنده اون تایم اصلی برای انجام دادن سک عملیات هست
    //اونهایی که currrent دارند در واقع نشان دهنده مقدار زمان در لحظه است تا به متغیر time برسد تا یک کاری بکند
     //در اینجا ما یک کلاس بدر به نام Animal  خواهیم داشت و کلیه حیوانات از این کلاس ارث بری می کنند
    //زیر کلاس های این کلاس 3 کلاس هستند و به 3 دسته حیوانات اعلی حیوانات وحشی و حیوانات دفاع کننده از مزرعه تبدیل می شوند
    //و خب  برای حیوان ها متود های حرکت رندم و صدایی که از خودشون در می اورند و کاری که باید انجام بدهند(مثلا مرغ تخم می گذارد و شترمرغ بر ریزی می کند)
    //و دو متغیر سایز در انبار و زنده بودن را هم برای تمامی حیوانات تعریف کردیم
}
