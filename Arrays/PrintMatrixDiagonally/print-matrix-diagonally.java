import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		// write your code here
		Scanner sc = new Scanner(System.in);
		int row = Integer.parseInt(sc.nextLine());
		int[][] arr = new int[row][];
		
		for (int i = 0; i < row; i++) {
        String line = sc.nextLine().trim();
        
        String[] parts = line.split("\\s+");
        
        arr[i] = new int[parts.length];
        
        for(int j=0; j<parts.length; j++){
            arr[i][j] = Integer.parseInt(parts[j].trim());
        }
}
		
		for(int i=0; i<row; i++){
		    if(i>=row-1){
		        for(int j=0; j<arr[i].length; j++){
		            movement(i, j, arr);
		        }
		        break;
		    }
		    movement(i, 0, arr);
		}

	    
	}
	
	 static void movement(int row, int col, int[][] arr){
	    int i = row;
		int j = col;
		while(i>=0){
		    if(j<arr[i].length){
		      System.out.print(arr[i][j]+ " ");  
		    }
		    
		    i--;
		    j++;
		}
	}
	
	

}
