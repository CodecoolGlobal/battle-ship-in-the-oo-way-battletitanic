public class Main {

    public static void main(String[] args) {

        Player player1 = new Player();
        Player player2 = new Player();
        while(true){

            player1.hit(player2.playerBoard, player1.playerBoard);
            System.out.println(player1.playerBoard.toString());

            player2.hit(player1.playerBoard, player1.playerBoard);
            System.out.println(player2.playerBoard.toString());
        }

    }

}