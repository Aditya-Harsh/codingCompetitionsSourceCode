import java.util.Scanner;

public class ReverSortEngineering {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        int i,j,N,C;
        for(i=0;i<T;i++){
            N=sc.nextInt();
            C=sc.nextInt();
            int A[]=new int[N];
            for(j=1;j<=N;j++)
                A[j-1]=j;
            Solve(A,C,N,i);
            //for(j=0;j<N;j++)
            //   System.out.print(A[j]+" ");
        }
    }
    public static void Solve(int arr[], int C, int N, int T){
        int j;
        String s="";
        int C2=(N*(N+1))/2;
        if(C<(N-1)||C>C2){
            System.out.println("Case #"+(T+1)+": IMPOSSIBLE");
        }
        else if(C==(N-1)){
            System.out.print("\nCase #"+(T+1)+": ");
            for(j=0;j<N;j++)
                s=s+arr[j]+" ";
            s=s.trim();
            System.out.print(s);
            System.out.println();
        }
        else{

        }
    }
}
