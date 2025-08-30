// 36. Valid Sudoku
// Solved
// Medium
// Topics
// premium lock icon
// Companies
// Determine if a 9 x 9 Sudoku board is valid. Only the filled cells need to be validated according to the following rules:

// Each row must contain the digits 1-9 without repetition.
// Each column must contain the digits 1-9 without repetition.
// Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without repetition.
// Note:

// A Sudoku board (partially filled) could be valid but is not necessarily solvable.
// Only the filled cells need to be validated according to the mentioned rules.
 

// Example 1:


// Input: board = 
// [["5","3",".",".","7",".",".",".","."]
// ,["6",".",".","1","9","5",".",".","."]
// ,[".","9","8",".",".",".",".","6","."]
// ,["8",".",".",".","6",".",".",".","3"]
// ,["4",".",".","8",".","3",".",".","1"]
// ,["7",".",".",".","2",".",".",".","6"]
// ,[".","6",".",".",".",".","2","8","."]
// ,[".",".",".","4","1","9",".",".","5"]
// ,[".",".",".",".","8",".",".","7","9"]]
// Output: true
// Example 2:

// Input: board = 
// [["8","3",".",".","7",".",".",".","."]
// ,["6",".",".","1","9","5",".",".","."]
// ,[".","9","8",".",".",".",".","6","."]
// ,["8",".",".",".","6",".",".",".","3"]
// ,["4",".",".","8",".","3",".",".","1"]
// ,["7",".",".",".","2",".",".",".","6"]
// ,[".","6",".",".",".",".","2","8","."]
// ,[".",".",".","4","1","9",".",".","5"]
// ,[".",".",".",".","8",".",".","7","9"]]
// Output: false
// Explanation: Same as Example 1, except with the 5 in the top left corner being modified to 8. Since there are two 8's in the top left 3x3 sub-box, it is invalid.
 

// Constraints:

// board.length == 9
// board[i].length == 9
// board[i][j] is a digit 1-9 or '.'.
import java.util.HashMap;   

class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashMap<Character,Integer> mp = new HashMap<>();
        int i , j ;
        
        // ✅ Row & Column Check
        for(i = 0 ; i < 9; i++){
            for(j = 0 ; j < 9 ; j++){
                if(board[i][j] != '.'){
                    if(mp.containsKey(board[i][j])) return false;
                    mp.put(board[i][j],0);
                }
            }
            mp.clear();
            for(j = 0 ; j < 9 ; j++){
                if(board[j][i] != '.'){
                    if(mp.containsKey(board[j][i])) return false;
                    mp.put(board[j][i],0);
                }
            }
            mp.clear();
        }

        // ✅ 3x3 Subgrid Check
        for(int index_i = 0 ; index_i < 3 ; index_i++){
            for(int index_j = 0 ; index_j < 3 ; index_j++){
                mp.clear();
                int startRow = index_i * 3;
                int startCol = index_j * 3;
                for(int k = 0 ; k < 3; k++){
                    for(int m = 0 ; m < 3 ; m++){
                        char c = board[startRow + k][startCol + m];
                        if(c != '.'){
                            if(mp.containsKey(c)) return false;
                            mp.put(c,0);
                        }
                    }
                }
            }
        }
        return true;
    }
}
