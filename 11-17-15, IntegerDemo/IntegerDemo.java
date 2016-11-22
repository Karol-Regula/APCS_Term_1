import java.util.ArrayList;
import java.util.Random;
public class IntegerDemo{
    public static void main(String[]m){
	//seed for random stablizes results
	Random rand = new Random();
	ArrayList<Integer> nums = new ArrayList<Integer>();
	//intger class for extracting int from terminal
	int n = Integer.parseInt(m[0]);
	for (int x = 0; x < n; x++){
	    nums.add(rand.nextInt(6));//random int from 0-5
	}
	System.out.println(printArray(nums.toArray()));
    }

    public static String printArray(Object[] ary){
	String out = "{";
	for(int x = 0; x < ary.length; x++){
	    out += ary[x]+", ";
	}
	return out.substring(0,out.length() - 1)+"}";
    }	
}
