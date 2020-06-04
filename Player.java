import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Player {

    public static String test = "test";

    List<Ship> ships = new ArrayList<>();
    List<List<Integer>> shipsCordinate = new ArrayList<>();
    List<Integer> fleetSize = new ArrayList<>();
    Ocean playerBoard;
	

    public Player() {
        setboard();
    }  
    

    private boolean setShips(Ship ship) {
        //System.out.println(checkPutShip(ship.getCoordinate()));
        boolean status = false;
        if (checkPutShip(ship.getCoordinate())){ 
        this.shipsCordinate.addAll(ship.getCoordinate());
        this.ships.add(ship);
        status = true;
        }
        return status;
    }

    public boolean checkPutShip(List<List<Integer>> incomingCordinate) {
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

    public <Squer> void hit(Player enemy) {
        final Scanner myObj = new Scanner(System.in);
        System.out.println("Type pole");
        final String userLetter1 = myObj.nextLine();

        System.out.println("Type pole");
        final String userLetter2 = myObj.nextLine();

        int input1 = Integer.valueOf(userLetter1);
        int input2 = Integer.valueOf(userLetter2);
        
        List<Square> lines = enemy.playerBoard.getSquere().get(input2);
        Square shot = lines.get(input1);
        
        List<Square> linesEnemy = playerBoard.getEnemySquere().get(input2);
        Square shotEnemy = linesEnemy.get(input1);

        //List<List<Square>> linesEnemy = playerBoard.getEnemySquere();
        

        if (shot.toString().equals("X")){
            shotEnemy.mark();
            removeFromList(input1, input2, enemy);
            
        }else{
            shot.empty();
            shotEnemy.empty();
        }


    }

    public void removeFromList(int coordinateX, int coordinateY, Player enemy){
        List<Integer> cordinateToRemove = new ArrayList<>();
        cordinateToRemove.add(coordinateX); cordinateToRemove.add(coordinateY);
        //System.out.println(cordinateToRemove);
        //System.out.println(enemy.shipsCordinate);
        enemy.shipsCordinate.remove(cordinateToRemove);
        //System.out.println(enemy.shipsCordinate);
    }

    public void setboard(){
        fleetSize.add(2); fleetSize.add(3); //fleetSize.add(4); 

        for(int i : fleetSize){
            boolean status = false;
            //Ocean playerBoard = new Ocean(ships);
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

                playerBoard = new Ocean(ships);
                System.out.println(playerBoard.toString());
            }
        }

        
    System.out.println(shipsCordinate);
    Ocean playerBoard = new Ocean(ships);
    //System.out.println(playerBoard.toString());


    }
}