import java.util.*;
public class prac3_6 {
    public static void main(String[] args) {
        Complex c1 =new Complex();
        Complex c2 =new Complex();
        Complex c3 =new Complex();
        Complex c4 =new Complex();
        Complex c5 =new Complex();
        c1.getdata();
        c2.getdata();
        c3 = c1.addition(c2);
        c4 = c1.substraction(c2);
        c5 = c1.mul(c2);
        c3.setdata();
        c4.setdata();
        c5.setdata();
        System.out.println(" This Practical is made by 23CS041 - DHRUV LOKADIYA ");
    }
}

class Complex{
    int real,image;
    public void getdata(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Length : ");
        real = sc.nextInt();
        System.out.println("Enter the breadth : ");
        image = sc.nextInt(); 
    }

    public Complex addition(Complex x){
        Complex temp = new Complex();
        temp.real= real + x.real;
        temp.image= image + x.image;
        return temp;
    }

    public Complex substraction(Complex x){
        Complex temp = new Complex();
        temp.real= this.real - x.real;
        temp.image= this.image - x.image;
        return temp;
    }

    public Complex mul(Complex x){
        Complex temp = new Complex();
        temp.real= (this.real + x.real)-(this.image + x.image);
        temp.image= (this.real + x.image)+(this.image + x.real);
        return temp;
    }

    public void setdata(){
        System.out.println("complex number is == "+real+" + "+image+"i");
    }
}
