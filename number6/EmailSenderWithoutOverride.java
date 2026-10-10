package number6;

public class EmailSenderWithoutOverride extends NotificationSender {

    public String send(Object recipient) {
        return "Email отправлен: " + recipient;
    }
}