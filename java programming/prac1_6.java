import java.util.Scanner;
public class prac1_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your number : ");
        int number= sc.nextInt();
        int reversedNumber = 0;
        sc.close();

        while(number != 0){
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit ;
            number = number / 10;
        }
        System.out.println("----------------------------");

        System.out.println("Reversed Number is : " + reversedNumber);


    }
}
