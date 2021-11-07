package kata;

import org.junit.Assert;
import org.junit.Test;

public class DrinkMatterTest {

    Order coffeeOrder = new Order("coffee", 0, false,"");
    Order teaOrder = new Order("tea", 0, false,"Welcome");
    Order chocoOrder = new Order("CHOCOLATE", 0, false,"Process ...");

   @Test
    public void shouldReturnCoffeWithOutSugarAndStick() {
       Assert.assertEquals("C::", OrderCommand.sendOrderToDrinkerMachine(coffeeOrder));
    }
    @Test
    public void shouldReturnTeaWithOutSugarAndStick() {
        Assert.assertEquals("T::", OrderCommand.sendOrderToDrinkerMachine(teaOrder));
    }

    @Test
    public void shouldReturnChocolateWithOutSugarAndStick() {
        Assert.assertEquals("H::", OrderCommand.sendOrderToDrinkerMachine(chocoOrder));
    }

    @Test
    public void shouldReturnCoffeWithOneSugarAndOneStick() {
        coffeeOrder.setHasAStrick(true);
        coffeeOrder.addSugar(1);
        Assert.assertEquals("C:1:0", OrderCommand.sendOrderToDrinkerMachine(coffeeOrder));
    }
    @Test
    public void shouldReturnCoffeWithTwoSugarAndOneStick() {
        coffeeOrder.setHasAStrick(true);
        coffeeOrder.addSugar(2);
        Assert.assertEquals("C:2:0", OrderCommand.sendOrderToDrinkerMachine(coffeeOrder));
    }
 @Test
    public void shouldReturnCoffeWithTwoSugarAndNoStick() {
        coffeeOrder.setHasAStrick(false);
        coffeeOrder.addSugar(2);
        Assert.assertEquals("C:2:", OrderCommand.sendOrderToDrinkerMachine(coffeeOrder));
    }

}

