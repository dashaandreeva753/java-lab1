package number14;

public class FreePayment implements PaymentPolicy {
    @Override
    public String getDescription() {
        return "Бесплатно";
    }

    @Override
    public double calculatePrice() {
        return 0;
    }
}