class MostWater {
    public int maxArea(int[] height) {
        int lp = 0;
        int rp = height.length-1;

        int maxWater = 0;

        while(lp<rp){
            int width = rp-lp;
            int ht = Math.min(height[lp], height[rp]);

            int currWt = width*ht;
            maxWater = Math.max(currWt,maxWater);

            if(height[lp]<height[rp]){
                lp++;
            }
            else{
                rp--;
            }
        }
        return maxWater;
        
    }
    public static void main(String args[]){
        MostWater sl = new MostWater();
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(sl.maxArea(height));
    }
}