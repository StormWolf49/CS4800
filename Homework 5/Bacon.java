class Bacon extends ToppingDecorator {
    private double price;

    public Bacon(FoodItem foodItem) {
        super(foodItem);
        this.price = 1.0;
    }

    public double getCost() {
        return foodItem.getCost() + price;
    }
}