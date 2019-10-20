
public class dcp65 {

	public static void main(String[] args) {

		int[][] testMatrix = {
			{1,2,3,4,5},
			{6,7,8,9,10},
			{11,12,13,14,15},
			{16,17,18,19,20}
		};
		
		int[][] testMatrix2 = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		
		doMagic(testMatrix2);
	}
	
	public static void doMagic(int [][]values) {
		
		boolean done = false;
		int cnt = 0;				// running count of values printed so far
		int top = 0;				
		int left = 0;
		int right = values[0].length - 1;
		int bottom = values.length - 1;
		int totValues = values[0].length * values.length; 
		
		while (!done) {	
			for (int x = left; x <= right; x++) {		// go right
				System.out.println(values[top][x]);
				cnt++;
				if (cnt == totValues) { return; }
			}
			
			
			for (int y = top+1; y <= bottom; y++) { 		// go down
				System.out.println(values[y][right]);
				cnt++;
			}
			
			
			for (int x = right-1; x >= left; x--) {		// go left
				System.out.println(values[bottom][x]);
				cnt++;
				if (cnt == totValues) { return; }
			}
			
			for (int y = bottom-1; y > top; y--) {		// go up
				System.out.println(values[y][left]);
				cnt++;
			}
			
			top++;
			bottom--;
			left++;
			right--;
			
		}
		
	}

}
