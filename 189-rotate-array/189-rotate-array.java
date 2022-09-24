class Solution {
    public void rotate(int[] nums, int k) {
        int n= nums.length;
        
        if(k>n){
            k=k%n;
            reverse(0,n-1,nums);
            reverse(0,k-1,nums);
            reverse(k,n-1,nums);
        }
        else{
            reverse(0,n-1,nums);
            reverse(0,k-1,nums);
            reverse(k,n-1,nums);
        
        }
    }
    static void reverse(int low,int high,int arr[]){
        while(low<high){
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }
}