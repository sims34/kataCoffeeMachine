package kata.domain;

public class OrangeJuice extends Drink {
    private final String name = this.getClass().getSimpleName();
    private final String code = "O:";

    public OrangeJuice() {
        setDrinkCode(code);
        setDrinkName(name);
    }

    @Override
    public double cost() {
        return 0.6;
    }
}
