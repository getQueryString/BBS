public class Lernen {

    public static void main(String[] args) {

        int a = 3, b = 6;

        for (int x = 1; x < 4; x++) {   // a = 3; b = 6; x = 1
            System.out.println("1. " + a + " " + b + " " + x);
            if (a > b) {
                b = b - x;
                System.out.println("2. " + a + " " + b + " " + x);
            } // end of if
            else {
                while (a < b) {
                    a = a + 2;
                    System.out.println("3. " + a + " " + b + " " + x);
                } // end of while
            } // end of if-else
            System.out.println();
        } // end of for

    }
}