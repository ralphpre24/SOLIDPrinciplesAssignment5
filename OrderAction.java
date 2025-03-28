public class OrderAction implements OrderCalculable, OrderPlaceable {

    private Order order;

    public OrderAction(Order order) {
        this.order = order;
    }

    @Override
    public void calculateTotal() {
        double total = order.getPrice() * order.getQuantity();
        System.out.println("Order total: $" + total);
    }

    @Override
    public void placeOrder() {
        // Simulate placing order in a system
        System.out.println("Order placed for " + order.getCustomerName() + " at " + order.getAddress());
    }
}
