public class ChessPieceFactory extends PieceFactory{
        
    public ChessPiece createPiece(String color, String type)
    {
        ChessPiece piece = null;    
        type = type.toLowerCase();
        if (type.equals("rook")){
            piece = new Rook(color);
            return piece;
        }
        else if(type.equals("knight")){
            piece = new Knight(color);
            return piece;
        }
        else if(type.equals("bishop")){
            piece = new Bishop(color);
            return piece;
        }
        else if(type.equals("king")){
            piece = new King(color);
            return piece;
        }
        else if(type.equals("queen")){
            piece = new Queen(color);
            return piece;
        }
        else if(type.equals("pawn")){
            piece = new Pawn(color);
            return piece;
        }
        else
            return null;
      
        
    }
}
