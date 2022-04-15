import java.util.Scanner;

public class mark {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
       int marks=sc.nextInt();
       if(marks>85){
           System.out.println("A");
        }
        else if(marks>65){
            System.out.println("B");
   
        }
        else {
            System.out.println("c");
        }   
    }
    
}
