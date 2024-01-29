public class Main {
    public static void main(String[] args) {
        printSquare(10);
        System.out.println(" ------------------");
        printSquare(20);
        //Print square made of stars (*)
        //Length 5 stars x 5 stars
        /*
        System.out.println("* * * * *");
        System.out.println("*       *");
        System.out.println("*       *");
        System.out.println("*       *");
        System.out.println("* * * * *");
        */
    }
    public static void printSquare(int length){
        for(int i = 1; i <= length; i++){
            for(int j = 1; j <= length; j++){
                System.out.print(" *    ");
            }
            System.out.print("\n");
        }
    }
}