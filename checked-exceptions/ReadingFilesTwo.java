import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingFilesTwo {
    public static void main(String[] args) {
        try {
            loadData("xGreetings.txt");
        } catch (FileNotFoundException e) {
            // TODO: handle exception
            System.out.println("Exception e.getMessage(): " + e.getMessage());
            System.out.println("Exception e.getLocalizedMessage(): " + e.getLocalizedMessage());
        }
    }

    public static void loadData(String name) throws FileNotFoundException {
        FileInputStream fis = new FileInputStream(name);
        Scanner scan = new Scanner(fis);
        while (scan.hasNextLine()) {
            System.out.println(scan.nextLine());
        }
        scan.close();
    }

}
