import java.util.*;
class SquaredArray {
    public int[] sortedSquares(int[] nums) {

        ArrayList <Integer> res= new ArrayList<>();
        
        int left =0;
        int right = nums.length -1;
        
        while(left<=right){
            if(nums[left]*nums[left]>nums[right] *nums[right]){
                res.add(nums[left]*nums[left]);
                left++;
            }
            else{
                res.add(nums[right]*nums[right]);
                right--;
            }
        }
        Collections.reverse(res);
        return res.stream().mapToInt(i -> i).toArray();
        
    }
    public static void main(String args[]){
        SquaredArray sl = new SquaredArray();
        int[] nums = {-4,-1,0,3,10};
        int[]  answer = sl.sortedSquares(nums);
        for(int i =0; i<answer.length; i++){
            System.out.print(answer[i]+ " ");
        }
    }
}