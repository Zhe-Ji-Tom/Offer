
public class No1 {

	public static void main(String[] args) {
		String reg="ab*a";
		String test="aaa";
		System.out.println(regular(reg,test));
	}
	
	public static boolean regular(String reg,String test) {
		int i=0, j=0;
		for(;i<reg.length() && j<test.length();) {
			if(reg.charAt(i)=='.') {
				i++;
				j++;
			}
			else if(reg.charAt(i)=='*') {
				if(test.charAt(j)==reg.charAt(i-1))
					j++;
				else
					i++;
			}
			else {
				if(reg.charAt(i)==test.charAt(j)) {
					i++;
					j++;
				}
				else if(reg.charAt(i+1)=='*')
					i++;
				else
					return false;
			}
		}
		
		if(i==reg.length() && j==test.length()) 
			return true;
		else
			return false;
	}
	
}
