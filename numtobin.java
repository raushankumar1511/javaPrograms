public class numtobin {
    public static void main(String[] args) {
        int num=128;
        int rem;
        int bin=0;
        int i=1;
        while(num!=0){
            rem=num%2;
            num/=2;
            bin=bin+rem*i;
            i=i*10;
        }
        
        System.out.println(bin);
    }
    
}
