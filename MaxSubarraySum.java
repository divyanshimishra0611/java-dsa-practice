class MaxSubarraySum {
    public int minSubArrayLen(int target, int[] nums) {
        int low=0;
        int high =0;
        int result = Integer.MAX_VALUE;
        int sum =0;

        while(high<nums.length){

            sum += nums[high];

            while(sum>=target){

            result = Math.min(result,high-low+1);
            sum-= nums[low];
            low++;

        
            }
            high++;

            
            

    
        }
        if(result == Integer.MAX_VALUE){
                return 0;
            }
        return result;
        
    }
    public static void main(String args[]){
        MaxSubarraySum sl = new MaxSubarraySum();
        int [] nums = {2,3,1,2,4,3};
        System.out.println(sl.minSubArrayLen(7,nums));
    }
}