
public class pattern17 {

        public static void main(String[] args) {
            // TODO Auto-generated method stub
    int n = 7;
    
            int row = 1;
            int nst = n/2;
            int nsp = 1;
            while(row <= n)
            {
                int cst = 1;
                while(cst <= nst)
                {
                    System.out.print("* ");
                    cst += 1;
                }
    
                int csp = 1;
                while(csp <= nsp)
                {
                    System.out.print("  ");
                    csp += 1;
                }
    
                cst = 1;
                while(cst <= nst)
                {
                    System.out.print("* ");
                    cst += 1;
                }
    
                //Update
    
                if(row < n/2+1)
                {
                    nst -= 1;
                    nsp += 2;
                }
                else
                {
                    nst += 1;
                    nsp -= 2;
                }
    
                row += 1;
                System.out.println();
            }
    
        }
    
}
