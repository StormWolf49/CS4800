public class H5_Test {
    public static void main(String[] args) {
        FoodItem burger = new BasicFoodItem("Burger", 5.0);
        FoodItem fries = new BasicFoodItem("Fries", 2.0);
        FoodItem hotDog = new BasicFoodItem("Hot Dog", 4.0);

        FoodItem burgerWithCheese = new Cheese(burger);
        FoodItem burgerWithBacon = new Bacon(burgerWithCheese);
        FoodItem hotDogWithRelish = new Relish(hotDog);

        Order order = new Order();
        order.addItem(burgerWithBacon);
        order.addItem(fries);
        order.addItem(hotDogWithRelish);

        LoyaltyStatus loyaltyStatus = new LoyaltyStatus(0.1);
        double discountedCost = loyaltyStatus.applyDiscount(order);

        System.out.println("Total cost before discount: " + order.calculateTotalCost());
        System.out.println("Total cost after discount: " + discountedCost);
    }
}
