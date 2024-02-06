import java.util.Scanner;

public class Exponentialfunktion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Basis: ");
        String inputXstr = sc.nextLine();
        double inputX = Double.parseDouble(inputXstr);
        System.out.print("Exponent: ");
        String inputYstr = sc.nextLine();
        double inputY = Double.parseDouble(inputYstr);

        System.out.println(xHochY(inputX, inputY));
    }

    static double xHochY(double x, double y) {
        // Würden alle Möglichkeiten berücksichtigt, wäre der Code für die kleine Aufgabe zu komplex.
        // Siehe z. B. FdLibm.java
        double result;
        if (y < 0) return 0.0;
        if (y > 0.0) {
            if (y == 0.5 && x >= -Double.MAX_VALUE) return Math.sqrt(x + 0.0);
            else {
                result = x;
                for (int i = 0; i < y - 1.0; result *= x, i++) ;
                return result;
            }
        }
        return 0.0;
    }
}
