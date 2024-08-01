public class LeadingElement {

    public static void findLeadingElelment(int[] arr) {
        if (arr == null || arr.length == 0) {
            System.out.println("Array is empty");
            return;
        }

        int n = arr.length;
        int maxFromRight=Integer.MIN_VALUE;



        System.out.println("Elements with no larger elements to their right:");
        for (int i = n-1; i >= 0; i--) {
            if (arr[i] >= maxFromRight) {
                System.out.print(arr[i] + " ");
                maxFromRight = arr[i];
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,2,4,5,2,1};
        findLeadingElelment(arr);
    }
    }

