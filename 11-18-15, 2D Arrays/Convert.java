public class Convert{
    public static void main(String[]args){
	int[] nums = new int[18];
	fillArray(nums);
	printArray(nums);
	int[][] nums2d = convert(nums,3,6);
	printArray2d(nums2d);
    }
    
    public static int[][] convert(int[] data, int rows, int cols){
	//length of data == rows * cols
	int x = 0;
	int[][] out = new int[rows][cols];
	for (int i = 0; i < rows; i++){
	    for (int j = 0; j < cols; j++){
		out[i][j] = data[x];
		x++;
	    }
	}
	return out;
    }

    public static void fillArray(int[] data){
	for (int x = 0; x < data.length; x++){
	    data[x] = (int)(Math.random() * 10);
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
	    
    public static void printArray(int[] data){
	System.out.print("[");
	for (int x = 0; x < data.length; x++){
	    if (x + 1 == data.length){
		System.out.print(data[x]);
	    }else{
		System.out.print(data[x]+", ");
	    }
	}
	System.out.println("]");
    }
}
