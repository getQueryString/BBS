import java.io.FileWriter;
import java.io.IOException;

public class Primzahlen {
    public static void main(String... args) throws IOException {
        boolean isPrime;
        FileWriter writer = new FileWriter("prime.txt");
        for (int num = 2; num < 100; num++) {
            isPrime = true;
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) writer.write(num + ", ");
        }
        writer.flush();
        writer.close();
    }
}