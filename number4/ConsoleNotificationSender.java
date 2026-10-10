package number4;

public class ConsoleNotificationSender extends AbstractNotificationSender {

    @Override
    protected void doSend(String recipient, String message) {
        System.out.println("Сообщение для " + recipient + ": " + message);
    }
}
