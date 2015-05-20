package code_11_20;

/**
 * author: brian.shen  brian.shen@dianping.com
 * date: 2015/5/20  15:51
 * description:Given n non-negative integers a1, a2, ..., an, where each represents a point at coordinate (i, ai). 
 * * n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0). Find two lines, which together with x-axis forms a container, such that the container contains the most water.
 * * Note: You may not slant the container.
 */
public class ContainerWithMostWater_11 {
    public int maxArea(int[] height) {
        int lp = 0;
        int rp = height.length - 1;
        int water = 0;
        int temp = 0;
        while (lp < rp) {
            if (height[lp] >= height[rp]) {
                temp = height[rp] * (rp - lp);
                rp --;
                
            } else {
                temp = height[lp] * (rp - lp);
                lp ++;
                
            }
            water = water > temp ? water :temp;
        }
        
        return water;
    }
    
}
