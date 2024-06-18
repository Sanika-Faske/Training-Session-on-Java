package Day_3.pack;

public class Array2D {

	public static void main(String[] args) {
		//DEfine no. of columns in each row
		int[][] x = new int[3][];
		x[0]=new int[3];
		x[1]=new int[2];
		x[2]=new int[5];
		
		// Print array element
		for(int i=0; i<x.length;i++) {
			for(int j=0; j<x[i].length;j++) {
				x[i][j]=i;
				System.out.print(x[i][j]);
				
			}
			System.out.println();
		}

	}

}
