package kata.domain;

public  abstract class DrinkDecorator extends Drink {
    protected Drink drink;
    public abstract String getDrinkCode();
}
