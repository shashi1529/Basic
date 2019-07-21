import java.util.Scanner;

public class Fibonnaci {

    static int n1 = 0, n2 = 1, n3 = 0;

    public static void main(String[] args) {

        System.out.println("Enter your number");
        Scanner s = new Scanner(System.in);
        int nthPlace = s.nextInt();
        System.out.print("Fibonaci series of number is :" + n1 + " " + n2);
        fibonacci(nthPlace - 2);


    }

    static void fibonacci(int nthPlace) {

        if (nthPlace > 0) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(" " + n3);
            fibonacci(nthPlace - 1);

        }

    }
}


