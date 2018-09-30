
public class ReverseString {
	public static String reverse(String str) {
		char[] ch = str.toCharArray();
		int start = 0;
		int end = ch.length - 1;
		while (start < end) {
			char temp = ch[start];
			ch[start] = ch[end];
			ch[end] = temp;
			start++;
			end--;
		}
		return new String(ch);
	}

	public static void main(String[] args) {
		String str = "taco cat";
		System.out.println(str.substring(0));
		String result = reverse(str);
		System.out.println(result);
	}

}
