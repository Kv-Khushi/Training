
//Q missing number in array from 1 to n
//public class MissingNumber {
//    public static int findMissingNumber(int[] array,int n){
//        int expected_Sum=n*(n+1)/2;
//
//        int actual_Sum=0;
//
//        for (int i: array){
//           actual_Sum+=i;
//        }
//        return  expected_Sum-actual_Sum;
//    }
//    public static void main(String[] args) {
//
//        int[] array ={1,2,4,5,6};
//        int n=6;
//
//        int missing_Number=findMissingNumber(array,n);
//        System.out.println("The missing number is" +missing_Number);
//
//    }
//}



//missing number in array

public class MissingNumber {

    public static int findMissingNumber(int[] arr){
        int n=arr.length;
        int xor1=0;
        int xor2=0;

        for (int i=0;i<=n;i++){
            xor1=xor1^i;
        }
        for(int number:arr){
            xor2 =  xor2^number;
        }
        return xor1^xor2;
    }

    public static void main(String[] args) {
        int[]arr={10,11,13};

        int missing_Number=findMissingNumber(arr);
        System.out.println("the missing number is "+missing_Number);
    }
}