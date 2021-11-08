package kata;

public class Order implements  SugarInTheDrink{

    private Drink drink;
    private int numberOfSugar;
    private boolean hasAStrick;
    private String message;
    private double amount;

    public Order() {}

    public Order(Drink productName, String message, double amount) {
        this.drink = productName;
        this.message = message;
        this.amount = amount;
        this.hasAStrick = false;
        this.numberOfSugar = 0;
    }

    public void addSugar(int numberOfSugar) {
        this.numberOfSugar = numberOfSugar;
        this.hasAStrick = true;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Drink getDrink() {
        return drink;
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
