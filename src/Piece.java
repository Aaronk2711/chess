public class Piece implements ChessPiece{

    protected int row;
    protected int column;
    protected boolean color; //black is false, white is true
    protected Board board;

    public Piece(int row, int column, boolean color) {
        this.row = row;
        this.column = column;
        this.color = color;
        this.board = Board.getBoard();
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    public boolean getColor() {
        return color;
    }


    public boolean canMove(int row, int col) {
        return false;
    }

    public boolean canKill(ChessPiece piece) {
        return false;
    }

}
