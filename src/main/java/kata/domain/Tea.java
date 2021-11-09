package kata.domain;

public class Tea extends Drink {
    private final String code = "T:";
    private final String name  = this.getClass().getSimpleName();
    public Tea() {
        setDrinkCode(this.code);
        setDrinkName(this.name);
    }
    @Override
    public double cost() {
        return 0.4;
    }
}
