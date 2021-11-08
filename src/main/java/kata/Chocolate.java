package kata;

public class Chocolate extends Drink {
    public Chocolate() {
    }

    public Chocolate(String drinkName) {
        super(drinkName);
    }

    @Override
    public double cost() {
        return 0.5;
    }
}
