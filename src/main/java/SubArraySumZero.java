import java.util.HashSet;

public class SubArraySumZero {
    public static void main(String[] args) {
        int[] a={1,4,13,-3,-10,5};
        System.out.println(SubArrayZero(a));
    }

    public static boolean SubArrayZero(int[] a){
        HashSet<Integer> hs = new HashSet<>();
        int pre_sum=0;
        for(int i=0;i<a.length;i++){
            pre_sum+=a[i];
            if(hs.contains(pre_sum))
                return true;
            if(hs.contains(0))
                return true;
            hs.add(pre_sum);
        }
        return false;
    }
}
