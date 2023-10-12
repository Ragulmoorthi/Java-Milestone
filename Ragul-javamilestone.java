
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer,Integer> Greater = new HashMap<>();
        Deque<Integer> stack = new ArrayDeque<Integer>();

        for (int num:nums2){
            while(!stack.isEmpty () && num > stack.peek() ){
                Greater.put(stack.pop(),num);
            }
            stack.push(num);
        }
        int[] result = new int[nums1.length]; 
        for (int i=0;i<nums1.length;i++){
            result[i] =  Greater.getOrDefault(nums1[i],-1);
        }
  return result;
}
}