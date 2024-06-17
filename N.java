public class N {

    // Define the size of the board
    static final int N = 4;

    // Initialize the board with 0s
    static int board[][] = {
        { 0, 0, 0, 0 },
        { 0, 0, 0, 0 },
        { 0, 0, 0, 0 },
        { 0, 0, 0, 0 }
    };

    // Function to print the solution board
    static void printSolution(int board[][]) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(" " + board[i][j] + " ");
            }
            System.out.println(); // Move to the next line after each row
        }
    }

    // Function to check if a queen can be placed on board[row][col]
    static boolean isSafe(int row, int col) {
        int i, j;

        // Check this row on left side
        for (i = 0; i < col; i++)
            if (board[row][i] == 1)
                return false;

        // Check upper diagonal on left side
        for (i = row, j = col; i >= 0 && j >= 0; i--, j--)
            if (board[i][j] == 1)
                return false;

        // Check lower diagonal on left side
        for (i = row, j = col; j >= 0 && i < N; i++, j--)
            if (board[i][j] == 1)
                return false;

        return true;
    }

    // Recursive utility function to solve the N-Queens problem
    static boolean solveRec(int col) {
        // Base case: If all queens are placed, return true
        if (col == N)
            return true;

        // Try placing a queen in all rows one by one
        for (int i = 0; i < N; i++) {
            // Check if the queen can be placed on board[i][col]
            if (isSafe(i, col)) {
                board[i][col] = 1; // Place the queen

                // Recur to place the rest of the queens
                if (solveRec(col + 1))
                    return true;

                // If placing queen in board[i][col] doesn't lead to a solution,
                // then remove the queen (backtrack)
                board[i][col] = 0;
            }
        }

        // If the queen cannot be placed in any row in this column, return false
        return false;
    }

    // Function to solve the N-Queens problem
    static boolean solve() {
        // Start the recursive solution from the first column
        if (!solveRec(0)) {
            System.out.println("Solution does not exist");
            return false;
        }

        // Print the solution
        printSolution(board);
        return true;
    }

    // Main function to execute the program
    public static void main(String args[]) {
        solve();
    }
}
