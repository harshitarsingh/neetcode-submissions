class Solution {
    public int maxArea(int[] heights) {
        
        int i=0, j=heights.length-1;
        int cap=0, res=0;
        while(i<j)
        {
            cap=(j-i)*Math.min(heights[i], heights[j]);
            res=Math.max(cap, res);

            if(heights[i]<heights[j])
            i++;
            else
            j--;
        }

        return res;
    }
}
