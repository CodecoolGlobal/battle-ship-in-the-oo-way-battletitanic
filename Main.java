public class Main {
    /*
    static List<Ship> ships = new ArrayList<>();
    static List<List<Integer>> shipsCordinate = new ArrayList<>();
    static List<Integer> fleet= new ArrayList<>();
    */
    public static void main(String[] args) {



        Player player1 = new Player(); 
        player1.hit();
        System.out.println(player1.playerBoard.toString());
        
        //System.out.println(player1.opponentBoard.toString());

        //Player player2 = new Player(); 
        //player2.hit();
        //System.out.println(player2.playerBoard.toString());
        //System.out.println(player2.opponentBoard.toString());

        //Player player2 = new Player(); 
    


        //Player player3 = new Player(); 
        //player1.setboard();s

        //Player player2 = new Player(); 
        //player2.setboard();
    }
    /*
    private static boolean setShips(Ship ship) {
        //System.out.println(checkPutShip(ship.getCoordinate()));
        boolean status = false;
        if (checkPutShip(ship.getCoordinate())){ 
        shipsCordinate.addAll(ship.getCoordinate());
        ships.add(ship);
        status = true;
        }
        return status;
    }

    public static boolean checkPutShip(List<List<Integer>> incomingCordinate) {
        //check if input ship ([][] inf) will conflict with other 
        boolean possibleToAdd = true;
        int firstVal = 0;
        int secondVal = 1;
        if (incomingCordinate.size() == 0){
            possibleToAdd = false;
        }
        for ( List<Integer> lists : shipsCordinate){
            List<Integer> checking = lists;
            for  (List<Integer> incomingLists : incomingCordinate){
                int absOfXcordinate = Math.abs((checking.get(firstVal) - incomingLists.get(firstVal)));
                int absOfYcordinate = Math.abs((checking.get(secondVal) - incomingLists.get(secondVal)));
                if(absOfXcordinate <= 1 && absOfYcordinate <= 1){
                    possibleToAdd = false;
                    break;
                }
            }
        }
        return possibleToAdd;
        }

    public static void setboard(){
        fleet.add(2); fleet.add(3); fleet.add(4); fleet.add(2);

        for(int i : fleet){
            boolean status = false;
            
            while(status != true){
                final Scanner myObj = new Scanner(System.in);
                System.out.println("Type pole");
                final String userLetter1 = myObj.nextLine();

                System.out.println("Type pole");
                final String userLetter2 = myObj.nextLine();

                System.out.println("Type orientation");
                final String userLetter3 = myObj.nextLine();

                int input1 = Integer.valueOf(userLetter1);
                int input2 = Integer.valueOf(userLetter2);
                
                Ship statek = new Ship(input1, input2, i, userLetter3);
                
                if (setShips(statek)){
                    status = true;
                }else{
                    System.out.println("Ship colision");
                }
                Ocean bałtyk = new Ocean(ships);
                System.out.println(bałtyk.toString());
            }
        }
        System.out.println(shipsCordinate);
        Ocean bałtyk = new Ocean(ships);
        System.out.println(bałtyk.toString());
    }*/
}