// One class acquiring the properties and behaviours of another class.

class Product{
    int prodId;
    String prodName;
    double price;

    void displayProductInfo(){
        System.out.println(
            "Id : "+prodId+
            ", Name : "+prodName+
            ", Price : "+price
        );
    }
}
class Cloth extends Product{ //inherited the 
    double size;
}
public class Inheritance {
    public static void main(String[] args) {
        Cloth cloth = new Cloth();
        cloth.prodId = 101;
        cloth.prodName = "Raymond";
        cloth.price = 2000.00;
        cloth.size = 44.00;
        
        cloth.displayProductInfo();
    }
}
