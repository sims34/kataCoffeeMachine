package kata.service;

import kata.domain.OrangeJuice;
import kata.domain.Order;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class OrderCommand {


    public static String sendCommandToDrinkerMachine(Order order) {
        return prepareDrinkerMachineInstruction(order);
    }

    private static String prepareDrinkerMachineInstruction(Order order) {
        StringBuilder sb = new StringBuilder();
        if (!isCorrectAmount(order))
            return getMessageWithMissingMoney(order, sb);
        generateCode(order, sb);
        if (hasMessage(order))
            sb.append("M:").append(order.getMessage());
        return sb.toString();
    }

    private static void generateCode(Order order, StringBuilder sb) {
        sb.append(order.getDrink().getDrinkCode());
        if (order.getNumberOfSugar() > 0) {
            sb.append(order.getNumberOfSugar()).append(":0");
        } else
            sb.append(":");
    }

    private static boolean hasMessage(Order order) {
        return !order.getMessage().isEmpty() ;
    }
   private static String getMessageWithMissingMoney(Order order, StringBuilder sb) {
        DecimalFormat decimalFormat = new DecimalFormat("#.#");
        decimalFormat.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.ENGLISH));
        double result = order.getDrink().cost() - order.getAmount();
        String missingMoney = decimalFormat.format(result);
        return sb.append("M:missing ").append(missingMoney).toString();
    }

    private static boolean isCorrectAmount(Order order) {
        return order.getAmount() >= order.getDrink().cost();
    }

}

