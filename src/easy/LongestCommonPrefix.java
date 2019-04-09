package easy;
/**
 * @author eruyuwe
 * @date 2019/04/07
 * 
 *       Write a function to find the longest common prefix string amongst an array of strings.
 * 
 *       If there is no common prefix, return an empty string "".
 * 
 *       Example 1:
 * 
 *       Input: ["flower","flow","flight"] Output: "fl" Example 2:
 * 
 *       Input: ["dog","racecar","car"] Output: "" Explanation: There is no common prefix among the input strings. Note:
 * 
 *       All given inputs are in lowercase letters a-z.
 */
public class LongestCommonPrefix {

    public static void main(String[] args) {

        String[] inputStr1 = {"flower", "flow", "flight"};
        String[] inputStr2 = {"dog", "racecar", "car"};

        System.out.println("Longest common refix of " + "[\"flower\",\"flow\",\"flight\"]" + " is " + longestCommonPrefix(inputStr1));
        System.out.println("Longest common refix of " + "[\"flower\",\"flow\",\"flight\"]" + " is " + longestCommonPrefix(inputStr2));
    }

    public static String longestCommonPrefix(String[] inputStr) {
        if (inputStr.length == 0) {
            return "";
        }
        String prefix = inputStr[0];

        for (int i = 1; i < inputStr.length; i++) {
            while (!inputStr[i].startsWith(prefix) && inputStr.length > 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }
        return prefix;
    }
}
