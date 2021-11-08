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
        if (DrinkDb.getDrinks().containsKey(order.getProductName().toLowerCase())) {
            sb.append(DrinkDb.getDrinks().get(order.getProductName().toLowerCase()));
            addSugar(order, sb);
            return sb.toString();
        }
        if(!order.getMessage().isEmpty()) return sb.append("M:").append(order.getMessage()).toString();
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

