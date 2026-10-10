package number6;

public class NotificationSender {

    public String send(String recipient) {
        return "Общая отправка: " + recipient;
    }

    public Number retryCount() {
        return 3;
    }

    public void close() {
        System.out.println("Отправитель закрыт");
    }
}