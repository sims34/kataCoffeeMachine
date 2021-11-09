package kata.domain;

public class OrangeJuice extends Drink {
    private final String code = "O";
    private final String name = this.getClass().getSimpleName();

    public OrangeJuice() {
        setDrinkCode(code);
        setDrinkName(name);
    }

    @Override
    public double cost() {
        return 0.6;
    }
}
