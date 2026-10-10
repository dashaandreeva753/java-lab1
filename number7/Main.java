package number7;

public class Main {

    public static void main(String[] args) {
        System.out.println("Вариант 1 ");

        NotificationSender sender1 =
                new MetricsSender(
                        new RetrySender(
                                new LoggingSender(new EmailSender()), 2
                        )
                );

        try {
            sender1.send("user@example.com", "Привет!");
        } catch (RuntimeException e) {
            System.out.println("Отправка не удалась");
        }

        System.out.println("\n Вариант 2 ");

        NotificationSender sender2 =
                new RetrySender(
                        new MetricsSender(
                                new LoggingSender(new EmailSender())
                        ), 2
                );

        try {
            sender2.send("user@example.com", "Привет!");
        } catch (RuntimeException e) {
            System.out.println("Отправка не удалась");
        }
    }
}