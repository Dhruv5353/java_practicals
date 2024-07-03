import java.util.Scanner;
public class prac2_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();
        int[] a= new int[n];
        sc.close();
        System.out.println("Enter the array element : ");
        for(int i=0;i<n;i++){
            a[i]= sc.nextInt();
        }

        int count=0;
        for(int i=0;i<n;i++){
            if(a[i]==9){
                count++;
            }
        }
        System.out.print("The number of 9 is : " + count + " Times ");
    }
}
