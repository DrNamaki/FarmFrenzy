public class TransformVehicle {
    int AvailableCapacity=0;
    int Capacity=15;
int money;

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getAvailableCapacity() {
        return AvailableCapacity;
    }

    public void setAvailableCapacity(int availableCapacity) {
        AvailableCapacity = availableCapacity;
    }

    public boolean isActive() {
        return Active;
    }

    public void setActive(boolean active) {
        Active = active;
    }

    int X_Positin;
    int Y_Position;
    int Time=10;
    int EndedTime;

    public int getEndedTime() {
        return EndedTime;
    }

    public void setEndedTime(int endedTime) {
        EndedTime = endedTime;
    }

    boolean Active=false;
    public int getCapacity() {
        return Capacity;
    }

    public void setCapacity(int capacity) {
        Capacity = capacity;
    }

    public int getX_Positin() {
        return X_Positin;
    }

    public void setX_Positin(int x_Positin) {
        X_Positin = x_Positin;
    }

    public int getY_Position() {
        return Y_Position;
    }

    public void setY_Position(int y_Position) {
        Y_Position = y_Position;
    }

    public int getTime() {
        return Time;
    }

    public void setTime(int time) {
        Time = time;
    }


}
//این کلاس مربوز به نقل و انتقالات محصولات و حیوانات می باشد
//این مجموعه محصولات را به شهر برده و انها را فروخته و
//سود آنرا به مزرعه می آورد.
//هر وسیله نقلیه یک ظرفیت و یک سری تایم برای انتقال محصولات دارند
//و هر کدام وسایل خاصی را می توانند بفروشند.
//زیرکلاس های موتور و الی کوپتر از این کلاس ارث می برند و توایع
//مخصوص به خودشان را پیاده سازی می کنند