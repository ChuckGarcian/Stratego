public class Pieces
{
    // instance variables - replace the example below with your own
    String pos;
    String num;
    /**
     * Constructor for objects of class Pieces
     */
    public Pieces(String pos, String num)
    {
     this.pos = pos;
     this.num = num;
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
}
