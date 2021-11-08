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
        Order coffeeOrder = new Order("coffee", "");
        String expected = "C::";
        String actual = "";

        //Act
        actual = OrderCommand.sendCommandToDrinkerMachine(coffeeOrder);

        //Assert
        assertThat(expected).isEqualTo(actual);
    }

    @Test
    public void shouldReturnTeaWithOutSugarAndStick() {
        //Arrange
        Order teaOrder = new Order("tea", "Welcome");
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
        Order chocolateOrder = new Order("CHOCOLATE", "Process ...");
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
        Order coffeeOrder = new Order("coffee", "");
        coffeeOrder.addSugar(1);
        String expected = "C:1:0";
        String actual = "";

        //Act
        actual = OrderCommand.sendCommandToDrinkerMachine(coffeeOrder);

        //Assert
        assertThat(expected).isEqualTo(actual);

    }

    @Test
    public void shouldReturnCoffeWithTwoSugarAndOneStick() {
        //Arrange
        Order coffeeOrder = new Order("coffee", "");
        coffeeOrder.addSugar(2);
        String expected = "C:2:0";
        String actual = "";

        //Act
        actual = OrderCommand.sendCommandToDrinkerMachine(coffeeOrder);

        //Assert
        assertThat(expected).isEqualTo(actual);
    }

    @Test
    public void shouldReturnMessageIfOrderContainMessage() {
        Order coffeeOrder = new Order("", "Welcome ...");
        String expected = "M:Welcome ...";
        String actual = "";

        //Act
        actual = OrderCommand.sendCommandToDrinkerMachine(coffeeOrder);

        //Assert
        assertThat(expected).isEqualTo(actual);

    }
}

