public class Cage {
    int Level;
    void TimeToDo(){};
    void WorkToDo(){};
    int time=3;
    int currrenttime=3;
    int power;
    int cagetime=5;
    int currentcagetime=5;
int x;
int y;
WildAnimal Wildanimal;

    public WildAnimal getWildanimal() {
        return Wildanimal;
    }

    public void setWildanimal(WildAnimal wildanimal) {
        Wildanimal = wildanimal;
    }

    public int getCagetime() {
        return cagetime;
    }

    public void setCagetime(int cagetime) {
        this.cagetime = cagetime;
    }

    public int getCurrentcagetime() {
        return currentcagetime;
    }

    public void setCurrentcagetime(int currentcagetime) {
        this.currentcagetime = currentcagetime;
    }

    public Cage(int x, int y, WildAnimal wildanimal) {
        this.x = x;
        this.y = y;
        Wildanimal = wildanimal;
    }

    public int getLevel() {
        return Level;
    }

    public void setLevel(int level) {
        Level = level;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getCurrrenttime() {
        return currrenttime;
    }

    public void setCurrrenttime(int currrenttime) {
        this.currrenttime = currrenttime;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
//پاور نشان دهنده تعداد گلیگی که روی قفس شده تا قوی شود و بتوان حیوان وحشی را ثابت فیکس کند
//این کلاس کلاس قفس را برعهده دارد
//و تمامی کار های ان از جمله لول و
//قدرت نگه داری و ...قفس را هندل می کند
