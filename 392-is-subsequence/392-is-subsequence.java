class Solution {
    public boolean isSubsequence(String s, String t) {
       //  int i=0,j=0;
       //  while(i<s.length() && j<t.length()){
       //      if(s.charAt(i)==t.charAt(j)){
       //          i++;
       //      } 
       //      j++;
       //  }
       // return i==s.length();
        
        char [] a = s.toCharArray();
        char b [] =t.toCharArray();
        int k=0;int i=0;
        if(a.length==0){
            return true;
        }
        while(i<b.length){
            if(a[k]==b[i]){
                i++;
                k++;
            }
            else{
                i++;
            }
            if(k==a.length){
                return true;
            }
        }
        return false;
        
       
        
//         char[] a = s.toCharArray();
//        char[] b = t.toCharArray();
//         int i=0,k=0; //i for b[] and k for a[]
//         if(a.length ==0)
//         {
//             return true; //checking 0 length
//         }
//         while(i< b.length) //Since greatest value of i can be b.length
//         {
//             if(a[k] == b[i])     
//             {
//                 k++; //k & i both increases
//                 i++;   
//             }   
//             else
//             {
//                 i++ ; //k constant but i moves on
//             }
            
//             if( k == a.length)
//             {
//                 return true;
//             }
            
//         }
//         return false;       
        }       
}