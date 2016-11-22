public class CheckerBoard{
  
  public static void main(String [] args){
    int N = Integer.parseInt(args[0]); //sides of square
    StdDraw.setXscale(0, N);
    StdDraw.setYscale(0, N);
    int c = 0;
    for (int i = 0; i < N; i+=1){ //loop for rows in ascending order
      if (i % 2 == 0) c = 0; //determine if row is to start with red or black
      else c = 1;
      for (int j = 0; j < N; j+=1){ //loop for columns in increasing order
        if (c % 2 == 0) StdDraw.setPenColor(StdDraw.BLUE); //alternate square color
        else StdDraw.setPenColor(StdDraw.PINK);
        StdDraw.filledSquare(i + 0.5, j + 0.5, 0.4); //print square
        c += 1;
      }
    }
  }
}
