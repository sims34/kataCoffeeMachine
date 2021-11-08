package kata;

public class Coffee extends Drink {
    public final static String CODE_COFFEE = "C:";

    public Coffee() {
    }

    public Coffee(String drinkName, String drinkCode) {
        super(drinkName, drinkCode);
    }

    @Override
    public double cost() {
        return 0.6;
    }
}
