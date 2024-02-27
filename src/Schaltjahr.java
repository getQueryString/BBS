import java.util.Scanner;

public class Schaltjahr {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Gebe eine Zahl ein: ");
        int input = sc.nextInt();

        //for (int i = 0; i < 2025; i++) {
        if (istSchaltjahr(input)) System.out.println(input + " ist ein Schaltjahr.");
        else System.out.println(input + " ist kein Schaltjahr.");
        //} // end of for
    }

    static boolean istSchaltjahr(int jahr) {
        // return (jahr % 4 == 0 && jahr % 100 != 0) || (jahr % 4 == 0 && jahr % 100 == 0 && jahr % 400 == 0);
        return jahr % 4 == 0 && (jahr % 100 != 0 || jahr % 400 == 0);
    }
}