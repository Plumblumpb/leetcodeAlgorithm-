package A1两数之和;


import java.util.HashMap;

/**
 * @Auther: cpb
 * @Date: 2018/9/17 08:29
 * @Description:
 */
public class Solution {

    public int[] twoSum1(int[] nums, int target) {
        int[] demo = new int[2];
       if(nums.length<2){
           return demo;
       }

       HashMap<Integer,Integer> hashMap = new HashMap();
       for(int i = 0 ; i< nums.length ;i++){
            hashMap.put(nums[i],i);
       }

       for (int i = 0 ; i< nums.length ;i++){
          int var = target - nums[i];
          if(hashMap.containsKey(var) &&  hashMap.get(var) != i){
              demo[0] = i+1;
              demo[1] = hashMap.get(var)+1;

          }
       }
       return demo;
    }

    public int[] twoSum2(int[] nums, int target) {
        int[] demo = {};
        if (nums.length < 2){
            return demo;
        }

        HashMap<Integer,Integer> hashMap = new HashMap();
        for(int i = 0 ; i < nums.length ; i++){
            int var = target - nums[i];
            if(hashMap.containsKey(target - nums[i]) && hashMap.get(var) != i) {
                demo[0] = i+1;
                demo[1] = hashMap.get(var)+1;
            }
            hashMap.put(nums[i],i);
        }
        return demo;
    }

    public static void main(String[] args) {

    }
}
