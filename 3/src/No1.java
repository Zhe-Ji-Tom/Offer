
public class No1 {

	public static void main(String[] args) {
		int[] arr= {2,3,1,0,2,5,3};
		int res=find(arr);
		if(res!=-1)
			System.out.println(res);
		else
			System.out.println("null");
	}
	
	public static int find(int[] arr) {
		for(int i=0;i<arr.length;) {
			if(arr[i]==i) {
				i++;
				continue;
			}
			else if(arr[i]==arr[arr[i]])
				return arr[i];
			else {
				int temp=arr[arr[i]];
				arr[arr[i]]=arr[i];
				arr[i]=temp;
			}
		}
		return -1; 
	}
}
