import java.util.Scanner;
public class raushan {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
     System.out.println("hello");
     int []arr=new int[5];

     for(int i=0;i<5;i++)
     {
         arr[i]=sc.nextInt();
        }
        System.out.println("entered numbers");
        for(int i=0;i<5;i++){
            System.out.println(arr[i]  );
        
        }
        sc.close();
    }
    
}
