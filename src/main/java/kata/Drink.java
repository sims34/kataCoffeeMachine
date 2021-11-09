package kata;

public  abstract class Drink {

    private String drinkName;
    private String drinkCode;

    public Drink() {
    }

    public Drink(String drinkName, String drinkCode) {
        this.drinkName = drinkName;
        this.drinkCode = drinkCode;
    }

    abstract double cost();

    public String getDrinkCode() {
        return drinkCode;
    }

    public String getDrinkName() {
        return drinkName;
    }

    public void setDrinkName(String drinkName) {
        this.drinkName = drinkName;
    }


}
