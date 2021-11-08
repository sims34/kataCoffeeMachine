package kata;

public abstract class Order implements  SugarInTheDrink{

    private String productName;
    private int numberOfSugar;
    private boolean hasAStrick;
    private String message;


    public Order() {}

    public Order(String productName, String message) {
        this.productName = productName;
        this.numberOfSugar = 0;
        this.hasAStrick = false;
        this.message = message;
    }
    public  abstract double cost();

    public void addSugar(int numberOfSugar) {
        this.numberOfSugar = numberOfSugar;
        this.hasAStrick = true;
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

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
