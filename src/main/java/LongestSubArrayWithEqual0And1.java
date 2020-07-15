import java.util.HashMap;

public class LongestSubArrayWithEqual0And1 {
    public static void main(String[] args) {
        int[] ip={1,0,1,1,1,0,0};
        for(int i=0;i<ip.length;i++){
            if(ip[i]==0){
                ip[i]= -1;
            }
        }
        System.out.println(subArraySum(ip,0));
    }

    public static Integer subArraySum(int[] a,int k){
        HashMap<Integer,Integer> hm = new HashMap<>();
        Integer res=0;
        int pre_sum=0;
        for(int i=0;i<a.length;i++){
            pre_sum+=a[i];
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
