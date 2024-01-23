import java.util.Arrays;

public class Bubblesort {
    public static void main(String... args) {
        int[] buffer = {44, 55, 1, 42, 2, 3, 77, 67, 76, 94, 18, 6, 67, 99, 100, 12, 43};
        int anzahl = buffer.length;
        System.out.println("Unsortiertes Array!");
        for (int k : buffer) {
            System.out.println("" + k);
        }
        for (int j = anzahl - 1; j >= 2; j--) {
            for (int i = 0; i <= j - 1; i++) {
                if (buffer[i] > buffer[i + 1]) {
                    int tausch = buffer[i];
                    buffer[i] = buffer[i + 1];
                    buffer[i + 1] = tausch;
                    System.out.println("buffer: " + Arrays.toString(buffer) + " " + i + " " + j + " " + buffer[i] + " " + buffer[j]);
                }
            }
        }
        System.out.println("\nSortiertes Array!");
        for (int j : buffer) {
            System.out.println("" + j);
        }
    }
}