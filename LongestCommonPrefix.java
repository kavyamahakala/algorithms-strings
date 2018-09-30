
public class LongestCommonPrefix {

	public static String checkPrefix(String str1, String str2) {
		StringBuilder sb = new StringBuilder();
		char[] ch1 = str1.toCharArray();
		char[] ch2 = str2.toCharArray();

		int len1 = ch1.length;
		int len2 = ch2.length;

		for (int i = 0, j = 0; i < len1 && j < len2; i++, j++) {
			if (ch1[i] != ch2[j])
				break;
			else
				sb.append(ch1[i]);

		}
		return sb.toString();

	}

	public static String commonPrefix(String[] strs) {
		if (strs.length == 0 || strs == null)
			return "";
		String result = strs[0];
		for (int i = 1; i < strs.length; i++) {
			result = checkPrefix(result, strs[i]);
		}
		return result;
	}

	public static void main(String[] args) {
		String[] strs = { "fliower", "fliow", "flight", "fli" };
		String answer = commonPrefix(strs);
		System.out.println(answer);
	}

}
