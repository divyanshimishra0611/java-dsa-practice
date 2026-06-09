class MaxAvgSubaaray {
    public double findMaxAverage(int[] nums, int k) {

        int low =0;
        int high = k-1;
        int sum =0;
        int maxSum = Integer.MIN_VALUE;

        for(int i =low; i<=high; i++){
            sum += nums[i];
        }

        while(high<nums.length){
            maxSum = Math.max(sum, maxSum);
            low++;
            high++;
            sum -= nums[low-1];

            if(high == nums.length){
                break;
            }

            sum += nums[high];
        }
        return (double)maxSum/k;

        
    }
    public static void main(String args[]){
        MaxAvgSubaaray sl = new MaxAvgSubaaray();
        int[] nums = {1,12,-5,-6,50,3};
        System.out.println(sl.findMaxAverage(nums,4));
    }
}