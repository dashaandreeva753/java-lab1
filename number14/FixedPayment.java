package number14;

public class FixedPayment implements PaymentPolicy {
    private final double price;

    public FixedPayment(double price) {
        this.price = price;
    }

    @Override
    public String getDescription() {
        return "Фиксированная оплата";
    }

    @Override
    public double calculatePrice() {
        return price;
    }
}