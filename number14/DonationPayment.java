package number14;

public class DonationPayment implements PaymentPolicy {
    @Override
    public String getDescription() {
        return "Добровольный взнос";
    }

    @Override
    public double calculatePrice() {
        return 100;
    }
}