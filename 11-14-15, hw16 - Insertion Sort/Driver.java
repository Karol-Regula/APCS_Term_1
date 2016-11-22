public class Driver{ 
    public static void main(String[]args){
	System.out.println("Generates new numbers every time.");
	int[] nums = new int[10];
	Sorts.fillArray(nums);
	System.out.println(Sorts.printArray(nums));
	Sorts.insertionSort(nums);
	System.out.println(Sorts.printArray(nums));	
    }
}
