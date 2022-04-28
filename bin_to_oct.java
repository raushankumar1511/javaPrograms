import java.util.Scanner;
public class bin_to_oct {

      public static void main(String[] args) {
          System.out.print("enter the binary number : ");
          Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int rem;
        int dec=0;
        int oct=0;
        int i=1;
        int j=1;
        while(num!=0){
            rem=num%10;
            num/=10;
            dec+=rem*i;
            i=i*2;
        }
        
        System.out.println("Decimal of bin number is : "+dec);
        int dec_num=dec;
        int rem2=0;
        while(dec_num!=0){
            rem2=dec_num%8;
            dec_num/=8;
            oct+=rem2*j;
            j=j*10;
        }
        
        System.out.println("octal form bin number is : "+oct);
        sc.close();
    }
}
