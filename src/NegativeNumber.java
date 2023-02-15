import java.util.Scanner;

public class NegativeNumber {

    public static void main(String[] args){
        // Program to find the sum of all non-negative numbers entered ny user.

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int number=sc.nextInt();
        int sum=0;
        while(number>=0){
            sum=number+sum;
            System.out.print("Enter the number again: ");
            number=sc.nextInt();


        }
        System.out.print("Sum of all entered numbers is: "+sum);



    }
}
