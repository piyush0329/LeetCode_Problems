class Solution {
    public int removeDuplicates(int[] nums) {
        // HashSet<Integer> set = new HashSet<>();
        // for(int i=0;i<nums.length;i++){
        //     set.add(nums[i]);
        // }
        // int i=0;
        // for(Integer element : set){
        //     nums[i++] =element;
        // }
        // return i;
     
        int i=0;
        for(int j=1;j<nums.length;j++){
            if(nums[j]!=nums[i]){
                 i++;
                nums[i]=nums[j];
               
            }
        }
        return i+1;
    }
}