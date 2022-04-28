import java.util.Scanner;
public class oct_to_dec {


      public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int rem;
        int dec=0;
        int i=1;
        while(num!=0){
            rem=num%10;
            num/=10;
            dec+=rem*i;
            i=i*8;
        }
        
        System.out.println(dec);
    }
}


