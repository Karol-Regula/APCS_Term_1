import java.io.*;
import java.util.Scanner;
public class MakePigLatin{
    public static void main(String[]args){
	pigLatin();	
	
    }
    //can make scanner that takes story line by line, then work on it
    public static void pigLatin(){
	try{
	    Scanner in = new Scanner(new File("input.txt"));
	    String out = "";
	    for(int x = 0; in.hasNext(); x++){
		String now = in.next();
		int p = findVowel(now);
		if (hasPunc(now)){
		    char temp = now.charAt(now.length() - 1);
		    now = now.substring(0,now.length() - 1);
		    out = now.substring(p,now.length()) + 
			now.substring(0,p) + "ay" + temp;
		}else{
		    out = now.substring(p,now.length()) + 
			now.substring(0,p) + "ay";
		}
		System.out.println(out);
	    }
	}catch(FileNotFoundException a){
	    System.out.println("Tell the computer to look harder.");
	}
    }
    public static int findVowel(String str){
	for (int x = 0; x < str.length(); x++) {
	    if (str.charAt(x) == 'a' ||
		str.charAt(x) == 'e' ||
		str.charAt(x) == 'i' ||
		str.charAt(x) == 'o' ||
		str.charAt(x) == 'u' ||
		str.charAt(x) == 'y'){
		return x;
		//lowercase the character first
	    }
	}
	return 0;
    }
    public static Boolean hasPunc(String str){
	return str.charAt(str.length() - 1) == '.' ||
	    str.charAt(str.length() - 1) == ',' ||
	    str.charAt(str.length() - 1) == '!' ||
	    str.charAt(str.length() - 1) == '?';
    }
}
