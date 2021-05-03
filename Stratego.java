    /**
     * Stratego!
     *
     * @author Chuck Garcia 
     * @version Version-1 Apr-26-21
     */
    import java.util.*;
    import java.util.HashMap;
    
public class Stratego
    {
     public Stratego()
        { 
         Scanner sc = new Scanner(System.in);
         Board board = new Board();
         Boolean game = false; 
  
         
         board.addPiece(1,2,"B");
      while(game.equals(false))
         {
          System.out.println("Please sellect a piece to move");
          String pos = sc.nextLine();
          System.out.println("pos is "+pos);
          if(board.getPiece(pos)!= null)
            { 
                    System.out.println("Pick a direction to move in"+
                                        "\n 1 : Up "+
                                        "\n 2 : Downward"+
                                        "\n 3 : Left"+ 
                                        "\n 4 : Right");
                    String move = sc.nextLine();                    
                    switch (move)
                     {
                         case "1":
                            //board.getPiece(pos) +"\n");
                              board.moveUp(pos);
                            break;
                         case "2":
                            System.out.println("case 2");
                            game = true;
                            break;
                     }   
              }else
              {
                System.out.println(board.returnMap().keySet());
                System.out.println("pos is "+pos);
                System.out.println("Piece at " + pos + " does not exist \n");
               }
          pos = "";
         }

  }
}
/*
    Piece piece = new Piece(1,1,"B", pieces);
    UI UI = new UI();
    UI.print(pieces);
    piece.moveUp();
    UI.print(pieces);
    */
   