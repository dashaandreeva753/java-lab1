package number7;

public class MetricsSender implements NotificationSender {

    private final NotificationSender delegate;
    private int calls = 0;

    public MetricsSender(NotificationSender delegate) {
        this.delegate = delegate;
    }

    @Override
    public void send(String recipient, String message) {
        calls++;

        try {
            delegate.send(recipient, message);
        } finally {
            System.out.println("[METRICS] Вызовов: " + calls);
        }
    }
}