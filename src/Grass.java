public class Grass {
    int X_position;
    int Y_position;
    int MaxPower;

    public Grass(int x_position, int y_position, int maxPower) {
        X_position = x_position;
        Y_position = y_position;
        MaxPower = maxPower;
    }

    public void setX_position(int x_position) {
        X_position = x_position;
    }

    public void setY_position(int y_position) {
        Y_position = y_position;
    }

    public void setMaxPower(int maxPower) {
        MaxPower = maxPower;
    }

    public int getX_position() {
        return X_position;
    }

    public int getY_position() {
        return Y_position;
    }

    public int getMaxPower() {
        return MaxPower;
    }

    void Power(){};
}
