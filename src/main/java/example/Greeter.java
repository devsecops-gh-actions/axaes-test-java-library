package example;

/** Ejemplo mínimo: función pura con test. Sustituir por el código del producto. */
public final class Greeter {

    private Greeter() {
    }

    public static String greet(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("name debe ser no vacío");
        }
        return "Hola, " + name.strip() + "!";
    }
}
