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
        if (Drink.getDrinks().containsKey(order.getProductName().toLowerCase())) {
            sb.append(Drink.getDrinks().get(order.getProductName().toLowerCase()));
            addSugar(order, sb);
            addStick(order, sb);
            return sb.toString();
        }
        return sb.append("M:Command invalid").toString();
    }

        private static void addStick(Order order, StringBuilder sb) {
        if(order.hasAStrick()) {
            sb.append(":0");
        }
        else
            sb.append(":");
    }

        private static void addSugar(Order order, StringBuilder sb) {
        if (order.getNumberOfSugar() > 0 ) {
            sb.append(String.valueOf(order.getNumberOfSugar()));
        }
    }

}

