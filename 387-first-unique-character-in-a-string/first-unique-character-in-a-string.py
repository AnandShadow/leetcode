class Solution:
    def firstUniqChar(self, s: str) -> int:
        freq={}
        for st in s:
            if st in freq:
                freq[st]+=1
            else:
                freq[st]=1
        for ch in freq:
            if freq[ch]==1:
                return s.index(ch)
        return -1