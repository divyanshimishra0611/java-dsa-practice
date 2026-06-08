public class Occurences {
  
    
    public static boolean occurences(int nums[],int target){
        int count = 0;
        for (int i:nums){
            if(i==target){
                count++;
                if(count>0){
                  return true;
                }
            }
        
        }
        return false;
    }     
    
    public static void main(String args[]){
        int[] nums = {3,5,1,5,9};
        boolean result = occurences(nums,5);
        System.out.println(result);
    }
}

