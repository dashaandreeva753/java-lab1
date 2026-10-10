package number11;

import java.util.Objects;

public class ColoredPoint extends Point {
    private final String color;

    public ColoredPoint(int x, int y, String color) {
        super(x, y);
        this.color = color;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof ColoredPoint other)) {
            return false;
        }

        return super.equals(other)
                && Objects.equals(color, other.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, color);
    }
}