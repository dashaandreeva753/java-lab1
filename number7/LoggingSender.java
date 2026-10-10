package number7;

public class LoggingSender implements NotificationSender {

    private final NotificationSender delegate;

    public LoggingSender(NotificationSender delegate) {
        this.delegate = delegate;
    }

    @Override
    public void send(String recipient, String message) {
        System.out.println("[LOG] Начало отправки");

        try {
            delegate.send(recipient, message);
            System.out.println("[LOG] Отправка успешна");
        } catch (RuntimeException e) {
            System.out.println("[LOG] Ошибка: " + e.getMessage());
            throw e;
        }
    }
}