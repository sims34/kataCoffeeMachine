package kata;

public class OrderCommand {


    public static String sendOrderToDrinkerMachine(String order) {
        if (isCoffeeOrTea(order, "coffee")) return "C::";
        if (isCoffeeOrTea(order, "tea")) return "T::";
        return "H::";
    }

    private static boolean isCoffeeOrTea(String order, String coffeeorTea) {
        if (order.equalsIgnoreCase(coffeeorTea)) return true;
        return false;
    }



}
