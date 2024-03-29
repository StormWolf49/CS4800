class Relish extends ToppingDecorator {
    private double price;

    public Relish(FoodItem foodItem) {
        super(foodItem);
        this.price = 0.25;
    }

    public double getCost() {
        return foodItem.getCost() + price;
    }
}