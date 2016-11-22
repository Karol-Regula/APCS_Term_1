public class Driver{
    public static void main(String[]args){
	if (args.length >= 2){
	    int rows = Integer.parseInt(args[0]);
	    int cols = Integer.parseInt(args[1]);
	     if (rows != cols){//arrays with diffrent x y dimensions work most of the time but sometimes errors occur.
	    	System.out.println("Enter a row, followed by the same number for the cols, entering a third number for the seed in optional");
	    	return;
	    }
	    if (args.length == 3){
		int seed = Integer.parseInt(args[2]);
		WordSearch w6 = new WordSearch(rows, cols, "words.txt", seed);
		
	    }
	    if (args.length == 2){
		WordSearch w6 = new WordSearch(rows, cols, "words.txt");
	    }
	}else{
	    System.out.println("Enter a row, followed by the same number for the cols, entering a third number for the seed in optional");
	    
	}
	// exceptions not handled properly yet
    
	//previous tests
	/*
	System.out.println(rows);
	WordSearch w5 = new WordSearch(10,10);
	w5.loadWords("words.txt");
	w5.fillWithWords();
	System.out.println(w5.toString());
	*/
	
	/*
	//Comprehensive testing for addWord Method
	WordSearch w4 = new WordSearch(10,10);
	w4.loadWords("words.txt");
	w4.printWordList();//should be automatic, same with line above, not needed until addWords is implemented and works
	System.out.println(w4.addWord("abstract",0,0,1,1));//t
	System.out.println(w4.addWord("abstract",9,9,-1,-1));//t
	System.out.println(w4.addWord("abstract",0,8,1,1));//f
	System.out.println(w4.addWord("abstract",8,0,1,1));//f
	System.out.println(w4.addWord("abstract",8,0,-1,1));//t
	System.out.println(w4.addWord("abstract",2,0,0,1));//t
	System.out.println(w4.addWord("abstract",2,0,0,0));//f
	System.out.println(w4.toString());
	*/

	//Older tests
	/*
	  WordSearch w1 = new WordSearch(10,10);
	  System.out.println(w1.toString());
	  w1.addWordHorizontal("enterprise",2,0);
	  w1.addWordHorizontal("help",3,0);
	  w1.addWordHorizontal("said",4,2);
	  w1.addWordHorizontal("Scotty",5,4);
	  w1.addWordHorizontal("evil",7,9);
	  w1.addWordVertically("blue",5,0);
	  w1.addWordVertically("stick",4,8);
	  w1.addWordVertically("blue",0,0);
	  w1.addWordDiagonal("test",6,2);
	  w1.addWordDiagonal("tests",6,3);
	  w1.addWordDiagonal("ask",1,7);
	  System.out.println(w1.toString());
	  //all of the three add methods seem to work.
	  */
	
	/*	
		WordSearch w2 = new WordSearch(7,7);
		w2.loadWords("words.txt");
		w2.printWordList();
		w2.fillWithWords();
		System.out.println(w2.toString());
		w2.printWordList();
	*/


	/*
	WordSearch w3 = new WordSearch(10,10);
	w3.addWordDiagonally("word",5,0);
	w3.addWordDiagonally("word",9,0);
	w3.addWordDiagonally("word",7,4);
	w3.addWordDiagonal("word",0,0);
	System.out.println(w3.toString());
	*/

	
    }
}
