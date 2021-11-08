package kata;

public class TeaOrder extends Order {

    public TeaOrder() {
    }

    public TeaOrder(String productName, String message) {
        super(productName, message);
    }

    @Override
    public double cost() {
        return 0.4;
    }
}
