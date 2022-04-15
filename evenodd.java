package evenodd;

import java.util.Scanner;

public class evenodd {
    public static void main(String[] args){ 
    System.out.println("hey");
    int age;
    Scanner sc= new Scanner(System.in);
    while(true){

    age=sc.nextInt();
    if(age>=18){
        System.out.println("qualified for vote");
        
    }
    else if (age < 0){
        System.out.println("bye");
        break;

    }
    else{
        System.out.println("not qualified for vote");

    }
}
    sc.close();
    }
    
}
