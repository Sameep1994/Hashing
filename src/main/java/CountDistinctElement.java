import java.util.HashMap;

public class CountDistinctElement {
    public static void main(String[] args) {
        int[] a={10,20,20,10,30,40,10};
        int k=4;
        dist(a,k);
    }
    /*we have to count num of distinct element in every window of size k
    * in our ip its 4
    *
    *
    * Create frequency map of first k elements
    *
    * print size of freq map
    *
    * for(k to n)
    * decrease freq of a[i-k]
    * if freq of a[i-k] becomes 0 remove it from map
    * if a[i] does not exist in map, insert it. else inc freq in map
    * print size
    *
    *
    * its similar to sliding window with hashing
    * in case of our input we make freq map of first k element ie 10,20,20,10
    * then for next window we dec frequency of frst element of prev window ie 10 and increase frequency of curr element ie 30 we do it till n and print size of
    * freq map*/
    public static void dist(int[] a, int k){
        int n =a.length;
        HashMap<Integer, Integer> m=new HashMap<>();

        for (int i = 0; i < k; i++) {
            m.put(a[i], m.getOrDefault(a[i], 0) + 1);
        }

        System.out.print(m.size()+" ");

        for (int i = k; i < n; i++) {

            m.put(a[i - k], m.get(a[i - k]) - 1);

            if (m.get(a[i - k]) == 0) {
                m.remove(a[i - k]);
            }
            m.put(a[i], m.getOrDefault(a[i], 0) + 1);

            System.out.print(m.size() + " ");


        }
    }
}
