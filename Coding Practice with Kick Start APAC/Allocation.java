import java.util.*;

public class Allocation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        int i,j,count,temp;
        for(i=0;i<T;i++){
            int N=sc.nextInt();
            int B=sc.nextInt();
            int A[]=new int[N];

            for(j=0;j<N;j++)
                A[j]=sc.nextInt();

            bubbleSort(A);

            count=0;
            temp=0;

            while(B>=A[temp]){
                    B-= A[temp];
                    temp++;
                    count++;
                    if(temp==N)
                        break;
            }
            System.out.println("Case #"+(i+1)+": "+count);
        }
    }

    public static void bubbleSort(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
    }
}