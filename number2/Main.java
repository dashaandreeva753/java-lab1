package number2;

public class Main {

    public static void main(String[] args) {

        NotificationSender sender1 = new EmailSender();
        NotificationSender sender2 = new ConsoleSender();

        sender1.send();
        sender2.send();

        sender1.send("Hello");

        EmailSender sender3 = new EmailSender();
        sender3.send();
        sender3.send("Java");
    }
}