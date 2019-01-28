
public class No2 {
	public static void main(String[] args) {
		int[] fac1= {1,2,3};
		int[] fac2= {9,8,7,6};
		int[] sum=add(fac1,fac2);
		
		for(int i=sum.length-1;i>=0;i--) {
			if(sum[i]!=0) {
				for(;i>=0;i--) {
					System.out.print(sum[i]);
				}
				break;
			}
		}
	}
	
	public static int[] add(int[] fac1,int[] fac2) {
		int lengthOfSum=Math.max(fac1.length, fac2.length)+1;
		int[] sum=new int[lengthOfSum];
		boolean overTen=false;
		
		for(int i=0;i<lengthOfSum;i++) {
			int f1=0;
			int f2=0;
			if(i<fac1.length)
				f1=fac1[i];
			if(i<fac2.length)
				f2=fac2[i];
			
			sum[i]=f1+f2;
			
			if(overTen==true) {
				sum[i]++;
				overTen=false;
			}
			
			if(sum[i]>9) {
				sum[i]=sum[i]-10;
				overTen=true;
			}
		}
		
		return sum;
	}
}
