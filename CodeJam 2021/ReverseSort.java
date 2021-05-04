import java.util.Scanner;

public class ReverseSort {
    public static void main(String[] args){
        int i,j,T;
        Scanner sc=new Scanner(System.in);
        T=sc.nextInt();

        for (i=0;i<T;i++){
            long A=0;
            int size=sc.nextInt();
            int B[]=new int[size];
            for(j=0;j<size;j++)
                B[j]=sc.nextInt();
            A=swaps(B,size);
            System.out.println("Case #"+(i+1)+": "+A);
        }

    }
    public static int swaps(int arr[],int l){
        int i,j,k,temp1,temp2,count=0;
        for(i=0;i<l-1;i++){
            j=findMinElement(arr,i,l);
            {
                count+=j-i+1;
                temp1=j;
                for(k=i;k<=((i+j)/2);k++){
                    temp2=arr[k];
                    arr[k]=arr[temp1];
                    arr[temp1]=temp2;
                    temp1--;
                }
            }
        }
        return count;
    }
    public static int findMinElement(int arr[],int beg, int l){
        int i;
        int min= Integer.MAX_VALUE,pos=beg;
        for(i=l-1;i>=beg;i--){
            if(arr[i]<min) {
                pos = i;
                min=arr[pos];
            }
        }
        return pos;
    }
}

