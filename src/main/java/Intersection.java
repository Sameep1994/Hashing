import java.util.HashSet;

public class Intersection {
    public static void main(String[] args) {
        int[] a={10,15,20,15,30,30,5};
        int[] b={30,5,30,80};
        inter(a,b);
    }
//enter element of one array in hashset and traverse the next array and if element found in hashset print and remove from hs to remove duplicates
    public static void inter(int[] a,int[] b){
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0;i<a.length;i++){
            hs.add(a[i]);
        }
        for(int j=0;j<b.length;j++){
            if(hs.contains(b[j])){
                System.out.println(b[j]);
                hs.remove(b[j]);
            }
        }
    }
}
