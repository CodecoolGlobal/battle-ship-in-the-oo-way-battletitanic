public class Main {

    public static void main(String[] args) {

        Player player1 = new Player();
        Player player2 = new Player();

        int isEmpty1 = player1.shipsCordinate.size();
        int isEmpty2 = player2.shipsCordinate.size();
        
        while(isEmpty1!=0 && isEmpty2!=0){
            System.out.println(isEmpty1!=0); System.out.println(player1.shipsCordinate.size());
            System.out.println(isEmpty2!=0); System.out.println(player2.shipsCordinate.size());
            player1.hit(player2);
            System.out.println(player1.playerBoard.toString());
            System.out.println(player1.shipsCordinate);

            player2.hit(player1);
            System.out.println(player2.playerBoard.toString());
            System.out.println(player2.shipsCordinate);
        }

    }

}