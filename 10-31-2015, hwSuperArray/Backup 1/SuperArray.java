public class SuperArray{
    private int[] data;
    private int size;
    
    public SuperArray(){
	data = new int[0];
	size = data.length;
    }

    public int size(){
	return size;
    }

    public void add(int n){
	if (data.length == 0 || data[data.length - 1] != 0){
	    grow();
	}
	int x = 0;
	while (data[x] != 0){
	    x++;
	}
	data[x] = n;
    }

    private void grow(){
	int[] newdata = new int[data.length  + 1];
	for (int x = 0; x < data.length; x++){
	    newdata[x] = data[x];
	}
	data = newdata;
	size++;
    }

    public  String toString(){
	if (size == 0){
	    return "";
	}
	String out = "[";
	for (int x = 0; x < size; x++){
	    out += " "+data[x]+",";
	}
	out = out.substring(0,out.length() - 1);
	out += "]";
	return out;
    }

    private String toStringDebug(){
	if (size == 0){
	    return "";
	}
	String out = "[";
	for (int x = 0; x < size; x++){
	    if (data[x] == 0){
		out += " X,";
	    }else{
		out += " "+data[x]+",";
	    }
	}
	out += "]";
	return out.substring(0,out.length() - 2) + "]";
	//fix formatting
    }

    public void clear(){
	size = 0;
    }



    public static void main(String[]args){
	SuperArray s1 = new SuperArray();
	s1.add(12);
	s1.add(2354234);
	s1.add(0);
	System.out.println(s1.size());
	System.out.println(s1.toString());
	System.out.println(s1.toStringDebug());	
	s1.clear();
	System.out.println(s1.size());
	System.out.println(s1.toString());
	System.out.println(s1.toStringDebug());	
    }
}
