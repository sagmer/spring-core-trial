package app;

public class ParameterizedGreeter implements Greeter {
    private final String name;

    public ParameterizedGreeter(String name) {
        this.name = name;
    }

    public String greet() {
        return "Hi " + name;
    }
}
