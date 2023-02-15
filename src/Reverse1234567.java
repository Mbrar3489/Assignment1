public class Reverse1234567 {

    public static void main(String[] args){
        // Program to find the reverse of 1234567 using while loop.

        int number = 1234567;
        int reverse =0;
        int remainder;
        while(number!=0)
        {
            remainder=number%10;
            reverse=(reverse*10)+remainder;
            number=number/10;

        }
        System.out.println("Reverse of 1234567 is :" +reverse);
    }
}
