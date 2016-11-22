import java.util.ArrayList;

public class ArrayListMethods{
    
    public static void main(String[]args){
	ArrayList<Integer> nums = new ArrayList<Integer>();
	nums.add(1);
	nums.add(1);
	nums.add(5);
	nums.add(1);
	nums.add(1);
	nums.add(1);
	nums.add(7);
	System.out.println(nums.toString());
	collapseDuplicates(nums);//works
	System.out.println(nums.toString());
	nums.add(2);
	nums.add(3);
	System.out.println(nums.toString());
	randomize(nums);
	System.out.println(nums.toString());
	
    }

    public static void collapseDuplicates(ArrayList<Integer> data){
	//removes all consecutive duplicates(except original number)
	int x = 0;
	while (x < data.size() - 1){
	    if (data.get(x) == data.get(x + 1)){
		data.remove(x);
		x--;
	    }
	    x++;
	}
    }

    public static void randomize(ArrayList<Integer> data){
	//randomizes order of elements
	ArrayList<Integer> out = new ArrayList<Integer>();
	int currentValue;
	int currentPlace;
	for (int x = data.size(); x > 0; x--){
	    currentPlace = (int)(Math.random() * x);
	    currentValue = data.get(currentPlace);
	    data.remove(currentPlace);
	    out.add(currentValue);
	}//apparently you can't set data = out...
	for (int x = 0; x < out.size(); x++){
	    data.add(out.get(x));
	}
    } 
}
