import java.util.Scanner;
public class prac2_1 {
    public static void main(String[] args) {

        System.out.println("Enter a string : ");
        
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int a = s.length();
        sc.close();

        if(a<3){
            System.out.println("Enter your number:");
            int y = sc.nextInt();
            String s1 = s.substring(0,2);
            for(int i=0;i<y;i++){
                System.out.print(s1);
            }
        }
        else{
            System.out.println("Enter your number: ");
            int x = sc.nextInt();
            String s2 = s.substring(0,3);
            for(int i=0;i<x;i++){
                System.out.print(s2);
            }

        }
        
    }
    
}
