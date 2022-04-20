public class pattern7 {
    public static void main(String[] args) {

        int n =5;
        int nst =n;
        int nsp =1;
        int row=1;
        while(row<=n){
        int cst=1;
            while(cst<=nst){
                if(row==1||row==n){
                System.out.print("* ");}
                else{
                    System.out.print("*       *");
                }
              cst+=1;
            }
System.out.println();
row+=1;
        }
        
    }
}
