import java.util.Scanner;

public class PalindromeString {
    public static void main(String args[]){

        String a,reverse="";
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a string to check if it is a palindrome: ");
        a=s.nextLine();
        int length=a.length();
        for (int i =length-1;i>=0;i--){
            reverse=reverse+a.charAt(i);
        }
        if(a.equals(reverse)){
            System.out.println("This is Palindrome String");
        }
        else
            System.out.println("This is not Palindrome String");

    }
}
