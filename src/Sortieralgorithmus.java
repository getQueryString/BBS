import java.util.Arrays;

public class Sortieralgorithmus {
    public static void main(String... args) {
        sort();
        System.out.println("\n");
        selectionSort();
    }

    static void sort() {
        for (int i = 1; i <= 35; i++) {
            if (i % 3 == 0 && i % 2 == 0) System.out.println("Zahl " + i + " ist durch 3 und 2 teilbar.");
        }
    }

    static void selectionSort() {
        int[] buffer = {44, 55, 12, 42, 94, 18, 6, 67};
        int anzahl = buffer.length;
        int x, tausch;
        System.out.println("Unsortiert: " + Arrays.toString(buffer));
        for (int a = 1; a < anzahl - 1; a++) {
            x = 0;
            for (int i = 0; i < anzahl - a; i++) {
                if (buffer[i] > x && buffer[i] > buffer[buffer.length - a]) {
                    x = buffer[i];
                    tausch = buffer[i];
                    buffer[i] = buffer[buffer.length - a];
                    buffer[buffer.length - a] = tausch;
                }
            }
        }
        System.out.println("Sortiert: " + Arrays.toString(buffer));
    }
}
