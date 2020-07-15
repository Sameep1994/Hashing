import java.util.HashSet;

public class SubArrayGivenSum {
    public static void main(String[] args) {
        int[] a={5,8,6,13,3,-1};
        int k=22;
        System.out.println(subArraySum(a,k));
    }

    public static boolean subArraySum(int[] a,int k){
        HashSet<Integer> hs = new HashSet<>();
        int pre_sum=0;
        for(int i=0;i<a.length;i++){
            pre_sum+=a[i];
            if(hs.contains(pre_sum-k))
                return true;
            if(hs.contains(k))
                return true;
            hs.add(pre_sum);
        }
        return false;
    }
}
