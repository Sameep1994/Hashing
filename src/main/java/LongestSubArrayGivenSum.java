import java.util.HashMap;

public class LongestSubArrayGivenSum {
    public static void main(String[] args) {
        int[] ip={10, 5, 2, 7, 1, 9};
        int k=15;
        System.out.println(subArraySum(ip,k));
    }
//we are using same prefixsum araay logic, using hashmap to decrease retrival time
//if a prefix sum is not present then only we are entering it and its index, this is done so that the leftmost occurence of an integer is stored
//if we find prefixsum-k in hm then current index-retrival of index in hashmap gives the length
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
