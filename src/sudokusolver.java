import java.util.Random;


public class sudokusolver {
    int[][] board = new int[9][9];

    int[] usedNums = new int[9];

    //function that fills the sudoku board with numbers
    public void fillBoard(){
        Random rand = new Random();

        for(int rows = 0; rows < board.length; rows++){
            for(int columns = 0; columns < board[rows].length; columns++){
                int n = rand.nextInt(9) + 1;
                board[rows][columns] = n;
                System.out.print(board[rows][columns]);
                if(columns == 8){
                    System.out.print("\n");
                }

            }
        }
    }

    //function that checks if the int num, is in the row
    boolean checkRow (int row, int num){
        for(int col = 0; col < board[row].length; col++){
            if(board[row][col] == num){
                return false;
            }
        }
        return true;
    }

    //function that checks if the int num, is in the column
    boolean checkColumn (int col, int num){
        for(int row = 0; row < board.length; row++){
            if(board[row][col] == num){
                return false;
            }
        }
        return true;
    }

    //function that checks if the int num, is in the box
    boolean checkBox(int row, int col, int num){
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if(board[row + i][col + j] == num){
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args){
        sudokusolver sudoku = new sudokusolver();
        sudoku.fillBoard();


    }
}
