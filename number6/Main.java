package number6;

public class Main {

    public static void main(String[] args) {
        NotificationSender sender = new EmailSender();
        System.out.println(sender.send("user@example.com"));

        EmailSenderWithoutOverride wrong =
                new EmailSenderWithoutOverride();

        NotificationSender sender2 = wrong;
        System.out.println(sender2.send("user@example.com"));

        System.out.println(sender.retryCount());
        sender.close();
    }
}