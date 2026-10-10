package number6;

public class EmailSender extends NotificationSender {

    @Override
    public String send(String recipient) {
        return "Email отправлен: " + recipient;
    }

    @Override
    public Integer retryCount() {
        return 5;
    }

    @Override
    public void close() {
        System.out.println("Email-отправитель закрыт");
    }
}