package kata.domain;

public class Coffee extends Drink   {
    public final  String code = "C";
    public final  String name = this.getClass().getSimpleName();

    public Coffee() {
        setDrinkName(name);
        setDrinkCode(code);
    }
    @Override
    public double cost() {
        return 0.6;
    }
}
