public class Dog extends DefenderAnimal{
    static int ord=0;
    public Dog() {
        super();
        this.sort=ord;
        ord++;
        this.nameOfAnimal="dog" ;
        this.SizaInWareHouse=2;
        this.Producttime=0;
        this.Price=100;
    }
}
