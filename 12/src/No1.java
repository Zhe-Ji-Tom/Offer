
public class No1 {

	public static void main(String[] args) {
		char[][] ch= {
				{'a','b','t','g'},
				{'c','f','c','s'},
				{'j','d','e','h'}
		};
		
		String str="abfctgsg";
		int rows=ch.length;
		int cols=ch[0].length;
		boolean[][] visited=new boolean[rows][cols];
		
		for(int row=0;row<rows;row++) {
			for(int col=0;col<cols;col++) {
				if(find(ch,str,rows,cols,row,col,0,visited)) {
					System.out.println("true");
					return;
				}
			}
		}
		
		System.out.println("false");
	}
	
	public static boolean find(char[][] ch,String str,int rows,int cols,int row,int col,int index,boolean[][] visited) {
		boolean result=false;
		if(row>=0 && row<rows && col>=0 && col<cols && ch[row][col]==str.charAt(index) && !visited[row][col]) {
			visited[row][col]=true;
			
			if(index==str.length()-1)
				return true;
			
			result=find(ch,str,rows,cols,row+1,col,index+1,visited)
					|| find(ch,str,rows,cols,row,col+1,index+1,visited)
					|| find(ch,str,rows,cols,row-1,col,index+1,visited)
					|| find(ch,str,rows,cols,row,col-1,index+1,visited);
			
			if(!result) 
				visited[row][col]=false;
		}
		
		return result;
	}
}
