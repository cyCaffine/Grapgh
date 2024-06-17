public class fourDirectionPrintMaze {
    public static void main(String[] args) {
        int col = 3;
        int row = 3;
        boolean[][] isVisited = new boolean[row][col];
        printmaze(0, 0, row-1,col-1, " ", isVisited);
    }

    private static void printmaze(int sr, int sc, int er, int ec, String s,boolean[][]isVisited) {    if(sr<0 || sc<0)return;
        if(sr>er || sc>ec) return ;
        if(isVisited[sr][sc] == true)return;
        if(sr == er && sc == ec){
            System.out.println(s);
            return;
        }


         isVisited[sr][sc] = true;
        // go down
        printmaze(sr+1, sc, er, ec, s+"D", isVisited);
        // go right
        printmaze(sr, sc+1, er, ec, s+"R",isVisited);

        // goleft
        printmaze(sr, sc-1, er, ec, s+"L", isVisited);

        // go up
        printmaze(sr-1, sc, er, ec, s+"R", isVisited);

        // BACKTRACKING
        isVisited[sr][sc]= false;

    }
      
    
}
