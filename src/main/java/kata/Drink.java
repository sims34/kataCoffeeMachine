package kata;

public  abstract class Drink {

    private String drinkName;

    public Drink() {
    }

    public Drink(String drinkName) {
        this.drinkName = drinkName;
    }

    abstract double cost();

    public String getDrinkName() {
        return drinkName;
    }

    public void setDrinkName(String drinkName) {
        this.drinkName = drinkName;
    }


}
