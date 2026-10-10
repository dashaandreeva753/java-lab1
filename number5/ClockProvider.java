package number5;

import java.time.Instant;

public interface ClockProvider {
    Instant now();
}