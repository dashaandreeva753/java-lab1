package number11;

import java.util.Objects;

public final class ComposedPoint {
    private final int x;
    private final int y;
    private final String color;

    public ComposedPoint(int x, int y, String color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof ComposedPoint other)) {
            return false;
        }

        return x == other.x
                && y == other.y
                && Objects.equals(color, other.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, color);
    }
}