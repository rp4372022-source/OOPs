public class RegularOrder extends Order{
    public RegularOrder(FoodItem foodItem, double deliveryFee) {
        super(foodItem, deliveryFee);
    }

    @Override
    public double calculateTotal() {
        return getFoodItem().getPrice()+getDeliveryFee();
    }
}
