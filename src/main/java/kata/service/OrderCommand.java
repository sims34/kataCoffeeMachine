package kata.service;

import kata.domain.Order;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class OrderCommand {

    private final static String SEPARATOR = ":";
    private final static String PATTERN = "#.#";
    private final static String MESSAGE = "M:";
    private final static String MESSAGE_ERROR = "M:missing ";

    public static String sendCommandToDrinkerMachine(Order order) {
        return prepareDrinkerMachineInstruction(order);
    }

    private static String prepareDrinkerMachineInstruction(Order order) {
        StringBuilder sb = new StringBuilder();
        if (!isCorrectAmount(order))
            return getMessageWithMissingMoney(order, sb);
        generateCode(order, sb);
        if (hasMessage(order))
            sb.append(MESSAGE).append(order.getMessage());
        return sb.toString();
    }

    private static void generateCode(Order order, StringBuilder sb) {
        sb.append(order.getDrink().getDrinkCode()).append(SEPARATOR);
        if (order.getNumberOfSugar() > 0) {
            sb.append(order.getNumberOfSugar()).append(SEPARATOR).append(order.getCodeStrick());
        } else
            sb.append(SEPARATOR);
    }

    private static boolean hasMessage(Order order) {
        return !order.getMessage().isEmpty();
    }

    private static String getMessageWithMissingMoney(Order order, StringBuilder sb) {
        DecimalFormat decimalFormat = new DecimalFormat(PATTERN);
        decimalFormat.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.ENGLISH));
        double result = order.getDrink().cost() - order.getAmount();
        String missingMoney = decimalFormat.format(result);
        return sb.append(MESSAGE_ERROR).append(missingMoney).toString();
    }

    private static boolean isCorrectAmount(Order order) {
        return order.getAmount() >= order.getDrink().cost();
    }

}

