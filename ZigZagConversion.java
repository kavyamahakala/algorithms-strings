
public class ZigZagConversion {
	public static String zigzag(String s, int rows) {
		int len= s.length();
		char[] ch=s.toCharArray();
		StringBuilder[] results= new StringBuilder[rows];

		for(int i=0;i<results.length;i++) {
			results[i]=new StringBuilder();
		}
		int i=0;
		while(i<len) {
			for(int j=0;j<rows&&i<len;j++) {
				results[j].append(ch[i++]);
			}
			for(int k=rows-2; k>=1&&i<len;k--) {
				results[k].append(ch[i++]);
			}
		}
		for(int l=1;l<results.length;l++) {
			results[0].append(results[l]);
		}
		
		return new String(results[0]);
	}

	
	public static void main(String[] args) {
		String s= "PAYPALISHIRING";
		String result = zigzag(s,3);
		System.out.println(result);
		
	}
}
