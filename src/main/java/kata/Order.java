package kata;

public class Order {

    private String productName;
    private int numberOfSugar;
    private boolean hasAStrick;
    private String message;


    public Order() {}

    public Order(String productName, int numberOfSugar, boolean hasAStrick, String message) {
        this.productName = productName;
        this.numberOfSugar = numberOfSugar;
        this.hasAStrick = hasAStrick;
        this.message = message;
    }

    public void addSugar(int numberOfSugar) {
        this.numberOfSugar = numberOfSugar;
    }


    public String getProductName() {
        return productName;
    }


    public int getNumberOfSugar() {
        return numberOfSugar;
    }
    public boolean hasAStrick() {
        return hasAStrick;
    }

    public void setHasAStrick(boolean hasAStrick) {
        this.hasAStrick = hasAStrick;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
