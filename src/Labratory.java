public class Labratory {
    String Name;
    int X_Position;
    int Y_Position;
    int Level;
    int Price;
    int Time;
    int CurrentTime;
    boolean IsBuyed;
    boolean Active ;
    public Labratory(String name, int x_Position, int y_Position, int level, int price, int time,
                     int currentTime, boolean isBuyed, boolean active) {
        Name = name;
        X_Position = x_Position;
        Y_Position = y_Position;
        Level = level;
        Price = price;
        Time = time;
        CurrentTime = currentTime;
        IsBuyed = isBuyed;
        Active = active;
    }
    void WorkToDo() {
    }

    void TimeToDo() {
    }

    int InitialPrice() {
        return this.Level;
    }

    public String getName() {
        return Name;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setActive(boolean active) {
        Active = active;
    }

    public boolean isActive() {
        return Active;
    }

    public int getX_Position() {
        return X_Position;
    }

    public void setX_Position(int x_Position) {
        X_Position = x_Position;
    }

    public int getY_Position() {
        return Y_Position;
    }

    public void setY_Position(int y_Position) {
        Y_Position = y_Position;
    }

    public int getLevel() {
        return Level;
    }

    public void setLevel(int level) {
        Level = level;
    }

    public int getTime() {
        return Time;
    }

    public void setTime(int time) {
        Time = time;
    }

    public int getCurrentTime() {
        return CurrentTime;
    }

    public void setCurrentTime(int currentTime) {
        CurrentTime = currentTime;
    }

    public boolean isBuyed() {
        return IsBuyed;
    }

    public void setBuyed(boolean buyed) {
        IsBuyed = buyed;
    }

}
//این کلاس در واقع تمامی کلاس های لابراتوری را شامل می شود
// و تمام لابراتوری ها فیلد ها و متود های خود را
//از این کلاس به ارث می برند
//هر کلاس یه ورودی دارد یک خروحی و یک تایم انجام دادن آن عمل
//و هر لابراتوری یک لول و قیمت اولیه نیز دارد
