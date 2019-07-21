import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String args[]){

        int r,sum=0,temp;
        Scanner n = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int a=n.nextInt();
        temp = a;
        while(a>0){
            r=a%10;
            sum=(sum*10)+r;
            a=a/10;
        }
        if(temp==sum){
            System.out.println("This is Palindrome Number");
        }
        else
            System.out.println("This is not Palindrome Number");

    }
}
