public class star {
    

public static void main(String[] args) {
    int n=5;
    int nst =n;
int row=1;
while(row<=n){
    int cst=1;
    while(cst<=nst){
        System.out.print("*");
        cst+=1;
    }
    System.out.println();
    row+=1;
}
}    
}