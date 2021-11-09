package kata;

import kata.domain.Chocolate;
import kata.domain.Coffee;
import kata.domain.DrinkExtraHot;
import kata.domain.Order;
import kata.service.OrderCommand;

public class Main  {

    public static void main(String[] args) {
        Order order = new Order(new DrinkExtraHot(new Chocolate()),"Test", 0.6);
        order.addSugar(3);
        String res =
        OrderCommand.sendCommandToDrinkerMachine(order);

        System.out.println(res);
    }
}
