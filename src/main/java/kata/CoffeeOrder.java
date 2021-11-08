package kata;

public class CoffeeOrder extends Order {

    public CoffeeOrder() {
    }

    public CoffeeOrder(String productName, String message) {
        super(productName, message);
    }

    @Override
    public double cost() {
        return 0.6;
    }
}
