import java.util.*;

public class maxClockwise {
    public static void main(String[] args) {

        int cir, n, i;
        Scanner sc=new Scanner(System.in);
        cir=sc.nextInt();
        n=sc.nextInt();
        List<Integer> li=new ArrayList<Integer>();
        for(i=0;i<n;i++)
            li.add(sc.nextInt());

        System.out.println(maxClockwiseRuns(cir, li));
    }

    public static int maxClockwiseRuns(int circumference, List<Integer> dist) {
        // Write your code here
        int count=0;
        int s=dist.size();


        return count;

    }

}
