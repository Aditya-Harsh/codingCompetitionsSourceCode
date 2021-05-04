import java.util.*;
public class Problem2 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int i=0;i<T;i++){
            String s=sc.next();
            int m=sc.nextInt();
            int n=sc.nextInt();
            int l=s.length();
            String temp=s.substring(m,n+1);
            //System.out.println(temp);
            char tempArray[] = temp.toCharArray();
            for (int j = 0; j < tempArray.length; j++) {
                for (int k = j + 1; k <tempArray.length; k++) {
                    if (Character.toLowerCase(tempArray[k]) > Character.toLowerCase(tempArray[j])) {
                        char temp1 = tempArray[j];
                        tempArray[j] = tempArray[k];
                        tempArray[k] = temp1;
                    }
                }
            }
            temp=new String(tempArray);
            //System.out.println(temp);
            System.out.println(s.substring(0,m)+temp+s.substring(n+1));
        }

    }
}

