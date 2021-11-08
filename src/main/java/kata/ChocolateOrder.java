package kata;

public class ChocolateOrder extends Order {
    public ChocolateOrder() {
    }

    public ChocolateOrder(String productName, String message) {
        super(productName, message);
    }

    @Override
    public double cost() {
        return 0.5;
    }
}
