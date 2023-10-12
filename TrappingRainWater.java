class Solution {
    public int trap(int[] height) {
        int[] leftmax = new int[height.length];
        int[] rightmax = new int[height.length];
        leftmax[0] = height[0];
        rightmax[height.length-1] = height[height.length-1];
        for(int i=1; i<height.length; i++){
            if(leftmax[i-1] > height[i]){
                leftmax[i] = leftmax[i-1];
            }
            else{
                leftmax[i] = height[i];
            }
        }

        for(int i=height.length-2; i>=0 ; i--){
            if(rightmax[i+1] > height[i]){
                rightmax[i] = rightmax[i+1];
            }
            else{
                rightmax[i] = height[i];
            }
        }

        int ans = 0;
        
        for(int i=1; i<height.length-1; i++){
            int maxi = Math.min(leftmax[i], rightmax[i]);
            if(maxi > height[i]){
                ans += maxi - height[i];
            } 
        }

        return ans;
    }
}