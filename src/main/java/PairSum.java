import java.util.HashSet;

public class PairSum {
    public static void main(String[] args) {
        int[] ip={3,2,8,15,-8};
        int sum=17;
        System.out.println(sumPair(ip,sum));
    }
//if for any element sum-element is present in array then sum exists
    public static boolean sumPair(int[] a,int k){
        boolean sumPair = false;
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0;i<a.length;i++){
            if(hs.contains(k-a[i])){
                sumPair=true;
                break;
            }else {
                hs.add(a[i]);
            }
        }
        return sumPair;
    }
}
