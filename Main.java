public class Main {

    public static void main(String[] args) {

        View view = new View();

        view.printTitle("Welcome in the BattleShips");
        view.pause(2);
        view.printInfo("         powered by");
        view.pause(1);
        view.printInfo("   🛳 Titanic Corporation 🛳");
        view.pause(2);;
        view.keyPressed("  press any key to continue");
        view.clearScreen();

        Player player1 = new Player();
        Player player2 = new Player();

        boolean player1HasShips = player1.shipsCordinate != null && !player1.shipsCordinate.isEmpty();
        boolean player2HasShips = player2.shipsCordinate != null && !player2.shipsCordinate.isEmpty();

        while(player1.shipsCordinate != null && !player1.shipsCordinate.isEmpty() && player2.shipsCordinate != null && !player2.shipsCordinate.isEmpty()) {
            
            player1.hit(player2);
            System.out.println(player1.playerBoard.toString());
            System.out.println(player1.shipsCordinate);

            player2.hit(player1);
            System.out.println(player2.playerBoard.toString());
            System.out.println(player2.shipsCordinate);
                
        }
        if (!player1HasShips && !player2HasShips) {
            System.out.println("DRAW !");
        }
        else if (!player2HasShips) {
            System.out.println("Won player 2");
        }
        else  {
            System.out.println("Won player 1");
        }
        
        System.out.println("End of the game");
    }

}