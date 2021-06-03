public class King extends Piece implements ChessPiece{


    public King(int row, int column, boolean color) {
        super(row, column, color);
    }

    public boolean canMove(int row, int col) {
        int rowDiff = Math.abs(row-this.row);
        int colDiff = Math.abs(col-this.column);

        if (rowDiff <= 1 && colDiff <= 1) {
            if (board.blackAtPosition(row, col) == false && board.whiteAtPosition(row, col) == false) {
                return true;
            }
            return false;
        }
        return false;
    }

    public boolean canKill(ChessPiece piece) { ;
        boolean color = piece.getColor();
        int row = piece.getRow();
        int col = piece.getColumn();
        int rowDiff = Math.abs(row - this.row);
        int colDiff = Math.abs(col - this.column);

        if (rowDiff <= 1 && colDiff <= 1) {
            if (color == true) {
                if (board.blackAtPosition(row, col) == true) {
                    return true;
                }
            } else {
                if (board.whiteAtPosition(row, col) == true) {
                    return true;
                }
            }
        }
        return false;
    }

}
