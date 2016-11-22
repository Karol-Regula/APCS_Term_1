public class ArrayMethods{
    
    //make a method that generates a 2d array with random lengths and values
    public static void main(String[]args){
	int[][] nums = new int[3][6];//3 arrays of 6
	fillArray2d(nums);
	printArray2d(nums);
	System.out.println(max(nums));//works
	System.out.println(rowSum(nums, 0));//works
	System.out.println(columnSum(nums, 0));//works
	System.out.println(printArray(allRowSums(nums)));//works
	System.out.println(isRowMagic(nums));//tested in loop, works
	System.out.println(isColumnMagic(nums));//same as above
	System.out.println(isSquare(nums));//works
    }
    
    public static int max(int[][] data){
	//returns max value in array
	int max = 0;
	for (int i = 0; i < data.length; i++){
	    for (int j = 0; j < data[i].length; j++){
		if (data[i][j] > max){
		    max = data[i][j];
		}
	    }
	}
	return max;
    }

    public static int rowSum(int[][] data, int n){
	//returns sum of elements in row n
	int count = 0;
	for (int j = 0; j < data[n].length; j++){
	    count += data[n][j];
	}
	return count;
    }
    
    public static int columnSum(int[][] data, int n){
	//returns sum of elements in column n
	//watches out for short rows
	int count = 0;
	for (int i = 0; i < data.length; i++){
	    if (data[i].length > n){
		count += data[i][n];
	    }
	}
	return count;
    }

    public static int[] allRowSums(int[][] data){
	int[] out = new int[data.length];
	//calculates the row sum for every row, returns in an array.
	for (int i = 0; i < data.length; i++){
	    out[i] = rowSum(data, i);
	}
	return out;
    }

    public static boolean isRowMagic(int[][] data){
	//checks if each row has the same row sum
	boolean out = true;
	for (int i = 0; i < data.length - 1; i++){
	    if (rowSum(data, i) != rowSum(data, i + 1)){
		out = false;
	    }
	}
	return out;
    }
    
    public static boolean isColumnMagic(int[][] data){
	//checks if each column has the same column sum
	//first finds the longest row
	int big = 0;
	for (int i = 0; i < data.length - 1; i++){
	    if(data[i].length > big){
		big = data[i].length;
	    }
	}
	boolean out = true;
	for (int i = 0; i < big - 1; i++){
	    if (columnSum(data, i) != columnSum(data, i + 1)){
		out = false;
	    }
	}
	return out;
    }

    public static boolean isSquare(int[][] data){
	for (int i = 0; i < data.length; i++){
	    if (data[i].length != data.length){
		return false;
	    }
	}
	return true;
    }

    //auxiliary methods used for testing----------------------
    public static void fillArray2d(int[][] data){
	for (int i = 0; i < data.length; i++){
	    for (int j = 0; j < data[i].length; j++){
		data[i][j] = (int)(Math.random() * 6);
	    }
	}
    }
    
    public static void printArray2d(int[][] data){
	for (int i = 0; i < data.length; i++){
	    for (int j = 0; j < data[i].length; j++){
		System.out.print(data[i][j]+" ");
	    }
	    System.out.println();
	}
    }

    public static String printArray(int[] ary){
	String out = "{";
	for(int x = 0; x < ary.length; x++){
	    out += ary[x]+", ";
	}
	return out.substring(0,out.length() - 2)+"}";
    }	
}
