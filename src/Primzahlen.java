import java.util.ArrayList;

public class Primzahlen {
    public static void main(String... args) {
        int primeCount = 0, arrayCount = 0, arrayCount2 = 1;
        long startTime = System.currentTimeMillis(), stepTime, stepElapsedTime;
        boolean isPrime;
        ArrayList<Long> timeArray = new ArrayList<>();
        for (int num = 1; num <= 100000; num += 2) {   // 1999990000    2000000000
            isPrime = true;
            arrayCount++;
            for (int i = 2; i < num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                //System.out.println(num);
                if (arrayCount % arrayCount2 == 0) {
                    arrayCount2 *= 10;
                    stepTime = System.currentTimeMillis();
                    stepElapsedTime = stepTime - startTime;
                    timeArray.add(stepElapsedTime);
                }
                primeCount++;
            }
        }
        System.out.println("\nListe der Zeiten: " + timeArray);
        long endTime = System.currentTimeMillis();
        long elapsedTimeMS = endTime - startTime;
        double elapsedTimeS = (double) (endTime - startTime) / 1000;
        System.out.println(primeCount + " Primzahlen gefunden (exklusive 2). Der Vorgang hat insg. " + elapsedTimeMS + " ms (" + elapsedTimeS + " s) gedauert.");
    }
}