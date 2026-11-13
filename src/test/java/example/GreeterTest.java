package example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class GreeterTest {

    @Test
    void saludaAlNombreRecortado() {
        assertEquals("Hola, Ana!", Greeter.greet("  Ana "));
    }

    @Test
    void rechazaUnNombreVacio() {
        assertThrows(IllegalArgumentException.class, () -> Greeter.greet("   "));
    }
}
