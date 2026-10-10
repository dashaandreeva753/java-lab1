package number11;

import java.util.Objects;

public class StrictPoint {
    protected final int x;
    protected final int y;

    public StrictPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        StrictPoint other = (StrictPoint) obj;
        return x == other.x && y == other.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}