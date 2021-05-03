public class Piece
{
    // instance variables - replace the example below with your own
    String type;
    int row;
    int col;
    /**
     * Constructor for objects of class Pieces
     */
    public Piece(int row, int col, String type)
    {  
     this.row = row;
     this.col = col;
     
     this.type = type;
     
     
    }

    /**
     * returns position 
     */
    public String getPos()
    {
        return String.format("%d,%d", row, col);
    }
    
    public void updateRow(int row)
    {
        this.row = row;
    }
    
    public void updateCol(int col)
    {
        this.col = row;
    }
    public String getType()
    {
        return type;
    }
}
