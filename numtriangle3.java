public class numtriangle3 {
    public static void main(String[] args) {
        int n=5;
        int nst =1;
        int nsp =n;
    int row=1;
    int val=1;
    while(row<=n){
        int csp=1;
        while(csp<=nsp){
            System.out.print("  ");
            csp+=1;
        }
        nsp-=1;
        int cst=1;
        int cval=1;
        while(cst<=nst){
            System.out.print(cval+" ");
            cst+=1;
            cval+=1;
        }
        val+=1;

        nst+=2;
        System.out.println();
        row+=1;
    }
    }    
    
    
}
