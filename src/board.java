import java.util.Random;

public class board {
    int[][] board = new int[9][9];

    public void fillBoard(){
        int[][] board = new int[9][9];
        int[] usedNums = new int[9];
        Random rand = new Random();

        for(int rows = 0; rows < board.length; rows++){
            for(int columns = 0; columns < board[rows].length; columns++){
                int n = rand.nextInt(9) + 1;
                //boolean checkR = checkRow(rows, n);
                //boolean checkC = checkColumn(columns, n);
                //boolean checkB = checkBox(rows, columns, n);
                //do {
                //    n = rand.nextInt(9) + 1;
                //} while(checkR == false || checkC == false);

                board[rows][columns] = n;
                System.out.print(board[rows][columns]);
                if(columns == 8){
                    System.out.print("\n");
                }



            }
        }
    }

    public void getBoard(){
        int[][] board = new int[9][9];
    }
}
