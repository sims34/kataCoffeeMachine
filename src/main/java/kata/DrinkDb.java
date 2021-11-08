package kata;

import java.util.HashMap;
import java.util.Map;

public class DrinkDb {

    public final static String COFFEE = "coffee";
    public final static String TEA = "tea";
    public final static String CHOCOLATE = "chocolate";

    static Map<String, String> drinks = new HashMap<>();

    public static Map<String, String> getDrinks() {
        drinks.put(COFFEE, "C:");
        drinks.put(TEA, "T:");
        drinks.put(CHOCOLATE, "H:");
        return drinks;
    }
}
