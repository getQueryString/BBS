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
        double result;
        if (x < 0.0) return 0.0;
        else if (y == 0.0) return 1.0;
        else {
            if (y == 0.5) return Math.sqrt(x + 0.0);
            else {
                y = Math.ceil(y); // y auf- bzw. abrunden
                result = x;
                if (y > 0.0) {
                    for (int i = 0; i < y - 1.0; result *= x, i++) ;
                    return result;
                } else {
                    y = -y;
                    for (int i = 0; i < y - 1.0; result *= x, i++) ;
                    return 1 / -result;
                }
            }
        }
    }
}