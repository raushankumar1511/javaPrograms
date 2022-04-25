public class pattern30 {
    public static void main(String[] args) {
        int n=5;
        int nst =n;
    int row=1;
    int val=n;
    while(row<=n){
        int cst=1;
        int cval=val;
        while(cst<=nst){ 
            
    
                System.out.print(cval+" ");
            
            cst+=1;
            cval-=1;
        }
        System.out.println();
        row+=1;
    }
    }     
}
