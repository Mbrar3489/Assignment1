import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {

     // Find the factorial of any number enter by user using while loop.

        System.out.print("Enter The Number: ");
        Scanner sc = new Scanner(System.in);
        int fact = sc.nextInt();
        int number1=fact;
        int number2=1;
        whil(number1>0){

            number2 = (number1*number2);
            number1--;
        }
        System.out.println("Factorial of "+fact+" is: "+number2);

    }
}
