class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
         # can implement a sort function to sort array
         # once we have sorted array (nlogn), we may traverse 
         # and if we have adjacent elements that are the same, we have a duplicate
         # worst case T(n) = nlogn + n ---> O(nlogn)

         nums.sort()
         for i in range(len(nums) - 1):
            if nums[i] == nums[i + 1]:
                return True
         return False