public abstract class ChessPiece{
     protected String name;
     protected String color;
     protected String colorLetter = color.substring(0,1);
     protected String nameLetter = color.substring(0,1);
     public String toString(){
         return colorLetter + nameLetter;
     }
}
