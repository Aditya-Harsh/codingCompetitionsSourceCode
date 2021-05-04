import java.util.*;

public class Problem3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T,i,j,n,count;

        T=sc.nextInt();

        for(i=0;i<T;i++){

            count=0;
            n=sc.nextInt();

            int A[]=new int[n];

            for(j=0;j<n;j++)
                A[j]=sc.nextInt();


            int max=A[0];
            count++;
            for(j=1;j<n;j++)
                if(A[j]>max){
                    max=A[j];
                    count++;
                }
            System.out.println(count);
        }

    }


}
