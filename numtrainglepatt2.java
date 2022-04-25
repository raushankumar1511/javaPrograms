public class numtrainglepatt2 {
    public static void main(String[] args) {
        int n=5;
        int nst =1;
        int nsp =n,x=1;
    int row=1;
    while(row<=n){
        int csp=1;
        while(csp<=nsp){
            System.out.print("  ");
            csp+=1;
        }
        nsp-=1;
        int cst=1;
        while(cst<=nst){
            System.out.print(x+" ");
            cst+=1;
        }
        nst+=2;
        System.out.println();
        row+=1;
        x+=1;
    }
    }    
    
}
