
public class LongestPalindromeSubstring {
	public static String longestPalSubstr(String s) {
		int len = s.length();
		boolean table[][] = new boolean[len][len];
		String result = null;
		for (int i = len - 1; i >= 0; i--) {
			for (int j = i; j < len; j++) {
				table[i][j] = s.charAt(i) == s.charAt(j) && (j - i + 1 < 3 || table[i + 1][j - 1]);

				if (table[i][j] && (result == null || (j - i + 1) > result.length()))
					result = s.substring(i, j + 1);
			}
		}
		return result;
	}

	public static void main(String[] args) {

		String str = "babad";
		System.out.println(longestPalSubstr(str));
	}
}
