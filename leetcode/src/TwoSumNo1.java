import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
/*
    https://leetcode.com/problems/two-sum/description/
 */
public class TwoSumNo1 {

    public static void main(String[] args) {
        int[] input = {2, 7, 11, 15};
        System.out.println(Arrays.toString(twoSum(input, 17)));
    }

    public static int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap();

        int[] result = new int[2];

        for (int i = 0; i < nums.length; i++) {
            int val = target-nums[i];

            if (map.containsKey(val)) {
                result[0] = i;
                result[1] = map.get(val);
                break;
            }

            map.put(nums[i], i);

        }
        return result;
    }

//    public static int[] twoSum(int[] nums, int target) {
//
//        Map<Integer, Integer> map = new Hashtable();
//
//        for (int i = 0; i < nums.length; i++) {
//            map.put(nums[i], i);
//        }
//
//        int[] result = new int[2];
//
//        for (int i = 0; i < nums.length; i++) {
//            Integer j = map.get(target-nums[i]);
//
//            if (j != null && j.intValue() != i) {
//
//                result[0] = i;
//                result[1] = j.intValue();
//                break;
//            }
//
//        }
//        return result;
//    }

//    public static int[] twoSum(int[] nums, int target) {
//
//        Map<Integer, Integer> map = new Hashtable();
//
//        for (int i = 0; i < nums.length; i++) {
//            map.put(nums[i], i);
//        }
//
//        int[] result = new int[2];
//
//        for (int i = 0; i < nums.length; i++) {
//            Integer j = map.get(target-nums[i]);
//
//            if (j == null) {
//                continue;
//            }
//
//            if (j.intValue() != i) {
//
//                result[0] = i;
//                result[1] = j.intValue();
//                break;
//            }
//
//        }
//        return result;
//    }
//    public static int[] twoSum(int[] nums, int target) {
//
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//                if ((nums[i] + nums[j]) == target) {
//                    return new int[] {i, j};
//                }
//            }
//        }
//        return null;
//    }
}
