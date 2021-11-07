package kata;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class DrinkMatterTest {

    @Test
    public void shouldReturnCoffeWithOutSugarAndStick() {
        Assert.assertEquals("C::", OrderCommand.sendOrderToDrinkerMachine("coffee"));
    }
    @Test
    public void shouldReturnTeaWithOutSugarAndStick() {
        Assert.assertEquals("T::", OrderCommand.sendOrderToDrinkerMachine("tea"));
    }
    @Test
    public void shouldReturnChocolateWithOutSugarAndStick() {
        Assert.assertEquals("H::", OrderCommand.sendOrderToDrinkerMachine(""));
    }

}

