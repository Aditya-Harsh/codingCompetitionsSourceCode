import java.util.Scanner;

public class RoaringYears {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        int i,temp;
        String n;
        for(i=0;i<T;i++){
            n=sc.next();
            temp=Integer.parseInt(n);
            System.out.println(n.substring(0,1));
            System.out.println(n.substring(1,2));

        }
    }

    public static boolean checkRoaring(String n){

        String temp1=n;
        //long temp2=n/10;
        int l=n.length();



        return false;
    }

    public static int count(long n){
        int t=0;
        while(n>0){
            t++;
            n=n/10;
        }
        return t;
    }

}
