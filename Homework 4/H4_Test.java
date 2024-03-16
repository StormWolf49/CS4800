public class H4_Test {
    public static void main(String[] args) {
        // Problem 1 Driver
        Pizza pizza1 = new PizzaBuilder().setSize("Medium").setChain("Pizza Hut").hasBacon(true).hasExtraCheese(true).hasMushrooms(true).createPizza();
        Pizza pizza2 = new PizzaBuilder().setSize("Medium").setChain("Pizza Hut").hasExtraCheese(true).hasBeef(true).hasChicken(true).hasHamPineapple(true).hasOlives(true).hasPeppers(true).createPizza();
        Pizza pizza3 = new PizzaBuilder().setSize("Medium").setChain("Pizza Hut").hasBacon(true).hasPesto(true).hasMushrooms(true).hasExtraCheese(true).hasBeef(true).hasChicken(true).hasHamPineapple(true).hasOlives(true).hasPeppers(true).createPizza();
        pizza1.eat();
        pizza2.eat();
        pizza3.eat();
        Pizza pizza4 = new PizzaBuilder().setSize("Large").setChain("Pizza Hut").hasChicken(true).hasPepperoni(true).hasHam(true).createPizza();
        Pizza pizza5 = new PizzaBuilder().setSize("Small").setChain("Pizza Hut").hasOnions(true).hasPeppers(true).createPizza();
        Pizza pizza6 = new PizzaBuilder().setSize("Medium").setChain("Little Caesars").hasBacon(true).hasMushrooms(true).hasExtraCheese(true).hasBeef(true).hasChicken(true).hasHamPineapple(true).hasOlives(true).hasPeppers(true).createPizza();
        Pizza pizza7 = new PizzaBuilder().setSize("Small").setChain("Little Caesars").hasExtraCheese(true).hasBeef(true).hasChicken(true).hasHamPineapple(true).hasOlives(true).hasPeppers(true).createPizza();;
        Pizza pizza8 = new PizzaBuilder().setSize("Small").setChain("Dominos").hasSpicyPork(true).createPizza();
        Pizza pizza9 = new PizzaBuilder().setSize("Large").setChain("Dominos").hasSpinach(true).hasSpicyPork(true).hasPesto(true).createPizza();
        pizza4.eat();
        pizza5.eat();
        pizza6.eat();
        pizza7.eat();
        pizza8.eat();
        pizza9.eat();

        System.out.println();
        
        // Problem 2 Driver
        CarbFactory carbs = new CarbFactory();
        ProteinFactory proteins = new ProteinFactory();
        FatFactory fats = new FatFactory();
        Macronutrient[] customer1 = {carbs.getMacronutrient("Paleo"),proteins.getMacronutrient("Paleo"),fats.getMacronutrient("Paleo")};
        System.out.printf("Customer 1's Paleo Meal: %s, %s, %s\n", customer1[0], customer1[1], customer1[2]);
        Macronutrient[] customer2 = {carbs.getMacronutrient("Vegan"),proteins.getMacronutrient("Vegan"),fats.getMacronutrient("Vegan")};
        System.out.printf("Customer 2's Vegan Meal: %s, %s, %s\n", customer2[0], customer2[1], customer2[2]);
        Macronutrient[] customer3 = {carbs.getMacronutrient("Nut Allergy"),proteins.getMacronutrient("Nut Allergy"),fats.getMacronutrient("Nut Allergy")};
        System.out.printf("Customer 3's Nut Allergy Meal: %s, %s, %s\n", customer3[0], customer3[1], customer3[2]);
        Macronutrient[] customer4 = {carbs.getMacronutrient("No Restriction"),proteins.getMacronutrient("No Restriction"),fats.getMacronutrient("No Restriction")};
        System.out.printf("Customer 4's No Restriction Meal: %s, %s, %s\n", customer4[0], customer4[1], customer4[2]);
        Macronutrient[] customer5 = {carbs.getMacronutrient("Vegan"),proteins.getMacronutrient("Vegan"),fats.getMacronutrient("Vegan")};
        System.out.printf("Customer 5's Vegan Meal: %s, %s, %s\n", customer5[0], customer5[1], customer5[2]);
        Macronutrient[] customer6 = {carbs.getMacronutrient("Paleo"),proteins.getMacronutrient("Paleo"),fats.getMacronutrient("Paleo")};
        System.out.printf("Customer 6's Paleo Meal: %s, %s, %s", customer6[0], customer6[1], customer6[2]);
    }
}
