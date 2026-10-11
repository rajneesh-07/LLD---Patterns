package LLD_DesignPatterns.Observer;

public class Main {
    public static void main(String[] args) {
        OrderService orderService = OrderService.getObject();
        CustomerNotificationService notificationService = new CustomerNotificationService();
        InvoiceGenerationService invoiceService = new InvoiceGenerationService();

        orderService.add(notificationService);
        orderService.add(invoiceService);

        orderService.placeOrder();
        orderService.placeOrder();

        System.out.println("----------------");
        OrderService orderService1 = OrderService.getObject();
        CustomerNotificationService customerNotificationService = new CustomerNotificationService();
        InvoiceGenerationService invoiceGenerationService = new InvoiceGenerationService();

        orderService1.add(customerNotificationService);
        orderService1.add(invoiceGenerationService);

        orderService1.placeOrder();
        orderService1.placeOrder();
    }
}
