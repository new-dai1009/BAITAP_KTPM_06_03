public class OrderManager {
    private static OrderManager instance;

    private OrderManager() {}

    public static OrderManager getInstance() {
        if (instance == null) {
            instance = new OrderManager();
        }
        return instance;
    }

    public void processOrder(String order) {
        System.out.println("Xử lý đơn hàng: " + order);
    }
}