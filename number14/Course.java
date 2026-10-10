package number14;

public class Course {
    private final String title;
    private final CourseFormat format;
    private final PaymentPolicy payment;

    public Course(String title, CourseFormat format,
                  PaymentPolicy payment) {
        this.title = title;
        this.format = format;
        this.payment = payment;
    }

    public void showInfo() {
        System.out.println("Курс: " + title);
        System.out.println("Формат: " + format.getDescription());
        System.out.println("Оплата: " + payment.getDescription());
        System.out.println("Стоимость: "
                + payment.calculatePrice() + " руб.");
        System.out.println();
    }
}