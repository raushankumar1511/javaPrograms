public class pattern28 {
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
        int cval=val;
        while(cst<=nst){
            System.out.print(cval+" ");
            if(cst<nst/2+1){

                cval+=1;
            }else{
                cval-=1;
            }
            cst+=1;
        }

        val+=1;

        nst+=2;
        System.out.println();
        row+=1;
    }}
    
}
