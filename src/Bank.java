public class Bank {
    int Coin;
    void Buy(){};
    void Sell(){};

    public int getCoin() {
        return Coin;
    }

    public void setCoin(int coin) {
        Coin = coin;
    }

    public Bank(int coin) {
        Coin = coin;
    }
}
//این کلاس کلا مسایل امتیازی را در بر می گیرد
//چه سکه ها و خرید و فروش توسط آنها
//چه ستاره هاو سکه های مورد نیاز در بیرون بازی
//و هر مسیله امتیازی که در بازی مورد نیاز است
//و این کلاس با warehouse
//و shop و .. در ارتباط است.