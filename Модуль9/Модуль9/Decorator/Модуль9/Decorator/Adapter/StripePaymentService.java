package Adapter;

public class StripePaymentService {
    public void makeTransaction(double totalAmount) {
        System.out.println("Processing $" + totalAmount + " payment through Stripe.");
    }
}
