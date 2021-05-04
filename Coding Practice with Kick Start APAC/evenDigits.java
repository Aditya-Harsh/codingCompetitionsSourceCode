import java.util.Scanner;

public class evenDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i;
        long n,temp;
        boolean b1,b2;
        int T=sc.nextInt();

        for(i=1;i<=T;i++){
            n=sc.nextLong();
            if(!hasOddDigit(n)){
                System.out.println("Case #"+i+": 0");
            }

            else{
                b1=hasOddDigit(n-1);
                b2=hasOddDigit(n+1);
                temp=1;
                while(b1 && b2){
                    temp++;
                    b1=hasOddDigit(n-temp);
                    b2=hasOddDigit(n+temp);
                }
                System.out.println("Case #"+i+": "+temp);
            }
        }
    }

    public static boolean hasOddDigit(long n){
        while(n!=0){
            int r= (int) (n%10);
            if(r%2==1)
                return true;
            n=n/10;
        }
        return false;
    }
}