import java.util.*;
class LongSubstrWithReplacement {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer> map =
                new HashMap<>();

        int low = 0;
        int maxFreq = 0;
        int maxLen = 0;

        for(int high = 0;high < s.length();high++) {

            char ch = s.charAt(high);

            map.put(ch,map.getOrDefault(ch,0)+1);

            maxFreq = Math.max(maxFreq, map.get(ch));

            while((high-low+1)-maxFreq > k) {

                char leftCh =s.charAt(low);

                map.put(leftCh,map.get(leftCh)-1);

                low++;
            }

            maxLen =Math.max(maxLen,high-low+1);
        }

        return maxLen;
    
        
    }
    public static void main(String args[]){
        LongSubstrWithReplacement sl = new LongSubstrWithReplacement();
        String s = "ABAB";
        System.out.println(sl.characterReplacement(s,2));
    }
}