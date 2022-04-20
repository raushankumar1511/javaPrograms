import java.util.Scanner;
public class lcm {
    public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int a= sc.nextInt();
int b= sc.nextInt();
// int i=2;
int large =(a>b)?a:b;

while(true)
{
    if(large%a==0 &&large%b==0){
    System.out.println(large);
    break;}
    ++large;
}

    } 
    
}
