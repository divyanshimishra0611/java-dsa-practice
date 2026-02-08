class EvenDigits {
    public int findNumbers(int[] nums) {
         int count =0;
         for(int i =0; i<nums.length; i++){
            int digits = noOfDigits(nums[i]); 
            if(digits %2 ==0){
                count++;
            }
         }
         return count;
    }

    public int noOfDigits(int num){
         int count =0;
         if(num <0){
            num = num * -1;
         }
         if(num == 0){
            return -1;
         }
         while(num>0){
            count++;
            num/=10;
         }
         return count;
        
    }

    
    public static void main(String args[]){
        EvenDigits s = new EvenDigits();
        int[] nums = {12,345,2,6,7896};
        System.out.println(s.findNumbers(nums));
    }
}