import java.util.HashMap;

public class RomanToInteger {
	public static int answer(String s) {
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		hm.put('I', 1);
		hm.put('V', 5);
		hm.put('X', 10);
		hm.put('L', 50);
		hm.put('C', 100);
		hm.put('D', 500);
		hm.put('M', 1000);
		int len= s.length();
		int result=hm.get(s.charAt(len-1));
		for(int i=len-2;i>=0;i--) {
			if(hm.get(s.charAt(i))>= hm.get(s.charAt(i+1))) {
				result+=hm.get(s.charAt(i));
			}
			else
				result-=hm.get(s.charAt(i));
		}
		return result;
	}

	public static void main(String[] args) {
		String result = "XLI";
		int answer = answer(result);
		System.out.println(answer);
	}
}
