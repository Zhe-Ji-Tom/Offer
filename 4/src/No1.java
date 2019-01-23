
public class No1 {

	public static void main (String[] args) {
		int[][] arr= {
				{1,2,8,9},
				{2,4,9,12},
				{4,7,10,13},
				{6,8,11,15}
		};
		
		if(find(arr,14))
			System.out.println("true");
		else
			System.out.println("false");
	}
	
	public static boolean find(int[][] arr,int k) {
		int col=arr[0].length-1;
		int row=0;
		
		while(col>=0 && row<=arr.length-1) {
			if(arr[row][col]==k)
				return true;
			if(arr[row][col]>k)
				col--;
			else
				row++;
		}
		
		return false;
	}
}
