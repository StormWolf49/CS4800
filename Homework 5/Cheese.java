class Cheese extends ToppingDecorator {
    private double price;

    public Cheese(FoodItem foodItem) {
        super(foodItem);
        this.price = 0.5;
    }

    public double getCost() {
        return foodItem.getCost() + price;
    }
}