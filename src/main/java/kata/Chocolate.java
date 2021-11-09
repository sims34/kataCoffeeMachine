package kata;

public class Chocolate extends Drink {
    public final static String CODE_CHOCOLATE = "H:";

    public Chocolate() {
    }

    public Chocolate(String drinkName, String drinkCode) {
        super(drinkName, drinkCode);
    }

    @Override
    public double cost() {
        return 0.5;
    }
}
