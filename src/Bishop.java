public class Bishop extends Piece implements ChessPiece {


    public Bishop(int row, int column, boolean color) {
        super(row, column, color);
    }

    public boolean canMove(int row, int col) {
        int temp = this.row;
        int temp2 = this.column;
        int rowDiff = Math.abs(row - this.row);
        int colDiff = Math.abs(col - this.column);

        if (rowDiff != colDiff) {
            return false;
        }

        if (col > this.column) {
            temp2 = col;
            col = this.column;
        }

        if (row > this.row) {
            temp = row;
            row = this.row;
        }

        int j = col;
        for (int i = row; i <= temp; i++) {
                    if (board.blackAtPosition(i, j) == true || board.whiteAtPosition(i, j) == true) {
                        return false;
                }
                    j++;
        }

        return true;


    }

    public boolean canKill(ChessPiece piece) {
        int temp = this.row;
        int temp2 = this.column;
        int row = piece.getRow();
        int col = piece.getColumn();
        boolean color = piece.getColor();
        int rowDiff = Math.abs(row - this.row);
        int colDiff = Math.abs(col - this.column);


        if (rowDiff != colDiff) {
            return false;
        }

        if (col > this.column) {
            temp2 = col;
            col = this.column;
        }

        if (row > this.row) {
            temp = row;
            row = this.row;
        }

        int j = col;
        for (int i = row; i < temp; i++) {
            if (board.blackAtPosition(i, j) == true || board.whiteAtPosition(i, j) == true) {
                return false;
            }
            j++;
        }

        if (color == true) {
            if (board.blackAtPosition(row, col) == true) {
                return true;
            }
        } else {
            if (board.whiteAtPosition(row, col) == true) {
                return true;
            }
        }
        return false;
    }
}
