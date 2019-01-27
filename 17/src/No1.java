
public class No1 {

	public static void main(String[] args) {
		print(1);
	}
	
	public static void print(int length) {
		int[] number=new int[length];
		while(increase(number)) {
			for(int i=number.length-1;i>=0;i--) {
				if(number[i]!=0) {
					for(;i>=0;i--) {
						System.out.print(number[i]);
					}
					System.out.println();
					break;
				}
			}
		}
	}
	
	public static boolean increase(int[] number) {
		boolean over=false;
		for(int i=0;;) {
			if(number[i]==9) {
				if(i!=number.length-1) {
					number[i]=0;
					over=true;
				}else
					return false;
			}else
				number[i]++;
			if(over==true) {
				i++;
				over=false;
			}else
				break;
		}
		return true;
	}
}
