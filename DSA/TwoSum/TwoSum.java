import java.util.HashMap;
import java.util.Map;
public class TwoSum {
    public static void main(String[] args) {

        int[] num = {3, 2, 4, 5, 7};
        int target = 12;
        int[] result = twoSum(num, target);
        if (result != null) {
            System.out.println("Indices of the two numbers are: [" + result[0] + ", " + result[1] + "]");
        } else {
            System.out.println("No two sum found");
        }
    }

    public static int[] twoSum(int[] num, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < num.length; i++) {
            int complement = target - num[i];

            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(num[i], i);
        }
        return null;
    }
}




