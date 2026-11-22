package be.imgn.it;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Locale;
import org.junit.jupiter.api.Test;

class GreeterTest {

    @Test
    void greetsInUpperCase() {
        assertThat(new Greeter(Locale.ROOT).greet("world")).isEqualTo("Hello, WORLD");
    }
}
