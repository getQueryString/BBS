import java.util.ArrayList;

public class Quersumme {
    static ArrayList<Integer> qsArr = new ArrayList<>(), qsqpArr = new ArrayList<>(), bsArr = new ArrayList<>();

    public static void main(String[] args) {
        for (int zahl = 1; zahl <= 1000; zahl++) {
            int quersumme = calcQuerSum(zahl);
            if (!qsArr.contains(quersumme)) {
                qsArr.add(quersumme);
                System.out.println("Ziffernwurzel von " + quersumme + ": " + calcQuerSum(quersumme) + "\n");
                System.out.println(querprodukt(zahl) ? zahl + " ist die Summe aus seiner Quersumme addiert mit seinem Querprodukt." : "");
                System.out.println(dieBoeseSieben(zahl) ? zahl + " enthält die Zahl 7 oder ist durch sie teilbar." : "");
            }
            if (quersumme == 15) System.out.println("Die Quersumme von " + zahl + " beträgt 15.");
            if (quersumme % 7 == 0) System.out.println("Die Quersumme von " + zahl + " ist ein Vielfaches von 7.");
        }
        System.out.println("Quersummen: " + qsArr);
        System.out.println("Summen aus seiner Quersumme addiert mit seinem Querprodukt: " + qsqpArr);
        System.out.println("Böse Siebenen: " + bsArr);
    }

    static boolean dieBoeseSieben(int n) {
        if (n % 7 == 0 || String.valueOf(n).contains(String.valueOf(7))) {
            bsArr.add(n);
            return true;
        } else return false;
    }

    static boolean querprodukt(int n) {
        int s = n, qs = 0, qp = 1;
        while (n > 0) {
            qs += n % 10;
            qp *= n % 10;
            n /= 10;
        }
        int res = qs + qp;
        if (s == res) {
            qsqpArr.add(res);
            return true;
        } else return false;
    }

    static int calcQuerSum(int n) {
        int res = 0;
        while (n > 0) {
            res += n % 10;
            n /= 10;
        }
        return res;
    }
}
