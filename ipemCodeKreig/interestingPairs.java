import java.util.*;

public class interestingPairs {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum, i;
        int n=sc.nextInt();
        List<Integer> li=new ArrayList<Integer>();
        for(i=0;i<n;i++)
            li.add(sc.nextInt());

        sum=sc.nextInt();

        System.out.println(interesting(li,sum));
    }


    public static long interesting(List<Integer> arr, int sumValue) {
        // Write your code here
        long count = 0;
        int t1,t2;
        int s=arr.size();
        for(int i=0;i<s-1;i++)
            for (int j=i+1;j<s;j++) {
                t1=arr.get(i);
                t2=arr.get(j);
                if((Math.abs(t1-t2)+Math.abs(t1+t2))==sumValue) {
                    count++;
                }
            }
        return count;
    }
}
