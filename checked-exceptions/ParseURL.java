import java.net.MalformedURLException;
import java.net.URL;

public class ParseURL {
    public static void main(String[] args) throws MalformedURLException {
        try {
            URL url = new URL("https://www.google.com/images");
            System.out.println("Protocol: " + url.getProtocol());
            System.out.println("Host: " + url.getHost());
            System.out.println("Path: " + url.getPath());
        } catch (MalformedURLException e) {
            System.out.println("MalformedURLException: " + e.getMessage());
        }

    }

}
