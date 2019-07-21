import java.util.Scanner;

public class squareRoot {


    public static void main(String[] args) {

        System.out.println("Enter your number");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int root;

        for (int i = 1; i < n; i++) {
            root = i * i;
            if (root == n) {
                System.out.println(+n + "'s square root is " + i);
                break;
            }

        }


    }

}
