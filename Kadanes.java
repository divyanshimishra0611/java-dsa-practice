public class Kadanes{
  public static int largestSum(int arr[]){
    int maxSum= Integer.MIN_VALUE;
    int sum =0;
    for(int i =0; i<arr.length; i++){
       sum += arr[i];

       if(sum> maxSum ){
        maxSum = sum;
       }
       if(sum <0){
        sum =0;
       }
    }
    return maxSum;

  }
  public static void main(String args[]){
    int arr[] = {-2,-3,-4,-5,-6,-1};
    System.out.println(largestSum(arr));
  }
}