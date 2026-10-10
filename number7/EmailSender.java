package number7;

public class EmailSender implements NotificationSender {

    private int attempts = 0;

    @Override
    public void send(String recipient, String message) {
        attempts++;

        System.out.println("Попытка отправки №" + attempts);

        if (attempts == 1) {
            throw new RuntimeException("Временная ошибка отправки");
        }

        System.out.println("Email отправлен на " + recipient + ": " + message);
    }
}