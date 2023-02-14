import java.util.Scanner;

public class EvenOddSum

{
public static void main(String[] args)
{

    System.out.print("Enter the number: ");
    Scanner sc = new Scanner(System.in);
    int input = sc.nextInt();
    int num =input;
    int Even =0;
    int Odd=0;
    while(num>0)
    {

        if(num%2!=0){

            Odd=Odd+num;
        }
        else{
            Even = Even+num;
        }
        num--;
    }
    System.out.println("Sum of Odd numbers until "+input+ " is :"+Odd);
    System.out.println("Sum of Even numbers until "+input+ " is: "+Even);
}

}
