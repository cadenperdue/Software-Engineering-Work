public class ChessBoard{
    ChessPiece[][] board;
    public ChessBoard() {
       ChessPiece[][] board = new ChessPiece[8][8];
    }

    public void put(int i, int j, ChessPiece cp)
    {
        board[i][j] = cp;
    }

    public ChessPiece get(int i, int j)
    {
        return board[i][j];
    }

    public String toString()
    {
        String boardString = new String();
        for(int i = 0; i < board.length; i++)
        {
            for(int j = 0; j < board[i].length; j++)
            {
                if(board[i][j] != null)
                    boardString += board[i][j].toString() + " ";
                else 
                    boardString += "   ";
            }
            boardString += "\n";
        }
        return boardString;
    }
}



