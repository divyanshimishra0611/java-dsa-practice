public class secondLargest {
  
    public static int secondLargest(int nums[]){
        int largest = Integer.MIN_VALUE;
        int secondlargest=Integer.MIN_VALUE;
        for (int i= 0; i< nums.length; i++){
            if(nums[i]>largest){
               
                secondlargest= largest;
                largest = nums[i];
            }
            else if(nums[i]>secondlargest && nums[i]!=largest){
                secondlargest = nums[i];
            }
        
        }
        return secondlargest;
    }  
    public static void main(String args[]){
      int[] nums = {2,4,6,8,1,10,10};
      int result = secondLargest(nums);
      System.out.println("The second largest element in array is : "+ result);
    }   
  }

