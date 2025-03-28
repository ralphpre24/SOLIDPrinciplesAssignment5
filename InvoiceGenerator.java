public class InvoiceGenerator implements Generator{
    @Override
    public void generate(Order order, String target)
    {
        System.out.println("Invoice Content: ");
        System.out.println(order);
        System.out.println("Invoice Generated: " + target);
    }
}
