import java.util.Scanner;
public class AddArray {
    public static void main(String[] args) {
        int sum=0;
        Scanner sc=new Scanner(System.in);
     System.out.println("hello");
     int []arr=new int[5];

     for(int i=0;i<5;i++)
     {
         arr[i]=sc.nextInt();
         sum=sum+arr[i];
        }
        System.out.println("entered numbers");
        // for(int i=0;i<5;i++){
            System.out.println(sum);
        
        // }
            sc.close();
    }
    
}
