package number14;

public class SubscriptionPayment implements PaymentPolicy {
    private final double monthlyPrice;

    public SubscriptionPayment(double monthlyPrice) {
        this.monthlyPrice = monthlyPrice;
    }

    @Override
    public String getDescription() {
        return "Подписка";
    }

    @Override
    public double calculatePrice() {
        return monthlyPrice;
    }
}