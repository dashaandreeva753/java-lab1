package number14;

public class Main {
    public static void main(String[] args) {
        Course course1 = new Course(
                "Java",
                new OnlineFormat(),
                new SubscriptionPayment(500)
        );

        Course course2 = new Course(
                "C++",
                new ClassroomFormat(),
                new FixedPayment(3000)
        );

        Course course3 = new Course(
                "Python",
                new HybridFormat(),
                new FreePayment()
        );

        Course course4 = new Course(
        "Основы программирования",
        new RecordedFormat(),
        new DonationPayment()
    );


        course1.showInfo();
        course2.showInfo();
        course3.showInfo();
        course4.showInfo();
    }
}