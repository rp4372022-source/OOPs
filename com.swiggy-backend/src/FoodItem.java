public class FoodItem {
    private String itemName;
    private double price;

    public FoodItem(String itemName, double price) {
            this.price = (price < 0) ? 0 : price;
            this.itemName = (itemName == null) ? "Food Item" : itemName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price < 0) price = 0;
        else this.price = price;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        if(itemName == null) itemName = "Food Item";
        else this.itemName = itemName;
    }
}
