import java.util.HashMap;

public class LongestCommonSpan {
    public static void main(String[] args) {
        int [] a = {0,1,0,0,0,0};
        int [] b = {1,0,1,0,0,1};
        int k=0;
        System.out.println(subArraySum(a,b,k));
    }

    public static Integer subArraySum(int[] a,int [] b,int k){
        HashMap<Integer,Integer> hm = new HashMap<>();
        int[] c = new int[a.length];
        for (int i=0;i<a.length;i++){
            c[i]=a[i]-b[i];
        }
        Integer res=0;
        int pre_sum=0;
        for(int i=0;i<c.length;i++){
            pre_sum+=c[i];
            if(pre_sum==k)
                res=i+1;
            if(!hm.containsKey(k))
                hm.put(pre_sum,i);
            if(hm.containsKey(pre_sum-k))
                res=Math.max(res,i-hm.get(pre_sum-k));
        }
        return res;
    }
}
