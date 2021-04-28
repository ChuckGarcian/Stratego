import java.util.HashMap;
public class Pieces
{
    // instance variables - replace the example below with your own
    String pos;
    String num;
    HashMap pieces;
    int row;
    int col;
    /**
     * Constructor for objects of class Pieces
     */
    public Pieces(int row, int col, String num, HashMap pieces)
    {
     this.pieces = pieces;   
     this.row = row;
     this.col = col; 
     this.num = num;
     updatePos();
    }

    /**
     * returns position 
     *
     */
    public String getPiece()
    {
     return this.num;
    }    
    
    public String getPos()
    {
     return this.pos;
    }
    public void moveUp()
    {
     pieces.remove(this.pos);   
     this.row++;
     updatePos();
    } 
   
    private void updatePos()
    {
     pos = String.format("%d,%d", row, col);
     pieces.put(pos, this.num);
     }
    public void movePiece(String newPos, HashMap map)
    {
     map.remove(this.pos);   
     this.pos = newPos;
     map.put(this.pos, this.num);
     
    } 
}
