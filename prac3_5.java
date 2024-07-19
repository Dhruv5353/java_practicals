// import java.util.*;
// public class prac3_5 {
//     public static void main(String[] args) {
//         Area a = new Area();
//         a.getdata();
//         a.setdata();

//         System.out.println(" This Practical is made by 23CS041 - DHRUV LOKADIYA ");
//     }
// }

// class Area{
//     float l,b;
//     Area(){
//         l=0;
//         b=0;
//     }

//     public void getdata(){
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter the Length : ");
//         l = sc.nextFloat();
//         System.out.println("Enter the breadth : ");
//         b = sc.nextFloat(); 
//     }

//     public void setdata(){
//         float Area;
//         Area = l*b;
//         System.out.println("The Area of rectangle is : " + Area);
//     }
// }

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