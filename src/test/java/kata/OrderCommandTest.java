package kata;

import kata.domain.*;
import kata.service.OrderCommand;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Use the pattern AAA (Arrange, Act, Assert) for write the tests
 * source : https://docs.microsoft.com/fr-fr/visualstudio/test/unit-test-basics?view=vs-2019
 * KATA : https://simcap.github.io/coffeemachine/cm-second-iteration.html
 * ex : https://github.com/mica16/TDD-Java-WealAppVTC/blob/master/pom.xml
 */

public class OrderCommandTest {

    @Test
    public void shouldReturnCoffeWithOutSugarAndStick() {
        //Arrange
        Drink coffee = new Coffee();
        Order order = new Order(coffee, "", coffee.cost());
        String expected = "C::";
        String actual = "";

        //Act
        actual = OrderCommand.sendCommandToDrinkerMachine(order);

        //Assert
        assertThat(expected).isEqualTo(actual);
    }

    @Test
    public void shouldReturnTeaWithMessageWithOutSugarAndStick() {
        //Arrange
        Drink tea = new Tea();
        Order teaOrder = new Order(tea, "Welcome", tea.cost());
        String expected = "T::M:Welcome";
        String actual = "";

        //Act
        actual = OrderCommand.sendCommandToDrinkerMachine(teaOrder);

        //Assert
        assertThat(expected).isEqualTo(actual);
    }

    @Test
    public void shouldReturnChocolateWithOutSugarAndStick() {
        //Arrange
        Drink choco = new Chocolate();
        Order chocolateOrder = new Order(choco, "", choco.cost());
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
        Drink coffee = new Coffee();
        Order order = new Order(coffee, "", coffee.cost());
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
        Drink coffee = new Coffee();
        Order coffeeOrder = new Order(coffee, "", coffee.cost());
        coffeeOrder.addSugar(2);
        String expected = "C:2:0";
        String actual = "";

        //Act
        actual = OrderCommand.sendCommandToDrinkerMachine(coffeeOrder);

        //Assert
        assertThat(expected).isEqualTo(actual);
    }
    @Test
    public void shouldReturnCodeAndMessageIfHasMessageInOrder() {
        //Arrange
        Drink coffee = new Coffee();
        Order coffeeOrder = new Order(coffee, "Welcome ...", coffee.cost());
        String expected = "C::M:Welcome ...";
        String actual = "";

        //Act
        actual = OrderCommand.sendCommandToDrinkerMachine(coffeeOrder);

        //Assert
        assertThat(expected).isEqualTo(actual);

    }

    @Test
    public void shouldReturnMessageIfAmountIsEqualsZero() {
        //Arrange
        Drink coffee = new Coffee();
        double amount = 0;
        Order orderwithPayment = new Order(coffee, "", amount);
        String expected = "M:missing 0.6";
        String actual = "";

        //Act
        actual = OrderCommand.sendCommandToDrinkerMachine(orderwithPayment);

        //Assert
        assertThat(expected).isEqualTo(actual);
    }

    @Test
    public void shouldReturnMessageIfAmountIsInferior() {
        Drink coffee = new Coffee();
        double amount = 0.4;
        Order orderwithPayment = new Order(coffee, "", amount);
        String expected = "M:missing 0.2";
        String actual = "";

        //Act
        actual = OrderCommand.sendCommandToDrinkerMachine(orderwithPayment);

        //Assert
        assertThat(expected).isEqualTo(actual);
    }
    @Test
    public void shouldReturnDrinkInstructionIfAmountIsSuperior() {
        Drink tea = new Tea();
        double amount = 1.05;
        Order orderwithPayment = new Order(tea, "", amount);
        orderwithPayment.addSugar(3);
        String expected = "T:3:0";
        String actual = "";

        //Act
        actual = OrderCommand.sendCommandToDrinkerMachine(orderwithPayment);

        //Assert
        assertThat(expected).isEqualTo(actual);
    }
    @Test
    public void shouldReturnOrangeJuice() {
        //Arrange
        Drink orangeJuice = new OrangeJuice();
        Order orangeOrder = new Order(orangeJuice, "", orangeJuice.cost());
        String expected = "O::";
        String actual = "";

        //Act
        actual = OrderCommand.sendCommandToDrinkerMachine(orangeOrder);

        //Assert
        assertThat(expected).isEqualTo(actual);
    }
    @Test
    @DisplayName("Use case for range juice price")
    public void shouldReturnMessageErrorIfAmountIsInferior() {
        //Arrange
        Drink orangeJuice = new OrangeJuice();
        double amount = 0.2;
        Order orangeOrder = new Order(orangeJuice, "", amount);
        String expected = "M:missing 0.4";
        String actual = "";

        //Act
        actual = OrderCommand.sendCommandToDrinkerMachine(orangeOrder);

        //Assert
        assertThat(expected).isEqualTo(actual);
    }
    @Test
    public void shouldReturnCodeAndMessageIfHasMessageInOrderOrange() {
        //Arrange
        Drink orangeJuice = new OrangeJuice();
        double amount = 0.6;
        Order orangeOrder = new Order(orangeJuice, "Test ...", amount);
        String expected = "O::M:Test ...";
        String actual = "";

        //Act
        actual = OrderCommand.sendCommandToDrinkerMachine(orangeOrder);

        //Assert
        assertThat(expected).isEqualTo(actual);
    }
}

