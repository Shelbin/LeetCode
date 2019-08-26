public class IsHuiWenShu {

    /**
     * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
     *
     * 解题思路：
     * 解法1：
     * 最好理解的一种解法就是先将 整数转为字符串 ，然后将字符串分割为数组，只需要循环数组的一半长度进行判断对应元素是否相等即可。
     *
     */

    public static void main(String[] args) {
        System.out.println(isPalindrome(1252112521));
    }


    public static boolean isPalindrome(int x) {

        String reversedStr = new StringBuilder(x + "").reverse().toString();
        return (x + "").equals(reversedStr);

    }
}
