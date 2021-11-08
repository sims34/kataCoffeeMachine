package kata;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Use the pattern AAA (Arrange, Act, Assert) for write the tests
 * source : https://docs.microsoft.com/fr-fr/visualstudio/test/unit-test-basics?view=vs-2019
 */

public class OrderCommandTest {

    @Test
    public void shouldReturnCoffeWithOutSugarAndStick() {
        //Arrange
        Order coffeeOrder = new Order("coffee", 0, false, "");
        String expected = "C::";
        String actual = "";

        //Act
        actual = OrderCommand.sendCommandToDrinkerMachine(coffeeOrder);

        //Assert
        assertThat(expected).isEqualTo(actual);
        // Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnTeaWithOutSugarAndStick() {
        //Arrange
        Order teaOrder = new Order("tea", 0, false, "Welcome");
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
        Order chocolateOrder = new Order("CHOCOLATE", 0, false, "Process ...");
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
        Order coffeeOrder = new Order("coffee", 0, false, "");
        coffeeOrder.setHasAStrick(true);
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
        Order coffeeOrder = new Order("coffee", 0, false, "");
        coffeeOrder.setHasAStrick(true);
        coffeeOrder.addSugar(2);
        String expected = "C:2:0";
        String actual = "";

        //Act
        actual = OrderCommand.sendCommandToDrinkerMachine(coffeeOrder);

        //Assert
        assertThat(expected).isEqualTo(actual);
    }

    @Test
    public void shouldReturnCoffeWithTwoSugarAndNoStick() {
        //Arrange
        Order coffeeOrder = new Order("coffee", 0, false, "");
        coffeeOrder.setHasAStrick(false);
        coffeeOrder.addSugar(2);
        String expected = "C:2:";
        String actual = "";

        //Act
        actual = OrderCommand.sendCommandToDrinkerMachine(coffeeOrder);

        //Assert
        assertThat(expected).isEqualTo(actual);
    }

}

