//Only Test Set 1 was Accepted

import java.util.Scanner;

public class AppendSort {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T,i,j,count;

        T = sc.nextInt();

        for(i=0;i<T;i++){

            int N=sc.nextInt();

            int[] A =new int[N];

            count=0;

            A[0]=sc.nextInt();

            for(j=1;j<N;j++){

                A[j]=sc.nextInt();
                if(A[j]>A[j-1])
                    count+=0;

                else{
                    int d=A[j-1]-A[j];
                    if(d==0) {
                        count++;
                        A[j]*=10;
                    }
                    else {
                        A[j]*=10;
                        count++;
                        while(A[j]<=A[j-1]){
                            A[j]++;

                            if((A[j]%10)==9 && (A[j]<=A[j-1])){
                                A[j]/=10;
                                A[j]*=100;
                                count++;
                            }
                        }
                    }
                }
            }
            System.out.println("Case #"+(i+1)+": "+count);
        }
    }
}