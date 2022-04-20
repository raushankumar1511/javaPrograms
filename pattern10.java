public class pattern10 {
    public static void main(String[] args){
     int n=5;
    int nst =2*n-1;
    int nsp =0;
int row=1;
while(row<=n){
    int csp=1;
    while(csp<=nsp){
        System.out.print("  ");
        csp+=1;
    }
    nsp+=1;
    int cst=1;
    while(cst<=nst){
        System.out.print("* ");
        cst+=1;
    }
    nst-=2;
    System.out.println();
    row+=1;
    }
    
}}
