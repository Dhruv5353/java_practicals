import java.util.*;
public class prac3_5{
    public static void main(String[] args){
        area a = new area(2,3);
        int x = a.returnarea();
        System.out.println("Area of Rectangle is = "+ x);
        System.out.println(" This Practical is made by 23CS041 - DHRUV LOKADIYA ");
    }
}
class area{
    int l,b;
    area(int x,int y){
        l=x;
        b=y;
    }
    public int returnarea(){
        return (l*b);
    }
}

