
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
    HashMap<String,String> pieces = new HashMap<String, String>();  
    System.out.println("test");
    Pieces piece = new Pieces(1,1,"B", pieces);
    
    UI UI = new UI();
    UI.print(pieces);
    piece.moveUp();
    UI.print(pieces);
    
    
    

  
  
    }

}
