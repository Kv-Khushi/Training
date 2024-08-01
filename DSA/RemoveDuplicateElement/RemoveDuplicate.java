import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicate {

    public static int[] removeDuplicates(int[] array) {

        List<Integer> uniqueList = new ArrayList<>();


        for (int i = 0; i < array.length; i++) {
            boolean isDuplicate = false;

            // Compare the current element with all subsequent elements
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    isDuplicate = true;
                    break;
                }
            }


            if (!isDuplicate) {
                uniqueList.add(array[i]);
            }
        }


        int[] result = new int[uniqueList.size()];
        for (int i = 0; i < uniqueList.size(); i++) {
            result[i] = uniqueList.get(i);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 4, 4, 5};
        int[] result = removeDuplicates(array);

        System.out.println("Array without duplicates: " + Arrays.toString(result));
    }
}
