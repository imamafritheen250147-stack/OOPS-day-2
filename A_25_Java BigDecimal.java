import java.math.BigDecimal;
import java.util.*;
class Solution{

    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
      	sc.close();

        //Write your code here
Arrays.sort(s, 0, n, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                BigDecimal aBd = new BigDecimal(a);
                BigDecimal bBd = new BigDecimal(b);
                // Compare b to a for descending order
                return bBd.compareTo(aBd);
            }
        });
        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }

}
