
public class Main {
    
    public static void runGame1(Player player1, Player player2) {
        View view = new View();
        view.printInfo("Player 1\n");
        player1.setboard();
        System.out.println(View.ANSI_GREEN + "\nPlease wait..." + View.ANSI_RESET);
        view.pause(5);
        view.clearScreen();
        view.printInfo("Player 2\n");
        player2.setboard();
        System.out.println(View.ANSI_GREEN + "\nPlease wait..." + View.ANSI_RESET);
        view.pause(5);
        System.out.println(player1.playerBoard.getSquere());
        view.clearScreen();

        boolean player1HasShips = player1.shipsCordinate != null && !player1.shipsCordinate.isEmpty();
        boolean player2HasShips = player2.shipsCordinate != null && !player2.shipsCordinate.isEmpty();

        view.printInfo("Player turn 1\n");
        view.printInfo("        MY BOARD                OPPONENT BOARD");
        System.out.println(player1.playerBoard.toString());
        System.out.println(player1.shipsCordinate);
        view.clearScreen();

        while(player1HasShips && player2HasShips) {
            
            view.printInfo("Player turn 1\n");
            view.printInfo("        MY BOARD                OPPONENT BOARD");
            System.out.println(player1.playerBoard.toString());
            player1.hit(player2);
            view.printInfo("        MY BOARD                OPPONENT BOARD");
            System.out.println(player1.playerBoard.toString());
            System.out.println(View.ANSI_GREEN + "\nPlease wait..." + View.ANSI_RESET);
            view.pause(5);
            view.clearScreen();
            //System.out.println(player1.shipsCordinate);
            //System.out.println(player1.playerBoard.getSquere());
            
            view.printInfo("Player turn 2\n");
            view.printInfo("        MY BOARD                OPPONENT BOARD");
            System.out.println(player2.playerBoard.toString());
            player2.hit(player1);
            view.printInfo("        MY BOARD                OPPONENT BOARD");
            System.out.println(player2.playerBoard.toString());
            System.out.println(View.ANSI_GREEN + "\nPlease wait..." + View.ANSI_RESET);
            view.pause(5);
            view.clearScreen();
            //System.out.println(player2.shipsCordinate);

            player1HasShips = player1.shipsCordinate != null && !player1.shipsCordinate.isEmpty();
            player2HasShips = player2.shipsCordinate != null && !player2.shipsCordinate.isEmpty();    
        }
        if (!player1HasShips && !player2HasShips) {
            System.out.println(View.ANSI_GREEN + "DRAW !\n" + View.ANSI_RESET);
        }else if (!player2HasShips) {
            System.out.println(View.ANSI_GREEN + "WON PLAYER 2\n" + View.ANSI_RESET);
        }else  {
            System.out.println(View.ANSI_GREEN + "WON PLAYER 1\n" + View.ANSI_RESET);
        }
        view.pause(2);
        System.out.println(View.ANSI_RED + "End of the game\n" + View.ANSI_RESET);
    }

    public static void runGame2(Player player1, Player player2) {
        View view = new View();
        player1.setboard();
        view.clearScreen();
        view.printInfo("Player\n");
        player2.setboard();
        System.out.println(View.ANSI_GREEN + "\nPlease wait..." + View.ANSI_RESET);
        view.pause(5);
        System.out.println(player1.playerBoard.getSquere());
        view.clearScreen();

        boolean player1HasShips = player1.shipsCordinate != null && !player1.shipsCordinate.isEmpty();
        boolean player2HasShips = player2.shipsCordinate != null && !player2.shipsCordinate.isEmpty();

        System.out.println(player2.playerBoard.toString());
        System.out.println("ONLY FOR DEMO: " + player1.shipsCordinate);
        System.out.println(View.ANSI_GREEN + "\nPlease wait..." + View.ANSI_RESET);
        view.pause(5);
        view.clearScreen();

        while(player1HasShips && player2HasShips) {
            
            player1.hit(player2);
            view.clearScreen();
            //System.out.println(player1.playerBoard.toString());
            //System.out.println(player1.shipsCordinate);
            //System.out.println(player1.playerBoard.getSquere());
            
            view.printInfo("Player turn 2\n");
            view.printInfo("        MY BOARD                OPPONENT BOARD");
            System.out.println(player2.playerBoard.toString());
            player2.hit(player1);
            view.printInfo("        MY BOARD                OPPONENT BOARD");
            System.out.println(player2.playerBoard.toString());
            System.out.println(View.ANSI_GREEN + "\nPlease wait..." + View.ANSI_RESET);
            view.pause(5);
            //System.out.println(player2.shipsCordinate);

            player1HasShips = player1.shipsCordinate != null && !player1.shipsCordinate.isEmpty();
            player2HasShips = player2.shipsCordinate != null && !player2.shipsCordinate.isEmpty();    
        }
        if (!player1HasShips && !player2HasShips) {
            System.out.println(View.ANSI_GREEN + "DRAW !\n" + View.ANSI_RESET);
        }else if (!player1HasShips) {
            System.out.println(View.ANSI_GREEN + "WIN\n" + View.ANSI_RESET);
        }else  {
            System.out.println(View.ANSI_GREEN + "DEFEAT\n" + View.ANSI_RESET);
        }
        view.pause(2);
        System.out.println(View.ANSI_RED + "End of the game\n" + View.ANSI_RESET);
    }

    
    public static void main(String[] args) {
        boolean isRunning = true;
        View view = new View();

        view.printStart();

        while (isRunning) {
            int option = view.userInput("Main menu:\n  (1) Multiplayer\n  (2) Single player | easy\n  (3) Single player | medium\n  (4) Single player | hard\n  (0) Exit program)");
            view.clearScreen();

            switch (option) {
                case 1:
                    view.printInfo("\nMultiplayer");
                    view.printRules();
                    Player player3 = new Player();
                    Player player4 = new Player();
                    runGame1(player3, player4);
                    break;
                case 2:
                    view.printInfo("\nSingle player | easy");
                    view.printRules();
                    Player player5 = new CompEasy();
                    Player player6 = new Player();
                    runGame2(player5, player6);
                    break;
                case 3:
                    view.printInfo("\nSingle player | medium");
                    view.printRules();
                    Player player7 = new CompMed();
                    Player player8 = new Player();
                    runGame2(player7, player8);
                    break;
                case 4:
                    view.printInfo("\nSingle player | hard");
                    view.printRules();
                    Player player9 = new CompHard();
                    Player player10 = new Player();
                    runGame2(player9, player10);
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