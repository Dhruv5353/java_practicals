import java.util.Scanner;
public class prac2_3{
    public static boolean check(int[] a, int n){
        int count=0;
        for(int i=0; i<n; i++){
            if(a[i]==9 && i<4){
                count++;
            }
        }
        if(count==0){
            return false;
        }
        else{
            return true;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();
        int[] a= new int[n];
        System.out.println("Enter the array element : ");
        for(int i=0;i<n;i++){
            a[i]= sc.nextInt();
        }
        if(check(a,n)){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
        sc.close();
    }
}