package kata;

public class Coffee extends Drink {

    public Coffee() {
    }

    public Coffee(String drinkName) {
        super(drinkName);
    }

    @Override
    public double cost() {
        return 0.6;
    }
}
