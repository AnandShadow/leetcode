class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        /*char[] ss= s.toCharArray(); //O(N)
        char[] tt= t.toCharArray(); //O(N)
        Arrays.sort(ss);//O(NlogN)
        Arrays.sort(tt);//O(NlogN)
        
        return Arrays.equals(ss,tt);//O(N)+O(N)+0(NlogN)+O(NlogN)
        */
        int[] count = new int[26];
        for(int i=0;i<s.length();i++){
            count[s.charAt(i)-'a']++;
            count[t.charAt(i)-'a']--;
        }
        for(int a: count){
            if(a!=0) return false;
        }
        return true;
    }
}