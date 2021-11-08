package kata;

public class OrderCommand {


        public static String sendCommandToDrinkerMachine(Order order) {
            return createCommand(order);
        }

        private static String createCommand(Order order) {
            return getDrinkInstruction(order);
        }

        private static String getDrinkInstruction(Order order) {
        StringBuilder sb = new StringBuilder();
        if (order.getAmount() == 0) return sb.append("M:missing ").append(order.getDrink().cost()).toString();
        if (DrinkProtocolDb.getDrinksProtocol().containsKey(order.getDrink().getDrinkName().toLowerCase())) {
            sb.append(DrinkProtocolDb.getDrinksProtocol().get(order.getDrink().getDrinkName().toLowerCase()));
            addSugar(order, sb);
            return sb.toString();
        }
        if(!order.getMessage().isEmpty())  sb.append("M:").append(order.getMessage());
        return sb.toString();
    }

        private static void addSugar(Order order, StringBuilder sb) {
        if (order.getNumberOfSugar() > 0 ) {
            sb.append(String.valueOf(order.getNumberOfSugar())).append(":0");
        }
        else
            sb.append(":");
    }
}

