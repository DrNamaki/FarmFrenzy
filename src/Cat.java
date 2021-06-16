public class Cat extends DefenderAnimal{
    static int ord=0;
    public Cat() {
        super();
        this.sort=ord;
        ord++;
        this.nameOfAnimal="cat" ;
        this.SizaInWareHouse=2;
        this.Producttime=0;
        this.Price=150;
    }
}
