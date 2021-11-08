package kata;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Use the pattern AAA (Arrange, Act, Assert) for write the tests
 * source : https://docs.microsoft.com/fr-fr/visualstudio/test/unit-test-basics?view=vs-2019
 */

public class OrderCommandTest {

    @Test
    public void shouldReturnCoffeWithOutSugarAndStick() {
        //Arrange
        Drink coffee = new Coffee("coffee");
        Order order = new Order(coffee,"", 0);
        String expected = "C::";
        String actual = "";

        //Act
        actual = OrderCommand.sendCommandToDrinkerMachine(order);

        //Assert
        assertThat(expected).isEqualTo(actual);
    }

    @Test
    public void shouldReturnTeaWithOutSugarAndStick() {
        //Arrange
        Drink tea = new Tea("tea");
        Order teaOrder = new Order(tea, "Welcome", 0);
        String expected = "T::";
        String actual = "";

        //Act
        actual = OrderCommand.sendCommandToDrinkerMachine(teaOrder);

        //Assert
        assertThat(expected).isEqualTo(actual);
    }

    @Test
    public void shouldReturnChocolateWithOutSugarAndStick() {
        //Arrange
        Drink choco = new Chocolate("chocolate");
        Order chocolateOrder = new Order(choco, "",0);
        String expected = "H::";
        String actual = "";

        //Act
        actual = OrderCommand.sendCommandToDrinkerMachine(chocolateOrder);

        //Assert
        assertThat(expected).isEqualTo(actual);
    }

    @Test
    public void shouldReturnCoffeWithOneSugarAndOneStick() {
        //Arrange
        Drink coffee = new Coffee("coffee");
        Order order = new Order(coffee,"",0);
        order.addSugar(1);
        String expected = "C:1:0";
        String actual = "";

        //Act
        actual = OrderCommand.sendCommandToDrinkerMachine(order);

        //Assert
        assertThat(expected).isEqualTo(actual);

    }

    @Test
    public void shouldReturnCoffeWithTwoSugarAndOneStick() {
        //Arrange
        Drink coffee = new Coffee("coffee");
        Order coffeeOrder = new Order(coffee,"", 0);
        coffeeOrder.addSugar(2);
        String expected = "C:2:0";
        String actual = "";

        //Act
        actual = OrderCommand.sendCommandToDrinkerMachine(coffeeOrder);

        //Assert
        assertThat(expected).isEqualTo(actual);
    }

    @Test
    public void shouldReturnMessageIfOrderContainOnlyMessage() {
       //Arrange
        Drink coffee = new Coffee("coffee");
        coffee.setDrinkName("");
        Order coffeeOrder = new Order(coffee, "Welcome ...",0);
        String expected = "M:Welcome ...";
        String actual = "";

        //Act
        actual = OrderCommand.sendCommandToDrinkerMachine(coffeeOrder);

        //Assert
        assertThat(expected).isEqualTo(actual);

    }

    @Test
    public void shouldReturnCoffeeWithNoSugarAndStickIfAmountIsCorrect() {
        //Arrange
        Drink coffee = new Coffee("coffee");
        double amount = 0.6;
        Order orderwithPayment = new Order(coffee, "", amount);
        orderwithPayment.setAmount(0.6);
        String expected ="C::";
        String actual ="";

        //Act
        actual = OrderCommand.sendCommandToDrinkerMachine(orderwithPayment);

        //Assert
        assertThat(expected).isEqualTo(actual);
    }
}

