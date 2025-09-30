public class SudokuSolver {

   
    private static final int GRID_SIZE = 9;

    public static void main(String[] args) {
      
        int[][] puzzle = {
            {5, 3, 0, 0, 7, 0, 0, 0, 0},
            {6, 0, 0, 1, 9, 5, 0, 0, 0},
            {0, 9, 8, 0, 0, 0, 0, 6, 0},
            {8, 0, 0, 0, 6, 0, 0, 0, 3},
            {4, 0, 0, 8, 0, 3, 0, 0, 1},
            {7, 0, 0, 0, 2, 0, 0, 0, 6},
            {0, 6, 0, 0, 0, 0, 2, 8, 0},
            {0, 0, 0, 4, 1, 9, 0, 0, 5},
            {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };

        System.out.println("Unsolved Sudoku Puzzle:");
        printGrid(puzzle);

        if (solveSudoku(puzzle)) {
            System.out.println("\n✅ Solved Sudoku Puzzle:");
            printGrid(puzzle);
        } else {
            System.out.println("\n❌ This Sudoku puzzle is unsolvable.");
        }
    }

   
    public static void printGrid(int[][] grid) {
        for (int r = 0; r < GRID_SIZE; r++) {
            if (r % 3 == 0 && r != 0) {
                System.out.println("---------------------");
            }
            for (int c = 0; c < GRID_SIZE; c++) {
                if (c % 3 == 0 && c != 0) {
                    System.out.print("| ");
                }
                System.out.print(grid[r][c] + " ");
            }
            System.out.println();
        }
    }

    private static boolean isSafe(int[][] grid, int row, int col, int num) {
       
        for (int c = 0; c < GRID_SIZE; c++) {
            if (grid[row][c] == num) {
                return false;
            }
        }

        for (int r = 0; r < GRID_SIZE; r++) {
            if (grid[r][col] == num) {
                return false;
            }
        }

        int boxStartRow = row - row % 3;
        int boxStartCol = col - col % 3;
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                if (grid[r + boxStartRow][c + boxStartCol] == num) {
                    return false;
                }
            }
        }
        return true; 
    }

    public static boolean solveSudoku(int[][] grid) {
        for (int row = 0; row < GRID_SIZE; row++) {
            for (int col = 0; col < GRID_SIZE; col++) {
        
                if (grid[row][col] == 0) {
                    
                    for (int numToTry = 1; numToTry <= GRID_SIZE; numToTry++) {
                        if (isSafe(grid, row, col, numToTry)) {
                           
                            grid[row][col] = numToTry;

                         
                            if (solveSudoku(grid)) {
                                return true; 
                            }
                            
                           
                            grid[row][col] = 0;
                        }
                    }
                    
                    return false;
                }
            }
        }
        return true;
    }
}