import java.util.HashMap;
import java.util.Map;

public class MoreThanNByKOccurence {
    public static void main(String[] args) {
        int[] a={30,10,20,20,10,20,30,30};
        int k=4;
        occurence(a,k);
    }

    public static void occurence(int[]a,int k){
        int n= a.length;
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int x:a){
            hm.put(x,hm.getOrDefault(x,0)+1);
        }
        for (Map.Entry<Integer,Integer> e:hm.entrySet()){
            if(e.getValue()>n/k)
                System.out.println(e.getKey()+" ");
        }

    }

    /*Can use something similar to Moore's voting algo
    * create a map of size k-1
    * if  m contains a[i] increase its count
    * if size of map is less than k-1  put value a[i]
    * else decrease value of all exisiting elements if something becomes 0 remove
    *
    * for all elements in map print the ones actually appearing more than n/k times*/
}
