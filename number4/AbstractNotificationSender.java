package number4;

public abstract class AbstractNotificationSender {

    public final void send(String recipient, String message) {
        if (recipient == null || recipient.isBlank()) {
            throw new IllegalArgumentException("Адресат не указан");
        }

        doSend(recipient, message);
    }

    protected abstract void doSend(String recipient, String message);
}
