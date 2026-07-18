public class PremiumOrder extends Order{

    PremiumOrder(FoodItem foodItem){
        super(foodItem,0.0);
    }

    @Override
    public double calculateTotal() {
        return getFoodItem().getPrice() + getDeliveryFee();
    }
}
