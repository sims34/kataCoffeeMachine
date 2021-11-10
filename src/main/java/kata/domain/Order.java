package kata.domain;

public class Order implements SugarInTheDrink {

    private Drink drink;
    private final String codeStick = "0";
    private int numberOfSugar;
    private String message;
    private double amount;

    public Order(Drink productName, String message, double amount) {
        this.drink = productName;
        this.message = message;
        this.amount = amount;
        this.numberOfSugar = 0;
    }

    public void addSugar(int numberOfSugar) {
        this.numberOfSugar = numberOfSugar;
    }
    public double getAmount() {
        return amount;
    }

    public Drink getDrink() {
        return drink;
    }

    public int getNumberOfSugar() {
        return numberOfSugar;
    }

    public String getMessage() {
        return message;
    }

    public String getCodeStick() {
        return codeStick;
    }
}
