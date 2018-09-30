
public class IntegerToRoman {
	
	public static String inttoroman(int number) {
		String[] M= {"","M","MM","MMM"};
	    String[] C = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
	    String[] X = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
	    String[] I = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
		
		return M[number/1000]+C[(number%1000)/100]+X[(number%100)/10]+I[number%10];
	}

	public static void main(String[] args) {
		int number= 1994;
		String answer= inttoroman(number);
		System.out.println(answer);
	}
}
