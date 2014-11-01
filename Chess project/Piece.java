import java.util.List;
public abstract class Piece{
    short rank;
    short file;
    boolean color;
    public Piece(short x, short y, boolean c){
        rank = y;
        file = x;
        color = c;
    }
    
    abstract List<Move> legalMoves();
}
