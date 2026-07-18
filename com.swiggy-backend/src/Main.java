import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<FoodItem> foodItemList = List.of(
                new FoodItem("Veg Kolhapuri", 230.0),
                new FoodItem("Butter Paneer",260.0),
                new FoodItem("Black Forest",350)
        );

        Order order1 = new RegularOrder(foodItemList.get(1),60.0);
        double totalPrice = order1.calculateTotal();
        System.out.println(totalPrice);
    }
}
