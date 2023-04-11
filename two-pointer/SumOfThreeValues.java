import java.util.*;

public class SumOfThreeValues {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(isSumExists(arr, 7));
    }

    public static boolean isSumExists(int[] arr, int target) {
        int s = arr.length;
        boolean ans = false;
        HashMap<Integer, Integer> map = new HashMap();
        loop1: for(int i = 0; i < s; i++) {
            map = new HashMap();
            int x = arr[i];
            int r = target - x;
            loop2: for(int j = i+1; j < s; j++) {
                int y = arr[j];
                int rr = r - y;
                Integer value = map.get(rr);
                if(value != null) {
                    ans = true;
                    break loop1;
                } else {
                    map.put(y, rr);
                }
            }
        }
        return ans;
    }
    /**
    1 2 3 4 
    target = 8
    2 3 4 
    target = 7
    - 5,2
    - 4,3
    -
     

     */
}
