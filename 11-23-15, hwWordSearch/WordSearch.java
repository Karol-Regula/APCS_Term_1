import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
public class WordSearch{
    private char[][]data;
    private ArrayList<String> wordsToAdd;
    private ArrayList<String> wordsAdded;
    private String solution;
    private int seed;
    private Random randgen;
    

    public WordSearch(int rows,int cols, String filename){
	data = new char[rows][cols];
	clear();
	wordsToAdd = new ArrayList<String>();
	wordsAdded = new ArrayList<String>();
	seed = (int)(Math.random() * 10000 );
	System.out.println("Seed: "+seed);
	randgen = new Random(seed);
	loadWords(filename);
	fillWithWords();
	solution = toString();
	System.out.println(solution);//for now it prints the solution
	fillWithRandomLetters(); 
	System.out.println(toString());
	//move method that assigns seed out of addword function?
	//create randgem object here and see it contintues to work
    }

    public WordSearch(int rows,int cols, String filename, int seeduser){
	data = new char[rows][cols];
	clear();
	wordsToAdd = new ArrayList<String>();
	wordsAdded = new ArrayList<String>();
	System.out.println("Seed: "+seeduser);
	randgen = new Random(seeduser);
	loadWords(filename);
	fillWithWords();
	solution = toString();
	System.out.println(solution);//for now it prints the solution
	fillWithRandomLetters(); 
	System.out.println(toString());
	//move method that assigns seed out of addword function?
	//create randgem object here and see it contintues to work
    }

    private void clear(){
	for (int i = 0; i < data.length; i++){
	    for (int j = 0; j < data[i].length; j++){
		data[i][j] = '-';
	    }
	}
    }

    public String toString(){
	String out = "";
	for (int i = 0; i < data.length; i++){
	    for (int j = 0; j < data[i].length; j++){
		out += data[i][j];
		out += " ";
	    }
	    out += "\n";
	}
	return out;
    }

    public void loadWords(String filename){
	File words = new File(filename);
	try{
	    Scanner s1 = new Scanner(words);
	    while (s1.hasNext()){
		wordsToAdd.add(s1.next());
	    }
	}catch (FileNotFoundException a){
	    System.out.println("help");
	}
    }

    public void printWordList(){
	for (int x = 0; x < wordsToAdd.size(); x++){
	    System.out.print(wordsToAdd.get(x) + " ");
	}
	System.out.println();
    }

 public boolean addWord(String word, int row, int col, int dr, int dc){//CHANGE TO PRIVATE LATER
	//check if word fits physically - works
	//starting point
	int x = row;
	int y = col;
	if (x < 0 || x > data.length || y < 0 || y > data[0].length || (dr == 0 && dc == 0)){
	    return false;
	}
	for (int i = 0; i < word.length(); i++){
	    x += dr;
	    y += dc;
	}
	//ending point
	if (x < 0 || x > data.length || y < 0 || y > data[0].length){
	    return false;
	}
	//check if no letters are in the way, not properly tested
	x = row;
	y = col;
	for (int i = 0; i < word.length(); i++){
	    if(!(data[x][y] == '-' || data[x][y] == word.charAt(i))){
		return false;
	    }
	    x += dr;
	    y += dc;
	}
	//add word
	x = row;
	y = col;
	for (int i = 0; i < word.length(); i++){
	    data[x][y] = word.charAt(i);
	    x += dr;
	    y += dc;
	}
	return true;
    }

    public void fillWithWords(){
	String current = "";
	int col = 0;
	int row = 0;
	int dr = 0;
	int dc = 0;
	int i = 0;
	while(i < wordsToAdd.size()){
	    for (int j = 0; j < 1000; j++){
		col = randgen.nextInt(data.length);
		row = randgen.nextInt(data[0].length);
		dr = randgen.nextInt(3) - 1;
		dc = randgen.nextInt(3) - 1;
		if (wordsToAdd.size() == i){
		    break;//I will fix this
		}
        	if (addWord(wordsToAdd.get(i),row,col,dr,dc)){
		    current = wordsToAdd.get(i);
		    wordsToAdd.remove(i);
		    wordsAdded.add(current);
		}
		if (j == 999){
		    i++;
		}
	    }
	}	
    }

