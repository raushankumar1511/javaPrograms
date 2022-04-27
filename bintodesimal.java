public class bintodesimal {
    public static void main(String[] args) {
        int num=1010110;
        int rem;
        int dec=0;
        int i=1;
      //  int base=
        while(num!=0){
            rem=num%10;
            num/=10;
            dec+=rem*i;
            i=i*2;
        }
        
        System.out.println(dec);
    }
}
