public class PizzaBuilder {
    private String size;
    private String chain = null;
    private Boolean pepperoni = false;
    private Boolean sausage = false;
    private Boolean mushrooms = false;
    private Boolean bacon = false;
    private Boolean onions = false;
    private Boolean extraCheese = false;
    private Boolean peppers = false;
    private Boolean chicken = false;
    private Boolean olives = false;
    private Boolean spinach = false;
    private Boolean tomatoBasil = false;
    private Boolean beef = false;
    private Boolean ham = false;
    private Boolean pesto = false;
    private Boolean spicyPork = false;
    private Boolean hamPineapple = false;

    public PizzaBuilder() {}

    public PizzaBuilder setSize(String size) {
        this.size = size;
        return this;
    }

    public PizzaBuilder setChain(String chain) {
        this.chain = chain;
        return this;
    }

    public PizzaBuilder hasPepperoni(Boolean pepperoni) {
        this.pepperoni = pepperoni;
        return this;
    }

    public PizzaBuilder hasSausage(Boolean sausage) {
        this.sausage = sausage;
        return this;
    }

    public PizzaBuilder hasMushrooms(Boolean mushrooms) {
        this.mushrooms = mushrooms;
        return this;
    }

    public PizzaBuilder hasBacon(Boolean bacon) {
        this.bacon = bacon;
        return this;
    }

    public PizzaBuilder hasOnions(Boolean onions) {
        this.onions = onions;
        return this;
    }

    public PizzaBuilder hasExtraCheese(Boolean extraCheese) {
        this.extraCheese = extraCheese;
        return this;
    }

    public PizzaBuilder hasPeppers(Boolean peppers) {
        this.peppers = peppers;
        return this;
    }

    public PizzaBuilder hasChicken(Boolean chicken) {
        this.chicken = chicken;
        return this;
    }

    public PizzaBuilder hasOlives(Boolean olives) {
        this.olives = olives;
        return this;
    }

    public PizzaBuilder hasSpinach(Boolean spinach) {
        this.spinach = spinach;
        return this;
    }

    public PizzaBuilder hasTomatoBasil(Boolean tomatoBasil) {
        this.tomatoBasil = tomatoBasil;
        return this;
    }

    public PizzaBuilder hasBeef(Boolean beef) {
        this.beef = beef;
        return this;
    }

    public PizzaBuilder hasHam(Boolean ham) {
        this.ham = ham;
        return this;
    }

    public PizzaBuilder hasPesto(Boolean pesto) {
        this.pesto = pesto;
        return this;
    }

    public PizzaBuilder hasSpicyPork(Boolean spicyPork) {
        this.spicyPork = spicyPork;
        return this;
    }

    public PizzaBuilder hasHamPineapple(Boolean hamPineapple) {
        this.hamPineapple = hamPineapple;
        return this;
    }

    public Pizza createPizza() {
        return new Pizza(size, chain, pepperoni, sausage, mushrooms, bacon, onions, extraCheese, peppers, chicken, olives, spinach, tomatoBasil, beef, ham, pesto, spicyPork, hamPineapple);
    }
}
