package kata;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class OrderCommand {


    public static String sendCommandToDrinkerMachine(Order order) {
        return prepareDrinkerMachineInstruction(order);
    }

    private static String prepareDrinkerMachineInstruction(Order order) {
        StringBuilder sb = new StringBuilder();
        if (hasOnlyMessage(order))
            return sb.append("M:").append(order.getMessage()).toString();
        if (!isCorrectAmount(order))
            return getMessageWithMissingMoney(order, sb);
        sb.append(getDrinkCode(order));
        addSugar(order, sb);
        return sb.toString();
    }

    private static boolean hasOnlyMessage(Order order) {
        return !order.getMessage().isEmpty() && order.getDrink().getDrinkName().isEmpty();
    }

    private static String getDrinkCode(Order order) {
        return order.getDrink().getDrinkCode();
    }

    private static String getMessageWithMissingMoney(Order order, StringBuilder sb) {
        DecimalFormat decimalFormat = new DecimalFormat("#.#");
        decimalFormat.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.ENGLISH));
        String missingMoney = decimalFormat.format(order.getDrink().cost() - order.getAmount());
        return sb.append("M:missing ").append(missingMoney).toString();
    }

    private static boolean isCorrectAmount(Order order) {
        return order.getAmount() >= order.getDrink().cost();
    }

    private static void addSugar(Order order, StringBuilder sb) {
        if (order.getNumberOfSugar() > 0) {
            sb.append(String.valueOf(order.getNumberOfSugar())).append(":0");
        } else
            sb.append(":");
    }
}

