import java.util.Scanner;
public class prac1_5 {
    public static void main(String[] args) {

        int[] code = {1 ,2 ,3 ,4 ,5};
        float[] tax = {8 , 12, 5, 7.5f, 3};
        int[] price = {80, 1200, 500, 7500, 300};


        String[] items = {"motor", "fan" , "tube", "wire", "other_items"};

        for(int i=0; i<code.length; i++){
            System.out.println(code[i] + " for " + items[i] );
        }
        System.out.println("Enter code for genrate bill...");

        Scanner sc= new Scanner(System.in);
        int x= sc.nextInt();
        sc.close();
        switch(x){

            case 1:

            float a;
            System.out.println("The price of motor is: ");
            a= price[x-1]+price[x-1]*(tax[x-1])/100;
            System.out.println(a);
            break;

            case 2:

            float b;
            System.out.println("The price of fan is: ");
            b= price[x-1]+price[x-1]*(tax[x-1])/100;
            System.out.println(b);
            break;
            
            case 3:

            float c;
            System.out.println("The price of tube is: ");
            c= price[x-1]+price[x-1]*(tax[x-1])/100;
            System.out.println(c);
            break;

            case 4:

            float d;
            System.out.println("The price of wire is: ");
            d= price[x-1]+price[x-1]*(tax[x-1])/100;
            System.out.println(d);
            break;

            case 5:

            float e;
            System.out.println("The price of other_item is: ");
            e= price[x-1]+price[x-1]*(tax[x-1])/100;
            System.out.println(e);
            break;

            default:
            System.out.println("please, selected code between 1 to 5.");
            break;
        }
    }
    
}