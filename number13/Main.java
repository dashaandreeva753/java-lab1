package number13;

public class Main {

    public static void notifyUser(
            NotificationSender sender, String message) {
        sender.send(message);
    }

    public static void main(String[] args) {
        NotificationSender email = new EmailSender();
        NotificationSender console = new ConsoleSender();

        notifyUser(email, "Курс открыт");
        notifyUser(console, "Курс открыт");
    }
}