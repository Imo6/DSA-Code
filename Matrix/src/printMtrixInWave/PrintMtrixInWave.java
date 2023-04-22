package printMtrixInWave;

public class PrintMtrixInWave {

	public static void main(String[] args) {
		int [][]matrix= {
				{10,20,30,40},
				{15,25,35,45},
				{28,29,37,49},
				{33,34,38,50}
				
		};
//		for(int r=0;r<matrix.length;r++) {
			for(int c=0;c<matrix[0].length;c++) {
				if(c%2!=0) {
					for(int r=matrix.length-1;r>=0;r--) {
						System.out.print(matrix[r][c]+" ");
					}
					System.out.println();
				}else {
					for(int r=0;r<matrix.length;r++) {
						System.out.print(matrix[r][c]+" ");
					}
					System.out.println();
				}
			}
		}

}
