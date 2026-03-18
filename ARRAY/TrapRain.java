class TrapRain{

    public static int trap(int height[]){
        // LMB - Left Max Boundary
        int lmb[] = new int[height.length];
        lmb[0] = height[0];
        for(int i=1 ; i<height.length ; i++){
            lmb[i] = Math.max(lmb[i-1], height[i]);
        } 

        // Right Max Boundary
        int rmb[] = new int[height.length];
        rmb[height.length-1] = height[height.length-1];
        for(int j=height.length-2 ; j>=0 ; j--){
            rmb[j] = Math.max(rmb[j+1], height[j]);
        }

        // Water Trapped Calculation
        int trappedWater = 0;

        for(int k =0 ; k<height.length ; k++){
            trappedWater += Math.min(lmb[k], rmb[k]) - height[k];
        }
        return trappedWater;
    }
    public static void main(String args[]){
        int height[] = {4,2,0,6,3,2,5};
        int result = trap(height);
        System.out.println("Trapped water: " + result);
    }
}