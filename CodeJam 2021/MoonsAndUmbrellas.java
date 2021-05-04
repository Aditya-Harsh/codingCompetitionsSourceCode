import java.util.Scanner;

public class MoonsAndUmbrellas {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        short i,j,cj, jc;

        int l;
        String s;
        short T=sc.nextShort();
        long cost[]=new long[T];
        for(i=0;i<T;i++){
            cost[i]=0;
            cj=sc.nextShort();
            jc=sc.nextShort();
            s=sc.next();
            s=removeMarks(s);
            l=s.length();
            for(j=0;j<l-1;j++){

                if(s.charAt(j)=='C' && s.charAt(j+1)=='J')
                    cost[i]+=cj;
                else if(s.charAt(j)=='J' && s.charAt(j+1)=='C')
                    cost[i]+=jc;
            }
        }
        for(i=0;i<T;i++){
            System.out.println("Case #"+(i+1)+": "+cost[i]);
        }
    }

    public static String removeMarks(String s){
        int i=s.indexOf('?');
        while(i!=-1){
            s=s.substring(0,i)+s.substring(i+1);
            i=s.indexOf('?');
        }
        return s;
    }
}
