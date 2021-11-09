package kata.domain;

public class DrinkExtraHot extends DrinkDecorator{
    private final String codeExtraHot="h";
    public DrinkExtraHot(Drink newDrink) {
        drink = newDrink;
    }
    @Override
    public double cost() {
        return 0;
    }

    @Override
    public String getDrinkCode() {
        return drink.getDrinkCode() + codeExtraHot;
    }
}
