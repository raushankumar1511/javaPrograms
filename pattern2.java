public class pattern2 {
    

    public static void main(String[] args) {
        int n=5;
        int nst =1;
    int row=1;
    while(row<=n){
        int cst=1;
        while(cst<=nst){
            System.out.print("* ");
            cst+=1;
        }
        nst+=1;
        System.out.println();
        row+=1;
    }
    }    
    }