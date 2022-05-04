public class assig4 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int n = 5;
        int val = n;
        int nval = n;
        int row = 1;
        int nst = 1;
        int nsp = 2 * n - 1;
        while (row <= 2 * n + 1) {
            int cst = 1;
            int cval = val;
            while (cst <= nst) {

                System.out.print(" " + cval);
                cst += 1;
                cval--;
            }

            int csp = 1;
            while (csp <= nsp) {
                System.out.print("  ");
                csp += 1;
            }

            cst = 1;
            int cnval = nval;
            while (cst <= nst) {

                System.out.print(" " + cnval);
                cst += 1;
                cnval++;
            }

            // Update

            if (row <= n) {
                nst += 1;
                nsp -= 2;
                nval -= 1;
            }
            // else if(row=2n+1){

            // }
            else {
                nst -= 1;
                nsp += 2;
                nval += 1;
            }

            row += 1;
            System.out.println();
        }

    }
}
