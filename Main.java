import java.util.Scanner;

public class Main {
    
    public static void runGame(Player player1, Player player2) {
        View view = new View();
        player1.setboard();
        player2.setboard();
        System.out.println(player1.playerBoard.getSquere());
        view.clearScreen();

        boolean player1HasShips = player1.shipsCordinate != null && !player1.shipsCordinate.isEmpty();
        boolean player2HasShips = player2.shipsCordinate != null && !player2.shipsCordinate.isEmpty();

        System.out.println("Player 1 turn");
        System.out.println(player1.playerBoard.toString());
        System.out.println(player1.shipsCordinate);
        view.clearScreen();

        while(player1HasShips && player2HasShips) {
            
            System.out.println("Player 1 turn");
            player1.hit(player2);
            view.clearScreen();
            System.out.println(player1.playerBoard.toString());
            System.out.println(player1.shipsCordinate);

            System.out.println(player1.playerBoard.getSquere());
            
            System.out.println("Player 2 turn");
            player2.hit(player1);
            System.out.println(player2.playerBoard.toString());
            System.out.println(player2.shipsCordinate);

            player1HasShips = player1.shipsCordinate != null && !player1.shipsCordinate.isEmpty();
            player2HasShips = player2.shipsCordinate != null && !player2.shipsCordinate.isEmpty();    
        }
        if (!player1HasShips && !player2HasShips) {
            System.out.println(View.ANSI_GREEN + "DRAW !" + View.ANSI_RESET);
        }else if (!player2HasShips) {
            System.out.println(View.ANSI_GREEN + "Won player 2" + View.ANSI_RESET);
        }else  {
            System.out.println(View.ANSI_GREEN + "Won player 1" + View.ANSI_RESET);
        }
        view.pause(2);
        System.out.println(View.ANSI_RED + "End of the game" + View.ANSI_RESET);
    }

    
    public static void main(String[] args) {
        boolean isRunning = true;
        View view = new View();

        //view.printStart();

        while (isRunning) {
            int option = view.userInput("Main menu:\n  (1) Multiplayer\n  (2) Single player | easy\n  (3) Single player | medium\n  (4) Single player | hard\n  (0) Exit program)");

            switch (option) {
                case 1:
                    view.printInfo("Multiplayer\n");
                    view.printRules();
                    Player player3 = new Player();
                    Player player4 = new Player();
                    runGame(player3, player4);
                    break;
                case 2:
                    view.printInfo("Single player | easy\n");
                    view.printRules();
                    Player player5 = new CompEasy();
                    Player player6 = new Player();
                    runGame(player5, player6);
                    break;
                case 3:
                    view.printInfo("Single player | medium\n");
                    view.printRules();
                    Player player7 = new CompMed();
                    Player player8 = new Player();
                    runGame(player7, player8);
                    break;
                case 4:
                    view.printInfo("Single player | hard\n");
                    view.printRules();
                    Player player9 = new CompHard();
                    Player player10 = new Player();
                    runGame(player9, player10);
                    break;
                case 0:
                    isRunning = false;
                    break;
                default:
                    System.out.println(View.ANSI_RED + "Please enter correct number." + View.ANSI_RESET);
                
            }
        }
    }        
}