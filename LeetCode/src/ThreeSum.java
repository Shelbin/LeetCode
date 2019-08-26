import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 给定一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？找出所有满足条件且不重复的三元组。
 *
 * 解题思路：
 * 转换为双指针思想：
 * 1.排序;
 * 2.确定a，寻找 a + b + c = 0;
 * 3.双指针即为 b, c;
 * 4.注意手动去重；因为确定三数和为0，那么a>0即可提前结束；
 */

public class ThreeSum {
    public static void main(String[] args) {
        int[] nums = {0,3,1,-3,1,-9,9,2,6};
        List<List<Integer>> lists = threeSum(nums);
        for (List<Integer> list : lists) {
            System.out.println(list);
        }
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums.length == 0) {
            return result;
        }
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                break;
            }
            if(i>0&&nums[i]==nums[i-1]){
                continue;
            }
            int m = i + 1, n = nums.length - 1;
            while (m < n) {
                if (n<nums.length-1&&nums[n]==nums[n+1]||nums[i] + nums[m] + nums[n] > 0) {
                    n--;
                } else if (m>i+1&&nums[m]==nums[m-1]||nums[i] + nums[m] + nums[n] < 0) {
                    m++;
                } else {
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[m++]);
                    list.add(nums[n--]);
                    result.add(list);
                }
            }
        }
        return result;

    }
}
