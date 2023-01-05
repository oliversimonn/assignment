import java.io.FileWriter;
import java.io.IOException;

public class Printer {

    public static void printToConsole(String numbers) {
        System.out.print(numbers);
    }

    public static void printToFile(String numbers) {
        try {
            FileWriter myWriter = new FileWriter("text.txt");
            myWriter.write(numbers);
            myWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
