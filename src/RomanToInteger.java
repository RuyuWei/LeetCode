import java.util.HashMap;
import java.util.Map;

/**
 * Created : 3/20/2019.
 * Created by eruyuwe.
 */
public class RomanToInteger {


    public static void main(String[] args) {

        System.out.println("Result is :" + RomanToInteger("III"));
        System.out.println("Result is :" + RomanToInteger("IV"));
        System.out.println("Result is :" + RomanToInteger("IX"));
        System.out.println("Result is :" + RomanToInteger("LVIII"));
        System.out.println("Result is :" + RomanToInteger("MCMXCIV"));
    }

    public static int RomanToInteger (String s) {

        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int len = s.length();
        int result = map.get(s.charAt(len - 1));
        for (int i = len - 2; i >= 0; i --) {
            if (map.get(s.charAt(i)) >= map.get(s.charAt(i + 1))) {
                result += map.get(s.charAt(i));
            } else {
                result -= map.get(s.charAt(i));
            }
        }

        return result;
    }

}
