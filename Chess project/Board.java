import java.util.List;
public class Board{
    Piece[][] board;
    List<Piece> whitePieces;
    List<Piece> blackPieces;
    public Board(){
        board = new Piece[8][8];
        
    }
    
    List<Move> legalMoves(Piece p){
        return p.legalMoves();
    }
}