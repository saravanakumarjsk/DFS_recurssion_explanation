nums[i]=1 i= 0
[]

nums[i]=2 i= 1
[][1]

nums[i]=3 i= 2
[][1][1, 2]

nums[i]=3 i= 2
[][1][1, 2][1, 2, 3]

nums[i]=2 i= 1
[][1][1, 2][1, 2, 3][1, 3]

nums[i]=3 i= 2
[][1][1, 2][1, 2, 3][1, 3][2]

nums[i]=3 i= 2
[][1][1, 2][1, 2, 3][1, 3][2][2, 3]

[[], [1], [1, 2], [1, 2, 3], [1, 3], [2], [2, 3], [3]]

////////////////////////////////////////////////////////
// nums = [1, 2, 3];
// this is the actual code
class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        dfs(0, new ArrayList<>(), res, nums);
        return res;
    }
    
    private void dfs(int start, List<Integer> temp, List<List<Integer>> res, int[] nums)
    {
        res.add(new ArrayList<>(temp));
        for(int i=start; i<nums.length; i++)
        {
            temp.add(nums[i]);
            dfs(i+1, temp, res, nums);
            temp.remove(temp.size() - 1);
        }
    }
}
///////////////////////////////////////// EXPLANATION //////////////////////////////////////////////////////

void dfs(start = 0, List<Integer> temp, List<List<Integer>> full)
for(int i=0; i<nums.length; i++)
{
temp.add(nums[0] = 1);
temp = [1];// return [1]
	{
		dfs(i+1 = 1) = [1,2];// return [1,2]
		{
			for(int i=1; i<nums.length; i++)// return [1,2,3], [1,3]
			{
				temp.add(nums[1] = 2);
				temp = [1,2];
				dfs(i+1 = 2) = [1,2,3];// return [1,2,3]
				{
					temp.add(nums[2] = 3);
					temp = [1,2,3];
					dfs(i+1 = 3) = fails;
					temp.remove(temp.size() - 1); => remove(temp[2] = 3);
					this returns [1,2]; to dfs(1);
				}
				temp.remove(temp.size() - 1); => remove(temp[1] = 2);
				this returns [1]; to for(int i=2) on dfs(1) so increment i till its less than nums.length;
				i++;
				for(int i = 2; i<nums.length; i++) // return [1,3]
				{
					temp.add(nums[2] = 3)
					temp = [1,3];
					dfs(i+1 = 3) = fails;
					temp.remove(temp.size() - 1); => remove(temp[1] = 3);
					this returns [1]; to dfs(1);
				}
			}
		}
		temp.remove(temp.size() - 1); => remove(temp[1] = 2);
		this returns []; to for(int i=1) to continue to the next loop
		i++;
	} upto this line it returns [1], [1, 2], [1, 2, 3], [1, 3]
	
	for(int i=1; i<nums.length; i++) // this returns [2], [2,3]
	{
		temp.add(nums[1] = 2);
		temp = [2];
		dfs(i+1 = 2) = [2,3]// return [2,3]
		{
			for(int i = 2; i<nums.length; i++)
			{
				temp.add(nums[2] = 3)
				temp = [2,3];
				dfs(i+1 = 3) = fails;
				temp.remove(temp.size() - 1); => remove(temp[1] = 3);
				this returns [2]; to dfs(2);
			}
		}
		temp.remove(temp.size() - 1); => remove(temp[0] = 2);
		this returns []; to for(int i=1);
		i++;
	}
	
	for(int i=2; i<nums.length; i++) // returns [3]
	{
		temp.add(nums[2] = 3);
		temp = [3];
		dfs(i+1 = 3) = fails;
	}
}


////////////////// Code for visualizing the output /////////////////////////
package com.first;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Subset {

	public static List<List<Integer>> subsets(int[] nums) {
	    Arrays.sort(nums);
	    List<List<Integer>> ret = new ArrayList<>();
	    dfs(nums, 0, new ArrayList<>(), ret);
	    return ret;
	}

	private static void dfs(int[] nums, int idx, List<Integer> path, List<List<Integer>> ret) {
	    ret.add(path);
	    for (int i = idx; i < nums.length; i++) {
	        List<Integer> p = new ArrayList<>(path);
	        p.add(nums[i]);
	        System.out.println("nums[i]="+ nums[i]+" i= "+i);
	        for(List<Integer> k: ret)
		        {
		        	System.out.print(Arrays.toString(k.toArray()));
		        }
		        System.out.println();
		        System.out.println();
	        dfs(nums, i+1, p, ret);
	    }
	}

	public static void main(String[] args) 
	{
		int[] nums = { 1, 2, 3};
		System.out.println(subsets(nums));
	}

}

/*
nums[i] =1 i= 0
[]

nums[i] =2 i= 1
[][1]

nums[i] =3 i= 2
[][1][1, 2]

nums[i] =3 i= 2
[][1][1, 2][1, 2, 3]

nums[i] =2 i= 1
[][1][1, 2][1, 2, 3][1, 3]

nums[i] =3 i= 2
[][1][1, 2][1, 2, 3][1, 3][2]

nums[i] =3 i= 2
[][1][1, 2][1, 2, 3][1, 3][2][2, 3]

[[], [1], [1, 2], [1, 2, 3], [1, 3], [2], [2, 3], [3]]
 */
 
 //////////////////////////////////// END OF THE CODE ////////////////////////////////////////////////////////


















































