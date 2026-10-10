package number12;

public class Main {

    public static String describe(EnrollmentResult result) {
        return switch (result) {
            case Accepted a -> "Успешно: " + a.message();
            case Rejected r -> "Отказ: " + r.reason();
            case WaitListed w -> "Лист ожидания, позиция: " + w.position();
            case UnderReview u ->"На рассмотрении: " + u.message();
        };
    }

    public static void main(String[] args) {
        EnrollmentResult first = new Accepted("Студент записан");
        EnrollmentResult second = new Rejected("Нет предварительных знаний");
        EnrollmentResult third = new WaitListed(3);

        System.out.println(describe(first));
        System.out.println(describe(second));
        System.out.println(describe(third));
    }
}