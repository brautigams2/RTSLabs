//Shawn Brautigam
//August 15, 2022

import java.util.*;
public class Class1 {
    public Map<String,Integer> aboveBelow(int[] nums, int x){
        int above=0, below=0;
        for(int num : nums){
            if(num < x) below++;
            else if(num > x) above++;
        }
        Map<String,Integer> aboveBelow = new HashMap<String,Integer>();
        aboveBelow.put("below",below);
        aboveBelow.put("above",above);
        return aboveBelow;
    }
    
    public String stringRotation(String s, int rotation){
        return s.substring(s.length()-rotation).concat(s.substring(0,s.length()-rotation));
    }
}