public class PrintMaze {
    public static void main(String[] args) {
        int col = 3;
        int row = 3;
        printmaze(1, 1, row,col, " ");
    }

    private static void printmaze(int sr, int sc, int er, int ec, String s) {

        if(sr > er || sc > ec) return ;
        if(sr == er && sc == ec){
            System.out.println(s);
            return;
        }
        // go down
        printmaze(sr+1, sc, er, ec, s+"D");
        // go right
        printmaze(sr, sc+1, er, ec, s+"R");

    }
      
    
}
