public class Main {

    public static void main(String[] args) {

        View view = new View();

        //view.printStart();
        //view.printRules();

        Player player1 = new CompMed();
        Player player2 = new Player();
        player1.setboard();
        player2.setboard();
        System.out.println(player1.playerBoard.getSquere());

        boolean player1HasShips = player1.shipsCordinate != null && !player1.shipsCordinate.isEmpty();
        boolean player2HasShips = player2.shipsCordinate != null && !player2.shipsCordinate.isEmpty();

        System.out.println(player1.playerBoard.toString());
        System.out.println(player1.shipsCordinate);

        while(player1HasShips && player2HasShips) {
            
            System.out.println("Player1 turn");
            player1.hit(player2);
            System.out.println(player1.playerBoard.toString());
            System.out.println(player1.shipsCordinate);

            System.out.println(player1.playerBoard.getSquere());
            
            System.out.println("Player2 turn");
            player2.hit(player1);
            System.out.println(player2.playerBoard.toString());
            System.out.println(player2.shipsCordinate);

            player1HasShips = player1.shipsCordinate != null && !player1.shipsCordinate.isEmpty();
            player2HasShips = player2.shipsCordinate != null && !player2.shipsCordinate.isEmpty();    
        }
        if (!player1HasShips && !player2HasShips) {
            System.out.println(View.ANSI_GREEN + "DRAW !" + View.ANSI_RESET);
        }
        else if (!player2HasShips) {
            System.out.println(View.ANSI_GREEN + "Won player 2" + View.ANSI_RESET);
        }
        else  {
            System.out.println(View.ANSI_GREEN + "Won player 1" + View.ANSI_RESET);
        }
        
        view.pause(2);
        System.out.println(View.ANSI_RED + "End of the game" + View.ANSI_RESET);
    }
}