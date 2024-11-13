package Arrays;

public class Trapped_Rainwater {  // TC->O(n)
    public static int TrappedWater(int height[]){
        int n = height.length;
        // left max boundary
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for (int i=1;i<n;i++){
            leftMax[i] = Math.max(height[i],leftMax[i-1]);
        }
        // right max boundary
        int rightMax[] = new int[n];
        rightMax[n-1] = height[n-1];
        for (int i=n-2;i>=0;i--){
            rightMax[i] = Math.max(height[i],rightMax[i+1]);
        }
        int tp = 0;
        // loop
        for (int i=0;i<n;i++){
            // Wl = min(leftMax,rightMax)
            int waterLevel = Math.min(leftMax[i],rightMax[i]);
            // TP = waterLevel - height[i]
            tp +=waterLevel - height[i];
        }
        return tp;
    }
    public static void main(String[] args) {
        int height[] = {4,2,0,6,3,2,5};
        System.out.println("Total Water is Trapped -> "+TrappedWater(height));
    }
}
