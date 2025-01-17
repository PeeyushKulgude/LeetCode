class Solution {
    public List<List<Integer>> subsets(int[] nums) 
    {
        int t = nums.length;
        int length = (int)Math.pow(2,t)-1;
        List<List<Integer>> fin = new ArrayList();
        for(int i = 0;i<=length;i++)
        {
            List<Integer> temp = new ArrayList<Integer>();
            for(int j = 0;j<t;j++)
            {
                if ( ((i>>j) & 1) == 1)
                {
                    temp.add(nums[j]);
                }
            }
            fin.add(temp);
        }
        return fin;
    }
}