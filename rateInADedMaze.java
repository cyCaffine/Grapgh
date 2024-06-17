public class rateInADedMaze {
    public static void main(String[] args) {
        
    
    int col = 6;
    int row = 4;
    int [][] maze = {
        {1,0,1,1,1,1},
        {1,1,1,1,0,1},
        {0,1,1,1,1,1},
        {0,0,1,0,1,1} };
     printmaze(0, 0, row-1,col-1, " ",maze);
}

private static void printmaze(int sr, int sc, int er, int ec, String s, int maze[][]) {

    if(sr > er || sc > ec) return ;
    if(sr == er && sc == ec){
        System.out.println(s);
        return;
    }
    if(maze[sr][sc] == 0)return;
    // go down
    printmaze(sr+1, sc, er, ec, s+"D",maze);
    // go right
    printmaze(sr, sc+1, er, ec, s+"R",maze);

}
}

