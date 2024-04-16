package part11_decomposition;

public class Example {
    public static long createOrder(long userId, String [] products, int [] prices, int counts){
        if(isShoppingCartValid(products, counts)){
            if(isCreateOrderAllowed(userId)){
                if(siTotalCostLessThanMax(prices, counts)){
                    return createOrderAfterValidation(userId, products, prices, counts);
                }else {
                    //TODO throw exception
                    return -3;
                }
            }else {
                //TODO throw exception
                return -4;
            }
        }else {
            //TODO throw exception
            return -5;
        }
    }

    private static long createOrderAfterValidation(long userId, String[] products, int[] prices, int counts) {
        long orderId = saveOrderToDatabase(userId, products, counts);
        String email = findEmailForUser(userId);
        sendOrderCompetedEmail(email, orderId, products, prices, counts);
        return orderId;
    }

    private static boolean isShoppingCartValid(String[] products, int counts) {
        return false;
    }

    private static boolean isCreateOrderAllowed(long userId) {
        return false;
    }

    private static boolean siTotalCostLessThanMax(int[] prices, int counts) {
        return false;
    }

    private static long saveOrderToDatabase(long userId, String[] products, int counts) {
        return -1;
    }

    private static String findEmailForUser(long userId) {
        return null;
    }

    private static void sendOrderCompetedEmail(String email, long orderId, String[] products, int[] prices, int counts) {
    }
    
}
