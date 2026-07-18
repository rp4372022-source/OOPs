public abstract class Order {
    private FoodItem foodItem;
    private double deliveryFee;

    public Order(FoodItem foodItem,double deliveryFee) {
        this.deliveryFee = (deliveryFee < 0) ? 0 : deliveryFee;
        this.foodItem = foodItem;
    }

    public double getDeliveryFee() {
        return deliveryFee;
    }

    public void setDeliveryFee(double deliveryFee) {
        this.deliveryFee = deliveryFee;
    }

    public FoodItem getFoodItem() {
        return foodItem;
    }

    public void setFoodItem(FoodItem foodItem) {
        this.foodItem = foodItem;
    }

    public abstract double calculateTotal();
}
