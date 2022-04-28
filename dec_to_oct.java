import java.util.Scanner;
public class dec_to_oct {

      public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int rem;
        int bin=0;
        int i=1;
        while(num!=0){
            rem=num%8;
            num/=8;
            bin=bin+rem*i;
            i=i*10;
        }
        
        System.out.println(bin);
    }
}
