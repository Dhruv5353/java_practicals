import java.util.*;
public class prac3_7_1{
    public static void main(String[] args){
        int count = 28;
        System.out.println("Before value = "+count);
        modify(count);
        System.out.println("After modify = "+count);
        System.out.println(" This Practical is made by 23CS041 - DHRUV LOKADIYA ");
    }
    public static void modify(int y){
        y++;
        System.out.println("Modify value = "+y);
    }
}