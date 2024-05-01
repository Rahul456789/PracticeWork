
import java.util.*;

public class StringTokenizer {
    public static void main(String[] args) {
        StringTokenizer st1 = new StringTokenizer("Hello Geeks How are you", " ");

        while (st1.hasMoreTokens()) {
            // Getting next tokens
            System.out.println(st1.nextToken());
        }

    }
}
