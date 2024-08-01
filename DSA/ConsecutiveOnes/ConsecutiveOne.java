public class ConsecutiveOne {
    public static  int consecutiveone(int [] arr){
        int max=0;
        int count=0;

        for(int i: arr){
            if(arr[i]==1){
                count++;
                max=Math.max(max,count);
            }
            else count=0;
        }
        return max;
    }

    public static void main(String[] args) {
        int[]arr={0,1,1,0,1,0,1,1,1};

        ConsecutiveOne consecutiveOne=new ConsecutiveOne();

        int max_consecutiveOnes=consecutiveone(arr);
        System.out.println("Max no of consecutive ones " +max_consecutiveOnes);

    }
}
