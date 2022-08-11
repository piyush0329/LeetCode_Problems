class Solution {
    public int[] plusOne(int[] digits) {
      // digits[digits.length-1]=digits[digits.length-1]+1;
      //   return digits;
         int pos=-1;
        for(int i=digits.length-1;i>=0;i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }            
            digits[i]=0;
        }
        int res[]=new int[digits.length+1];
        res[0]=1;
        return res;
        }
        
    }
