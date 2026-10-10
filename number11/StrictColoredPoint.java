package number11;

import java.util.Objects;

public class StrictColoredPoint extends StrictPoint {
    private final String color;

    public StrictColoredPoint(int x, int y, String color) {
        super(x, y);
        this.color = color;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        StrictColoredPoint other = (StrictColoredPoint) obj;

        return x == other.x
                && y == other.y
                && Objects.equals(color, other.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, color);
    }
}