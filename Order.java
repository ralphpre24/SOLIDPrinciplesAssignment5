public class Order {
    private double price;
    private int quantity;
    private String customerName;
    private String address;

    public Order(double price, int quantity, String customerName, String address) {
        this.price = price;
        this.quantity = quantity;
        this.customerName = customerName;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Order [price: " + price + ",\n       quantity: " + quantity + ",\n       customerName: " + customerName
                + ",\n       address: " + address + "]";
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getAddress() {
        return address;
    }
}
