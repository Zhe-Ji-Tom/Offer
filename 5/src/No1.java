
public class No1 {
	
	public static void main(String[] arg) {
		long startTime=System.currentTimeMillis();
		int i=1000;
		String res=new String();
		while(i>0) {
			res=replace("we are happy sdsdfs sdfsdfws ererlkj sdpowes poiqjwlw sdlofwo  awsdaa asd asd  qwd as"
					+ " as das d qwe qwe asd qwe asd as fasf qwde asf asd aqwsd qw das fas fdqw fqwf  asdasd qwdas asd qwe asd asd asd qwe asd ");
			i--;
		}
		System.out.println(res);
		long endTime=System.currentTimeMillis();
		System.out.println(endTime-startTime);
	}
	
	public static String replace(String str) {
		String[] s=str.split(" ");
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<s.length;i++) {
			sb.append(s[i]);
			if(i!=s.length-1)
				sb.append("%20");
		}
		
		return sb.toString();
	}
	 public static String rep(String str) {
		 StringBuilder sb=new StringBuilder();
		 for(int i=0;i<str.length();i++) {
			 if(str.charAt(i)!=' ')
				 sb.append(str.charAt(i));
			 else
				 sb.append("%20");
		 }
		 
		 return sb.toString();
	 }
}
