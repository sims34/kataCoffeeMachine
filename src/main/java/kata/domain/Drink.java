package kata.domain;

public  abstract class Drink {

    private String drinkName;
    private String drinkCode;

    public abstract double cost();

    public String getDrinkCode() {
        return drinkCode;
    }

    public String getDrinkName() {
        return drinkName;
    }

    public void setDrinkName(String drinkName) {
        this.drinkName = drinkName;
    }

    public void setDrinkCode(String drinkCode) {
        this.drinkCode = drinkCode;
    }
}
