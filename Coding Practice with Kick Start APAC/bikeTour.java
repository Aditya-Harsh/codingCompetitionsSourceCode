import java.util.Scanner;

public class bikeTour {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T,N,i,j,count;
        T=sc.nextInt();
        for(i=1;i<=T;i++){
            N=sc.nextInt();

            int A[]=new int[N];

            for(j=0;j<N;j++)
                A[j]=sc.nextInt();

            count=0;

            for(j=1;j<N-1;j++){
                if((A[j]>A[j-1])&&(A[j]>A[j+1]))
                    count++;
            }

            System.out.println("Case #"+i+": "+count);
        }
    }
}
