public class Hen extends DomesticAnimal{
static int ord=0;
    public Hen() {
        super();
        this.sort=ord;
        ord++;
        this.nameOfAnimal="hen" ;
        this.SizeInWareHouse =1;
        this.Producttime=2;
        this.Price=100;
    }
}