    public void fillWithRandomLetters(){
	for (int i = 0; i < data.length; i++){
	    for (int j = 0; j < data[0].length; j++){
		if (data[i][j] == '-'){
		    //random letter assigned
		    data[i][j] = (char)('a'+randgen.nextInt(26));
		}
	    }
	}
    }

    /*
    public boolean addWordHorizontal(String word, int row, int col){
	//check if fits sizewise
	//old and not used
       	if (! (col + word.length() <= data[row].length)){
	    return false;
	}
	//check if any of the spaces are not occupied by useful characters
	for (int x = col; x < word.length() + col; x++){
	    if (data[row][x]!='-' && data[row][x] != word.charAt(x - col)){
		return false;
	    }
	}
	//now it inputs the word
	for (int x = col; x < word.length() + col; x++){
	    data[row][x] = word.charAt(x - col);
	}
	return true;
    }

    public boolean addWordVertically(String word, int row, int col){
	//check if fits sizewise
	//old and not used
       	if (! (row + word.length() <= data.length)){
	    return false;
	}
	//check if any of the spaces are not occupied by useful characters
	for (int x = row; x < word.length() + row; x++){
	    if (data[x][col]!='-' && data[x][col] != word.charAt(x - row)){
		return false;
	    }
	}
	//now it inputs the word
	for (int x = row; x < word.length() + row; x++){
	    data[x][col] = word.charAt(x - row);
	}
	return true;
    }
    
    public boolean addWordDiagonal(String word, int row, int col){
	//check if fits sizewise
	//old and not used
       	if (! (row + word.length() <= data.length) ||
	    ! (col + word.length() <= data[row].length)){
	    return false;
	}
	//check if any of the spaces are not occupied by useful characters
	for (int x = row; x < word.length() + row; x++){
	    if (data[x][col + x - row]!='-' && data[x][col + x - row] != word.charAt(x - row)){
		return false;
	    }
	}
	//now it inputs the word
	for (int x = row; x < word.length() + row; x++){
	    data[x][col + x - row] = word.charAt(x - row);
	}
	return true;
    }
    
    public boolean addWordDiagonally(String word, int row,int col){
	//check if fits sizewise - length fitting testing works
	//old and not used
       	if ((row - word.length() <= 0) ||
	    (col + word.length() >= data[row].length)){
	    return false;
	}
	//check if any of the spaces are not occupied by useful characters
	int y = 0;//increases by one and is used for column counting while the increasing x is used for row countring.
	for (int x = row; x > row - word.length(); x--){
	    if (data[x][col + y]!='-' &&
		data[x][col + y] != word.charAt(y)){
		return false;
	    }
	    y++;
	}
	//now it inputs the word
	y = 0;
	for (int x = row; x > row - word.length(); x--){//<<this line
	    data[x][col + y] = word.charAt(y);
	    y++;
	}
	return true;
    }
    */

    /*
    public void fillWithWordsOld(){
	//only tries horizontal, I do have vertical and diagonal coded though
	//OLD AND NOT USED
	int i = 0;
	int row = 0;
	int col = 0;
	String current = "";
	int seed = (int)(Math.random() * 100 );
	System.out.println("Seed: "+seed);
	Random randgen = new Random(seed);
	while(i < wordsToAdd.size()){
	    for (int j = 0; j < 1000; j++){
		row = (int)(randgen.nextInt(7));
		col = (int)(randgen.nextInt(7));
		if (wordsToAdd.size() == 0){
		    break;
		}
		if (addWordHorizontal(wordsToAdd.get(i),row,col)){
		    current = wordsToAdd.get(i);
		    wordsToAdd.remove(i);
		    wordsAdded.add(current);
		}
		if (addWordVertically(wordsToAdd.get(i),row,col)){
		    current = wordsToAdd.get(i);
		    wordsToAdd.remove(i);
		    wordsAdded.add(current);
		}
		if (addWordDiagonal(wordsToAdd.get(i),row,col)){
		    current = wordsToAdd.get(i);
		    wordsToAdd.remove(i);
		    wordsAdded.add(current);
		}
		if (addWordDiagonally(wordsToAdd.get(i),row,col)){
		    current = wordsToAdd.get(i);
		    wordsToAdd.remove(i);
		    wordsAdded.add(current);
		}
		if (j == 999){
		    i++;
		}
	    }
	}
    }
    */
    
}
