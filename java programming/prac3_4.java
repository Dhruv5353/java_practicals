import java.util.*;
public class prac3_4 {
    public static void main(String[] args) {
        Date d = new Date();
        d.getdata();
        d.setdata();

        System.out.println(" This Practical is made by 23CS041 - DHRUV LOKADIYA ");

    }
    
}

class Date{
    int dd,mm,yy;
    Date(){
        dd=0;
        mm=0;
        yy=0;
    }

    public void getdata(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Date : ");
        dd = sc.nextInt();
        System.out.println("Enter the Month : ");
        mm = sc.nextInt();
        System.out.println("Enter the Year : ");
        yy = sc.nextInt();
    }

    public void setdata(){

        System.out.println(dd+"/"+mm+"/"+yy);
    }
}
