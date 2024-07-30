import java.util.*;
public class prac3_3 {
    public static void main(String[] args) {
        employee e1 = new employee();
        employee e2 = new employee();
        e1.getdata();
        e1.setdata();
        e2.getdata();
        e2.setdata();

        System.out.println(" This Practical is made by 23CS041 - DHRUV LOKADIYA ");
    }
}


class employee{
    String fn;
    String ln;
    double salary;
    employee(){
        fn="";
        ln="";
        salary=0;
    }

public void getdata(){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the first name: ");
    fn = sc.nextLine();
    System.out.println("Enter the last name : ");
    ln = sc.nextLine();
    System.out.println("Enter salary : ");
    salary= sc.nextDouble();

    if(salary < 0){
        salary=0;
    }
}

public void setdata(){
    Double x= (salary*12);
    Double y= x+(x*10)/100;
    System.out.println("First name : " + fn);
    System.out.println("Last name : " + ln);
    System.out.println("Monthly Salary : " + salary);
    System.out.println("Annual Salary : " + x);
    System.out.println("Annual Salary with 10% raise : " + y);
    System.out.println("----------------------------------------------------");
}
}
