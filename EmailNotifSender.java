public class EmailNotifSender implements NotificationSender {
    @Override
    public void sendNotification(Order order, String target) {
        // Simulate sending email notification
        System.out.println("Email Content:");
        System.out.println(order);
        System.out.println("Email notification sent to: " + target);
    }
}
