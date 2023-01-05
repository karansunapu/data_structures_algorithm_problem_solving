package intermediate.Bit_Manipulations_1;

public class integer_that_occurs_once {
    public static void main(String[] args) {
        int[] A = {1, 2, 2, 3, 1};
        System.out.println(singleNumber(A));
    }

    public static int singleNumber(final int[] A) {

        // num ^ num = 0 ...xor operator is associative ... num ^ num2 ^ num = num ^ num ^ num2
        int xors  = A[0];
        for(int i=1; i<A.length; i++) {
            xors = xors ^ A[i];
        }

        return xors;
    }

    public static int singleNumber_withExtraSpace(final int[] A) {

//        Hashtable<Integer, Integer> hmap = new Hashtable<>();
//        for(int num : A) {
//            if (hmap.containsKey(num))
//                hmap.remove(num);
//            else
//                hmap.put(num, 1);
//        }

        // by using hashSet
//        HashSet<Integer> hset = new HashSet<>();
//        for(int num : A) {
//            if (hset.contains(num))
//                hset.remove(num);
//            else
//                hset.add(num);
//        }


//        return (int)hmap.keySet().toArray()[0];
//        return (int)hset.toArray()[0];

        return 0;
    }
}
