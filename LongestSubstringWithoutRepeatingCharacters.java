import java.util.HashMap;

public class LongestSubstringWithoutRepeatingCharacters {
	public static int answerOptimized(String s) {
		if (s.length() == 0) return 0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int max = 0;
        for (int i = 0, j = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                j = Math.max(j, map.get(s.charAt(i)) + 1);
            }
            map.put(s.charAt(i), i);
            max = Math.max(max, i - j + 1);
        }
        return max;
	}
	
    public static void main(String[] args) {

        String s = "acsasdbbbbba";
        int answer = answerOptimized(s);
        System.out.println(answer);

    }
}
