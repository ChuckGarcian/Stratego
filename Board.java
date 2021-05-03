import java.util.HashMap;
public class Board
{
    /**
     * Constructor for objects of class Board
     */
    HashMap<String,Piece> map; 
    public Board()
    {
        map = new HashMap<String, Piece>(); 
    }
    
    public void addPiece(int row, int col, String type)
    {
        map.put(String.format("%d,%d", row, col),new Piece(row, col, type));
    }
    
    public void moveUp(String pos)
    {
     int row = Integer.parseInt(pos.substring(0,1));
     int col = Integer.parseInt(pos.substring(2,3));
     Piece currentPiece = map.get(pos);
     System.out.println(String.format("%d,%d",row,col));
     map.put(String.format("%d,%d",(row+1),col), currentPiece); 
     System.out.println("post movement" + String.format("%d,%d",row,col));
     map.remove(pos);
    }
    
    public Piece getPiece(String pos)
    {
        //System.out.println("bitch" + map.get(pos).getType());
     
        return map.get(pos);
       
    }
    
    public HashMap returnMap()
    {
        return map;
    }
}