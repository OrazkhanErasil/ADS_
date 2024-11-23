package Adapter;

public class PaymentTest {
    public static void main(String[] args) {
        IPaymentProcessor paypalProcessor = new PayPalPaymentProcessor();
        IPaymentProcessor stripeProcessor = new StripePaymentAdapter(new StripePaymentService());

        // Обработка платежей
        paypalProcessor.processPayment(100.0);
        stripeProcessor.processPayment(150.0);
    }
}
