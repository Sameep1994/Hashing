import java.util.HashSet;

public class LongestConsecutiveSubsequence {
    public static void main(String[] args) {
        int[] ip={3,8,4,5,7};
        System.out.println(longestSubSequence(ip));
    }
    //we have to find the longest subsequence of consecutive element example 2,3,4,5 etc
    //we put all the elements in hashtable
    //find the start for subsequence and count the longest subsequence
    public static int longestSubSequence(int [] a){
        HashSet<Integer> h =  new HashSet<>();
        for(int i=0;i<a.length;i++){
            h.add(a[i]);
        }
        int res=0;
        for(int i=0;i<a.length;i++){
            if(h.contains(a[i]-1)){
                break;
            }else{
                int curr= 1;
                while(h.contains(a[i]+curr)){
                    curr++;
                }
                res=Math.max(res,curr);
            }
        }
        return res;
    }
}
