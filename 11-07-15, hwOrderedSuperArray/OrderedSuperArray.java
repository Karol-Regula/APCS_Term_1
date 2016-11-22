public class OrderedSuperArray extends SuperArray{
    public OrderedSuperArray(){
	super();
    }
    public OrderedSuperArray(int capacity){
	super(capacity);
    }
    public OrderedSuperArray(int[] ary){
	int[] data = new int[ary.length];
	for (int x = 0; x < data.length; x++){
	    add(ary[x]);
	}
    }
    public void add(int element){
	if (size == data.length){
	    grow();//probably don't need this
	}
	super.add(whereTo(element), element);
	//places element in correct place
    }

    private int whereTo(int element){
	if (size == 0){
	    return 0;
	}
	if (size == 1 || get(0) >= element){
	    if (get(0) >= element){
		return 0;
	    }else{
		return 1;
	    }
	}
	if (data[size - 1] <= element){
	    return size;
	}
	for(int x = 0; x < data.length - 1; x++){
	    if (data[x] <= element && data[x+1] >= element){
		return x + 1;
	    }
	}
	System.out.println("help me");
	return 1000000000;
    }

    public int set(int index, int element){
	int out = data[index];
	remove(index);//removes element and sets the 
	add(element);
	return out;
	
    }

    private void grow(){
	if (size == 0){
	    //takes care of size = 0 case, (0 * 2 = 0)
	    int[] newdata = new int[1];
	    data = newdata;
	}
	int[] newdata = new int[data.length  * 2];
	for (int x = 0; x < size; x++){
	    newdata[x] = data[x];
	}
	data = newdata;
    }
    
    public void add(int index, int element){
	throw new UnsupportedOperationException("Cannot use this method in OrderedSuperArray class.");
    }  

    public int indexOf(int element){
	// as of now:
	// works for most values
	//     - has problems with last value
	//     - doesn't always find first ocurrence of number
	int min = 0;
	int max = size() - 1;
	int middle = 0;
	while(min <= max && count < 100){
	    System.out.println(min+"  "+middle+"  "+max);
	    middle = ((max + min)/2);
	    // == should be a special case in order to return.
	    if (get(middle) == element){
		//max = middle;
		return middle;
	    }
	    if (middle < element){
		min = middle + 1;
	    }else{
		max = middle - 1;
	    }
	}
	return -1;
    }
    
    public static void main(String[]args){
	OrderedSuperArray o1 = new OrderedSuperArray();
	o1.add(5);
	o1.add(6);
	o1.add(5);
	o1.add(2);
	o1.add(11);
	o1.add(5);
	o1.add(-8);
	o1.add(500);
	o1.add(500);
	o1.add(-8);
	System.out.println(o1.toStringDebug());
	o1.set(0,1000);
	o1.add(2000);
	System.out.println(o1.toStringDebug());
	//o1.add(1,1);
	System.out.println(o1.indexOf(11) + " 6");
	System.out.println(o1.indexOf(1000) + " 9");
	System.out.println(o1.indexOf(-8) + " 0");
	System.out.println(o1.indexOf(7) + " -1");
	System.out.println(o1.indexOf(500) + " 7/8");
	System.out.println(o1.indexOf(2) + " 1");
	System.out.println(o1.indexOf(5) + " 2");
	/*
	int[] nums = new int[3];
	nums[0] = 5;
	nums[1] = 2;
	nums[2] = 7;
	OrderedSuperArray o2 = new OrderedSuperArray(nums);
	System.out.println(o2.toStringDebug());
	*/
	
    }
}
