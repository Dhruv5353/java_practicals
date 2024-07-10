import java.util.*;
public class prac2_6 {
    public static void main(String[] args) {
        String s = "Dhruv Lokadiya";
        String s1 = " ";

        System.out.println(s.length());
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());

        for (int i = 0; i < s.length(); i++) {
            s1 = s.charAt(i) + s1;
          }
          System.out.println("Reversed string : "+ s1);
          System.out.println("Sorted  string  : "+ tosort(s));

          System.out.println(" This Practical is made by 23CS041 - DHRUV LOKADIYA ");

        }
        public static String tosort(String s){
            char tempArray[] = s.toCharArray();
            Arrays.sort(tempArray);
            return new String(tempArray);
        }
}
