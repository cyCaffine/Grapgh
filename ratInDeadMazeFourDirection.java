public class ratInDeadMazeFourDirection {
    public static void main(String[] args) {
        
    
        int col = 6;
        int row = 4;
        boolean isVisited[][] = new boolean[row][col];
        int [][] maze = {
            {1,0,1,1,1,1},
            {1,1,1,1,0,1},
            {0,1,1,1,1,1},
            {0,0,1,0,1,1} };
         printmaze(0, 0, row-1,col-1, " ",maze, isVisited);
    }
    
    private static void printmaze(int sr, int sc, int er, int ec, String s, int maze[][], boolean isVisited[][]) {
    
        if(sc <0 || sr <0)return;
        if(sr > er || sc > ec) return ;
        if(sr == er && sc == ec){
            System.out.println(s);
            return;
        }
        if(maze[sr][sc] == 0)return;

        //  check
        if(isVisited[sr][sc] == true)return;

        isVisited[sr][sc] = true;
        // go down
        printmaze(sr+1, sc, er, ec, s+"D",maze,isVisited);
        // go right
        printmaze(sr, sc+1, er, ec, s+"R",maze,isVisited);

        // go left
        printmaze(sr, sc+1, er, ec, s, maze, isVisited);

        // go up
        printmaze(sr+1, sc, er, ec, s, maze, isVisited);

        isVisited[sr][sc] = false;
    
    }
    }
    

