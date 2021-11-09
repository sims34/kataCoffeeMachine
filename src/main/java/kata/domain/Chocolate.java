package kata.domain;

public class Chocolate extends Drink {
    public final  String code = "H";
    public final  String name = this.getClass().getSimpleName();

    public Chocolate() {
        setDrinkCode(code);
        setDrinkName(name);
    }
    @Override
    public double cost() {
        return 0.5;
    }

}
