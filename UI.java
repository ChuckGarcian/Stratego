import java.util.HashMap;
public class UI
{
    
    
    public void print(HashMap pieces)
    {
     for (int row = 5; row !=0;)
    {
        String Piece = "";
        for(int col = 0; col !=11;)
        {
         if(pieces.containsKey(row+"," + col))
         {  
          Piece += pieces.get(row+"," + col);
         }
         else
         {
          Piece += " ";
         }
            col++;  
        }
        System.out.println(Piece);
        Piece = "";
        row --;   
       
    }   
    }
  
}
