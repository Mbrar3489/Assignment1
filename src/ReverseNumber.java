import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args){

        // Reverse the digits of the number enter by user using while loop.

        System.out.print("Enter the Number to reverse: ");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int number=input;
        int number1 =0;
         while(number>0)
         {
             int remainder=number%10;
             number1 = (number1*10)+remainder;
             number=number/10;

         }
        System.out.println("The reverse of "+ input + " is: "+number1);


    }
}
