package code_1_10;

import java.util.HashMap;
import java.util.Map;

/**
 * author: brian.shen  brian.shen@dianping.com
 * description:
 * date: 2015/5/13  14:03
 * discription:Given an array of integers, find two numbers such that they add up to a specific target number.
 *  The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2.
 *  Please note that your returned answers (both index1 and index2) are not zero-based.
 *  You may assume that each input would have exactly one solution.Input: numbers={2, 7, 11, 15}, target=9
 *  Output: index1=1, index2=2
 */
public class TwoSum_1 {
    public int[] twoSum(int[] numbers, int target) {
        int ret[] = new int[2];
        int i = 0;
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        while(i < numbers.length) {
            if(map.containsKey(numbers[i])) {
                ret[0] = map.get(numbers[i]) + 1;
                ret[1] = i + 1;
                break;
            }
            map.put(target - numbers[i],i);
            i++;
        }
        return ret;
    }
}

