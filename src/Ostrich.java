public class Ostrich extends DomesticAnimal{
    static int ord=0;
    public Ostrich() {
        super();
        this.sort=ord;
        ord++;
        this.nameOfAnimal="ostrich" ;
        this.SizeInWareHouse =1;
        this.Producttime=3;
        this.Price=200;
    }
}
