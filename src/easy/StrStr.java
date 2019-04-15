package easy;

/**
 * @author eruyuwe
 * @date 2019/04/14
 * 
 *       Implement strStr().
 * 
 *       Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 * 
 *       Example 1:
 * 
 *       Input: haystack = "hello", needle = "ll" Output: 2 Example 2:
 * 
 *       Input: haystack = "aaaaa", needle = "bba" Output: -1
 */
public class StrStr {

    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("output of hello-ll is " + strStr("hello", "ll"));
        System.out.println("output of aaaaa-bba is " + strStr("aaaaa", "bba"));
    }

    public static int strStr(String haystack, String needle) {
        if (needle.isEmpty()) {
            return 0;
        }

        for (int i = 0; i < haystack.length() - needle.length() + 1; i++) {
            if (haystack.substring(i, i + needle.length()).equals(needle)) {
                return i;
            }
        }
        return -1;
    }

}
