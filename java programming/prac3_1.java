import java.util.*;
public class prac3_1 {
    public static void main(String[] args) {
    double pound,rupee;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value of pound: ");
    pound= sc.nextDouble();
    sc.close();

    rupee=pound*100;
    System.out.println("rupees : " + rupee);

    System.out.println(" This Practical is made by 23CS041 - DHRUV LOKADIYA ");
    }
}
