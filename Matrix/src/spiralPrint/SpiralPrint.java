package spiralPrint;
import java.util.*;

public class SpiralPrint {

	public static void main(String[] args) {
		int [][]matrix= {
				{10,20,30,40},
				{15,25,35,45},
				{28,29,37,49},
				{33,34,38,50}
				
		};
		List<Integer> list=new ArrayList<>();
		
		int row=matrix.length;
		int col=matrix[0].length;
		
		int startingRow=0;
		int endingRow=row-1;
		int startingCol=0;
		int endingCol=col-1;
		
		int count=0;
		int total=row*col;
		while(count<total) {
			for(int index=startingCol;count<total && index<=endingCol;index++) {
				list.add(matrix[startingRow][index]);
				count++;
			}
			startingRow++;
			
			for(int index=startingRow;count<total && index<=endingRow;index++) {
				list.add(matrix[index][endingCol]);
				count++;
			}
			endingCol--;
			
			for(int index=endingCol;count<total && index>=0;index--) {
				list.add(matrix[endingRow][index]);
				count++;
			}
			endingRow--;
			
			for(int index=startingCol;count<total && index>=0;index--) {
				list.add(matrix[startingRow][index]);
				count++;
			}
			startingCol++;
			
		}
		System.out.println(list);

	}

}
