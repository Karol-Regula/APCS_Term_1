public class SuperArray{
    public int[] data;
    public int size;
    
    public SuperArray(){
	this(1);
    }
    public SuperArray(int initialCapacity){
	if (initialCapacity < 0){
	    throw new IllegalArgumentException("Parameter initialCapacity cannot be negative.");
	}
	data = new int[initialCapacity];
	size = 0;
    }
    public SuperArray(int[] ary){
	data = new int[ary.length];
	for (int x = 0; x < data.length; x++){
	    data[x] = ary[x];
	}
	size = data.length;
    }

    public int size(){
	return size;
    }

    public void add(int element){
	if (size == data.length){
	    grow();
	}
	data[size] = element;
	size++;
    }

    public int get(int index){
	if (index < 0 || index >= size){
	    throw new IndexOutOfBoundsException("Parameter index must be within the bounds of the size.");
	}
	return data[index];
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

    public  String toString(){
	if (size == 0){
	    return "[]";
	}
	String out = "[";
	for (int x = 0; x < size; x++){
	    out += " "+data[x]+",";
	}
	out = out.substring(0,out.length() - 1);
	out += "]";
	return out;
    }

    public String toStringDebug(){
	if (size == 0){
	    return "[]";
	}
	String out = "[";
	for (int x = 0; x < data.length; x++){
	    if (x >= size){
		out += " X,";
	    }else{
		out += " "+data[x]+",";
	    }
	}
	out += "]";
	return out.substring(0,out.length() - 2) + "]";
    }

    public void clear(){
	size = 0;
    }

    public boolean isEmpty(){
	return size == 0;
    }

    public int set(int index, int element){
	//I assume this returns the element being replaced
	if (index < 0 || index >= size){
	    throw new IndexOutOfBoundsException("Parameter index must be within the bounds of the size.");
	} 
	int out = data[index];
	data[index] = element;
	return out;
    }

    public void add(int index, int element){
	//adds element at specified index
	if (index < 0 || index > size){
	    throw new IndexOutOfBoundsException("Parameter index must be within the bounds of the size."); 
	}
	if (size == data.length){
	    grow();
	}
	int[] newdata = new int[data.length];
	for (int x = 0; x < index; x++){
	    newdata[x] = data[x];
	}
	for (int x = index; x < size; x++){
	    newdata[x + 1] = data[x];
	}
	newdata[index] = element;
	data = newdata;
	size++;
    }

    public int remove(int index){
	//removes element at specified index
	if (index < 0 || index >= size){
	    throw new IndexOutOfBoundsException("Parameter index must be within the bounds of the size."); 
	}
	int out = get(index);
	int[] newdata = new int[data.length];
	for (int x = 0; x < index; x++){
	    newdata[x] = data[x];
	}
	if (size == data.length){
	    //fixes problem with removing last element in SuperArray
	    grow();
	}
	for (int x = index; x < size; x++){
	    newdata[x] = data[x + 1];
	}
	data = newdata;
	size--;
	return out;
    }

    public int[] toArray(){
	int[] out = new int[size];
	for (int x = 0; x < size; x++){
	    out[x] = data[x];
	}
	return out;
    }

    public static void main(String[]args){
	/*
	// Array accepting constructor test
	int[] numms = new int[1];
	numms[0] = 13579;
	SuperArray snums = new SuperArray(numms);
	System.out.println(snums.toStringDebug());
	*/
	/*
	  OLD TESTS, PLEASE IGNORE
	SuperArray s1 = new SuperArray();
	s1.add(12);
	s1.add(2354234);
	s1.add(0);
	s1.add(-3);
	s1.add(1000);
	s1.add(1);
	s1.add(1);
	s1.add(1);
	s1.add(31);
	s1.set(2,99);
	//System.out.println(s1.get(2));
	//System.out.println(s1.size());
	//System.out.println(s1.toString());
	System.out.println(s1.toStringDebug());
	s1.add(1,1000001);
	s1.add(5,4444);
	//System.out.println(s1.isEmpty());
	//System.out.println(s1.data.length);
	//s1.clear();
	System.out.println(s1.size());
	//System.out.println(s1.toString());
	System.out.println(s1.toStringDebug());
	s1.remove(0);
	System.out.println(s1.toStringDebug());
	//System.out.println(s1.toArray());
	//System.out.println(s1.isEmpty());
	*/

	//Test code for exception throwing statements
	//add catch blocks and maybe make it return results for each test
	//Test all methods ========================================
	SuperArray test = new SuperArray(10);
	if (test.size() != 0){
	    System.out.println("size() test failed");
	}
	    
	//have to test toArray early, useful for other tests
	SuperArray test2 = new SuperArray(0);
	int[] test3 = new int[0];
	if (test2.toArray().length != 0){
	    System.out.println("toArray() test failed");
	}
	test2.add(11);
	if (test2.toArray().length != 1){
	    System.out.println("toArray() test failed, also see add() test");
	}
	if (test2.toArray()[0] != 11){
	    System.out.println("toArray() test failed, also see add() test");
	}
	if (test2.toArray()[0] != 11){
	    System.out.println("add(int n) test failed, might also be a grow() function problem");
	}
	if (test2.get(0) != 11){
	    System.out.println("get(int index) test failed");
	}
	test2.clear();
	if (test2.size() != 0){
	    System.out.println("clear() test failed");
	}
	if (test.isEmpty() != true){
	    System.out.println("isEmpty() test failed");
	}
	test2.add(2);
	if (test2.size() != 1){
	    System.out.println("size() test failed");
	}
	test2.set(0,1000);
	if (test2.toArray()[0] != 1000){
	    System.out.println("set(int index, int element) test failed");
	}
	test2.add(0,999);
	if (test2.toArray()[0] != 999 || test2.toArray()[1] != 1000){
	    System.out.println("add(int index, int element) test failed");
	}
	test2.remove(1);
	//System.out.println(test2.toStringDebug());


	if (test2.toArray()[0] != 999){
	    System.out.println("remove(int index) test failed");
	}
	// Exception tests. ----------------------------------
	try{
	    SuperArray s2 = new SuperArray(-5);
	}catch(IllegalArgumentException e){
	    System.out.println("constructor SuperArray(int initialCapacity) exception test passed.");
	}
	try{
	    test2.get(9999);
	}catch(IndexOutOfBoundsException e){
	    System.out.println("get(int index) exception test passed.");
	}
	try{
	    test2.set(5,2);
	}catch(IndexOutOfBoundsException e){
	    System.out.println("set(int index, int element) exception test passed.");
	}
	try{
	    test2.add(101010101,5);
	}catch(IndexOutOfBoundsException e){
	    System.out.println("add(int index, int element) exception test passed.");
	}
	try{
	    test2.remove(12938);
	}catch(IndexOutOfBoundsException e){
	    System.out.println("remove(int index) exception test passed.");
	}
    }
}
