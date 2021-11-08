package kata;

public class Tea extends Drink {

    public Tea() {
    }

    public Tea(String drinkName) {
        super(drinkName);
    }

    @Override
    public double cost() {
        return 0.4;
    }
}
