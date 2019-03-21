public class TestChessBoard{
    public static void main(String args[])
    {
        //ChessBoard board = new ChessBoard();
        //Rook blackRook1 = new Rook("black");
        PieceFactory chessPieces = new ChessPieceFactory();
        ChessPiece blackRook1 = chessPieces.createPiece("black","rook");
        //ChessPiece blackRook1 = new ChessPiece();
        //ackRook1 = createPiece("black", "rook");
        //board.put(0, 0, blackRook1);
        //System.out.println(blackRook1.toString()); 
        //System.out.print(board);
        //ard.put(0, 0, blackRook1);
        //System.out.print(board.toString());
    }
    
}
