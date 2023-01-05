import org.silentsoft.arguments.parser.Arguments;
import org.silentsoft.arguments.parser.ArgumentsParser;
import org.silentsoft.arguments.parser.InvalidArgumentsException;

public class Assignment {

    public static void main(String[] args) throws InvalidArgumentsException {
        Arguments arguments = ArgumentsParser.parse(args);
        String fooDivider = arguments.containsKey("--fooDivider") ? arguments.get("--fooDivider").getValue() : "2";
        String faaDivider = arguments.containsKey("--faaDivider") ? arguments.get("--faaDivider").getValue() : "4";
        String destination = arguments.containsKey("--destination") ? arguments.get("--destination").getValue() : "CONSOLE";

        NumberPrinter numberPrinter = new NumberPrinter();
        numberPrinter.printNumbers(Integer.parseInt(fooDivider), Integer.parseInt(faaDivider), Destination.valueOf(destination));
    }
}
