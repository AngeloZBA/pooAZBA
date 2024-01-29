public class Main {
    public static void main(String[] args) {
        //Print square made of stars (*)
        //Length 5 stars x 5 stars
        /*
        System.out.println("* * * * *");
        System.out.println("*       *");
        System.out.println("*       *");
        System.out.println("*       *");
        System.out.println("* * * * *");
        */
        /*
        printSquare(10);
        System.out.println(" ------------------");
        printSquare(20);
         */
        printTriangle(6);
        System.out.println(" ---------------------------------");
        printTriangle(8);
    }

    public static void printSquare(int length) {
        for (int i = 1; i <= length; i++) {
            for (int j = 1; j <= length; j++) {
                System.out.print(" *    ");
            }
            System.out.print("\n");
        }
    }

    public static void printTriangle(int base) {
        for (int i = 0; i <= base - 1; i++) {
            for (int k = 1; k <= i+1; k++) {
                System.out.print(" *    ");
            }
            System.out.print("\n");
        }
    }
}