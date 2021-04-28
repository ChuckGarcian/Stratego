
/**
 * Stratego!
 *
 * @author Chuck Garcia 
 * @version Version-1 Apr-26-21
 */

import java.util.HashMap;

public class Stratego
{
    public Stratego()
    { 
    Pieces piece = new Pieces("1,1","B");
    Pieces piece2 = new Pieces("1,2","B");  
    Pieces piece3 = new Pieces("1,3","B");  
    Pieces piece4 = new Pieces("1,4","B");  
    Pieces piece5 = new Pieces("1,5","B");  
    Pieces piece6 = new Pieces("1,6","B");  
    Pieces piece7 = new Pieces("1,7","10");  
    Pieces piece8 = new Pieces("1,8","9");  
    Pieces piece9 = new Pieces("1,9","8");  
    Pieces piece10 = new Pieces("1,10","8");  
    Pieces piece11 = new Pieces("2,1","7");  
    Pieces piece12 = new Pieces("2,2","7");  
    Pieces piece13 = new Pieces("2,3","7");  
    Pieces piece14 = new Pieces("2,4","6");  
    Pieces piece15 = new Pieces("2,5","6");  
    Pieces piece16 = new Pieces("2,6","6");  
    Pieces piece17 = new Pieces("2,7","6");  
    Pieces piece20 = new Pieces("2,8","6");  
    
    HashMap<String,String> pieces = new HashMap<String, String>();
    // populates Piece dictionary
    
    pieces.put(piece.getPos(), piece.getPiece());
    pieces.put(piece2.getPos(), piece2.getPiece());
    pieces.put(piece3.getPos(), piece3.getPiece());
    pieces.put(piece4.getPos(), piece4.getPiece());
    pieces.put(piece5.getPos(), piece5.getPiece());
    pieces.put(piece6.getPos(), piece6.getPiece());
    pieces.put(piece7.getPos(), piece7.getPiece());
    pieces.put(piece8.getPos(), piece8.getPiece());
    pieces.put(piece9.getPos(), piece9.getPiece());
    pieces.put(piece10.getPos(), piece10.getPiece());
    pieces.put(piece11.getPos(), piece11.getPiece());
    pieces.put(piece12.getPos(), piece12.getPiece());
    pieces.put(piece13.getPos(), piece13.getPiece());
    pieces.put(piece14.getPos(), piece14.getPiece());
    pieces.put(piece15.getPos(), piece15.getPiece());
    pieces.put(piece16.getPos(), piece16.getPiece());
    pieces.put(piece17.getPos(), piece17.getPiece());
    pieces.put(piece20.getPos(), piece20.getPiece());
   

    for (int row = 0; row !=5;)
    {
        String x = " ";
        for(int col = 0; col !=11;)
        {
         if(pieces.containsKey(row+"," + col))
            {
                
             x += pieces.get(row+"," + col);
            
             
            }
            col++;
        }
        System.out.println(x);
        x = "";
        
        
        row ++;
    
    }
    

    
    
    
  
    }

}
