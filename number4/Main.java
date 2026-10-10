package number4;

public class Main {

    public static void main(String[] args) {
        AbstractNotificationSender email =
                new EmailNotificationSender();

        AbstractNotificationSender console =
                new ConsoleNotificationSender();

        email.send("user@example.com", "Привет!");
        console.send("Пользователь", "Добро пожаловать!");
    }
}
