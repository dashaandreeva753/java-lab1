package number7;

public class RetrySender implements NotificationSender {

    private final NotificationSender delegate;
    private final int maxAttempts;

    public RetrySender(NotificationSender delegate, int maxAttempts) {
        this.delegate = delegate;
        this.maxAttempts = maxAttempts;
    }

    @Override
    public void send(String recipient, String message) {
        for (int i = 1; i <= maxAttempts; i++) {
            try {
                delegate.send(recipient, message);
                return;
            } catch (RuntimeException e) {
                System.out.println("[RETRY] Ошибка, попытка " + i);

                if (i == maxAttempts) {
                    throw e;
                }
            }
        }
    }
}