import java.util.function.Consumer;

public enum Destination {
    CONSOLE(Printer::printToConsole),
    FILE(Printer::printToFile),
    ;

    private final Consumer<String> printer;

    Destination(Consumer<String> printer) {
        this.printer = printer;
    }

    public void print(String string) {
        printer.accept(string);
    }
}
