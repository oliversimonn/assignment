import java.util.stream.IntStream;

public class NumberPrinter {

    public String printNumbers(int fooDivider, int faaDivider, Destination destination) {
        StringBuilder sb = new StringBuilder();

        IntStream.rangeClosed(1, 100)
                .forEach(i -> {
                    String lineToPrint = "";
                    lineToPrint += i % fooDivider == 0 ? "foo" : "";
                    lineToPrint += i % faaDivider == 0 ? "faa" : "";
                    sb.append(lineToPrint.isEmpty() ? i : lineToPrint).append("\n");
                });

        destination.print(sb.toString());

        return sb.toString();
    }
}
