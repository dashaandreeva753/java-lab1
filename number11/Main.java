package number11;

public class Main {

    public static void main(String[] args) {
        Point point = new Point(1, 2);
        ColoredPoint coloredPoint =
                new ColoredPoint(1, 2, "red");

        System.out.println("Проблемный вариант:");
        System.out.println(point.equals(coloredPoint));
        System.out.println(coloredPoint.equals(point));

        StrictPoint strictPoint = new StrictPoint(1, 2);
        StrictColoredPoint strictColoredPoint =
                new StrictColoredPoint(1, 2, "red");

        System.out.println("Строгая проверка классов:");
        System.out.println(strictPoint.equals(strictColoredPoint));
        System.out.println(strictColoredPoint.equals(strictPoint));

        ComposedPoint redPoint =
                new ComposedPoint(1, 2, "red");
        ComposedPoint anotherRedPoint =
                new ComposedPoint(1, 2, "red");

        System.out.println("Композиция:");
        System.out.println(redPoint.equals(anotherRedPoint));
    }
}