import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingFiles {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("Greetings.txt");
            // System.out.println("\nfis.toString():\n\t" + fis + "\n");
            Scanner scanner = new Scanner(fis);
            int i = 0;
            while (scanner.hasNextLine()) {
                System.out.println("Row " + ++i + ": " + scanner.nextLine());
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("\nException message:\n\t" + e.getMessage() + "\n");
        }
    }
}
