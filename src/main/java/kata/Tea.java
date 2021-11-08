package kata;

public class Tea extends Drink {
    public final static String CODE_TEA = "T:";

    public Tea() {
    }

    public Tea(String drinkName, String drinkCode) {
        super(drinkName, drinkCode);
    }


    @Override
    public double cost() {
        return 0.4;
    }
}
