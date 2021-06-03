public interface ChessPiece {

    int getRow();
    int getColumn();
    boolean getColor();
    boolean canMove(int row, int col);
    boolean canKill(ChessPiece piece);


}
