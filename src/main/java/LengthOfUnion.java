import java.util.HashSet;

public class LengthOfUnion {
    public static void main(String[] args) {
        int[] a={5,20,5,15};
        int[] b={15,15,15,20,10};
        System.out.println(Union(a,b));
    }
//enter element of both array in hashset and return the size
    public static int Union(int[] a,int[] b){
        HashSet<Integer> hs= new HashSet<>();
        for(int i=0;i<a.length;i++){
            hs.add(a[i]);
        }
        for(int j=0;j<b.length;j++){
            hs.add(b[j]);
        }
        return hs.size();
    }
}
