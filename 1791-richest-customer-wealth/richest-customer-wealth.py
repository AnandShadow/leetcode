class Solution:
    def maximumWealth(self, accounts: list[list[int]]) -> int:
        maximum= float('-inf')# minimum value that int can hold 
        for i in range(0, len(accounts)):
            if sum(accounts[i])> maximum:
                maximum= sum(accounts[i])
        return maximum