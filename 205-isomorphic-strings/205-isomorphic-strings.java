class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> pair =new HashMap<>();
        // boolean ans = false;
        // for(int i=0;i<s.length();i++){
        //     if(map.containsKey(s.charAt(i))){
        //         if(map.get(s.charAt(i))==s.charAt(i)){
        //             continue;
        //         }
        //         else{
        //             return false;
        //         }
        //     }else{
        //        if(map.containsValue(t.charAt(i))){
        //            return false;
        //        }
        //          map.put(s.charAt(i),s.charAt(i));
        //     }
        // }
        // return true;
        
         for(int i = 0 ; i<s.length(); i++)
    {
        if(pair.containsKey(s.charAt(i)))
        {
            if(pair.get(s.charAt(i))==t.charAt(i))
                continue;
            else
                return false;
        }
        else
        {
            if(pair.containsValue(t.charAt(i)))
                return false;
            pair.put(s.charAt(i),t.charAt(i));
        }
    }
    return true;
    }
}