import java.util.Stack;

public class BalancedParenthesis {
	public static boolean check(String str) {
		Stack<Character> s=new Stack<Character>();
		char[] ch= str.toCharArray();
		for(int i=0; i<ch.length;i++) {
			if(ch[i]=='{'||ch[i]=='('||ch[i]=='['){
		    s.push(ch[i]);
			}
			else if(s.empty())
				return false;
			else if(ch[i]=='}' && s.peek()=='{')
				s.pop();
			else if(ch[i]==')' && s.peek()=='(')
				s.pop();
			else if(ch[i]==']' && s.peek()=='[')
				s.pop();
			else
				s.push(ch[i]);
		}
		
		return s.isEmpty();
	}
	
	public static void main(String[] args)
	{
		String s="{{[()]}}";
		boolean result= check(s);
		System.out.println(result);
	}
}
