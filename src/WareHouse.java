import java.util.ArrayList;
public class WareHouse {
    int Level;
    static final int Capacity = 30;
    int AllCapacity=300;
    int AvailableCapacity=300;
    ArrayList<Product> products = new ArrayList<>();
    ArrayList<Animal> animals = new ArrayList<>();
    ArrayList<Product> RecentlySold = new ArrayList<>();

    public int getAllCapacity() {
        return AllCapacity;
    }
    boolean CanSellOrStore() {
        return true;
    }
    public void addProduct(Product product)
    {
      this.products.add(product);
    }
    public void addAnimal(Animal animal)
    {
        this.animals.add(animal);
    }

    void Sell() {
    }

}
//این کلاس کلاس انبار ما می باشد و شامل یک سری خصوصیات هست
//خصوصیاتی شامل ظرفیت انبار که از ان بیشتر نمی توان در ان گنجاند
//و خب موقعی هم که انبار پر هست یا موتور فروش در مرحله ظی کردن مسیر هست
//اجازه ورود به انبار داده نیم شود
// و بایستی در ان یک سری متود های فروش گنجانده شود
//و لیستی از محصولات و حیوانات
//تا به محض فروختن یا اضافه کردن انها به انبار تغییرات لازمه را در
//انبار اعمال بکنیم.
