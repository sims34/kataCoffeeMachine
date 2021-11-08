package kata;

import java.util.HashMap;
import java.util.Map;

public class DrinkDb {

    public final static String COFFEE = "coffee";
    public final static String TEA = "tea";
    public final static String CHOCOLATE = "chocolate";

    static Map<String, Drink> drinks = new HashMap<>();

    public static Map<String, Drink> getDrinks() {
        drinks.put(COFFEE, new Coffee());
        drinks.put(TEA, new Tea());
        drinks.put(CHOCOLATE, new Chocolate());
        return drinks;
    }



}
