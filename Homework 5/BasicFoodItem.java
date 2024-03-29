class BasicFoodItem implements FoodItem {
    private String name;
    private double price;

    public BasicFoodItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getCost() {
        return price;
    }
}