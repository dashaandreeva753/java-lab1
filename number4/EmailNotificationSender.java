package number4;

public class EmailNotificationSender extends AbstractNotificationSender {

    @Override
    protected void doSend(String recipient, String message) {
        System.out.println("Отправка email на " + recipient + ": " + message);
    }
}