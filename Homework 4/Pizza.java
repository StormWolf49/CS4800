public class Pizza {
    private String size;
    private String chain;
    private Boolean pepperoni;
    private Boolean sausage;
    private Boolean mushrooms;
    private Boolean bacon;
    private Boolean onions;
    private Boolean extraCheese;
    private Boolean peppers;
    private Boolean chicken;
    private Boolean olives;
    private Boolean spinach;
    private Boolean tomatoBasil;
    private Boolean beef;
    private Boolean ham;
    private Boolean pesto;
    private Boolean spicyPork;
    private Boolean hamPineapple;

    public Pizza(String size, String chain, Boolean pepperoni, Boolean sausage, Boolean mushrooms, Boolean bacon, Boolean onions, Boolean extraCheese, Boolean peppers, Boolean chicken, Boolean olives, Boolean spinach, Boolean tomatoBasil, Boolean beef, Boolean ham, Boolean pesto, Boolean spicyPork, Boolean hamPineapple) {
        this.size = size;
        this.chain = chain;
        this.pepperoni = pepperoni;
        this.sausage = sausage;
        this.mushrooms = mushrooms;
        this.bacon = bacon;
        this.onions = onions;
        this.extraCheese = extraCheese;
        this.peppers = peppers;
        this.chicken = chicken;
        this.olives = olives;
        this.spinach = spinach;
        this.tomatoBasil = tomatoBasil;
        this.beef = beef;
        this.ham = ham;
        this.pesto = pesto;
        this.spicyPork = spicyPork;
        this.hamPineapple = hamPineapple;
    }

    public void eat() {
        String output = size + " Pizza from " + chain + " with:";
        if(pepperoni) output+= " Pepperoni";
        if(sausage) output += " Sausage";
        if(mushrooms) output += " Mushrooms";
        if(bacon) output += " Bacon";
        if(onions) output += " Onions";
        if(extraCheese) output += " Extra Cheese";
        if(peppers) output += " Peppers";
        if(chicken) output += " Chicken";
        if(olives) output += " Olives";
        if(spinach) output += " Spinach";
        if(tomatoBasil) output += " Tomato and Basil";
        if(beef) output += " Beef";
        if(ham) output += " Ham";
        if(pesto) output += " Pesto";
        if(spicyPork) output += " Spicy Pork";
        if(hamPineapple) output += " Ham and Pineapple";
        System.out.println(output);
    }
}
