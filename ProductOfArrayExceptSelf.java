class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        int max = 1, countZero = 0;
        for (int i = 0 ; i<nums.length;i++){       
            if  (nums[i] != 0)  max *= nums[i];
            else{
                countZero ++; 
                if(countZero > 1) break;
            }
        }
        if  (countZero > 1)    return res;
        for (int i = 0; i<nums.length; i++ ){
            if  (countZero > 0){
                if  (nums[i] == 0){
                    res[i] = max;
                    return res;
                }
            }
            
            else res[i] = max / nums[i];
        }
        return res;
    }

}
