
public class No1 {

	public static void main(String[] args) {
		int[] original= {1,2,3,4,5};
		int[] result=exchange(original);
		
		for(int i:result)
			System.out.print(i);
	}
	
	public static int[] exchange(int[] original) {
		for(int i=0,j=original.length-1;i<j;) {
			if(original[i]%2==1) 
				i++;
			else {
				int temp=original[i];
				original[i]=original[j];
				original[j]=temp;
				j--;
			}
		}
		
		return original;
	}
}
