import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Player {

    List<Ship> ships = new ArrayList<>();
    List<List<Integer>> shipsCordinate = new ArrayList<>();
    List<Integer> fleetSize = new ArrayList<>();
    Ocean playerBoard;
    View view = new View();

    public Player() {

    }  

    public boolean setShips(Ship ship) {
        boolean status = false;
        if (checkPutShip(ship.getCoordinate())){ 
        this.shipsCordinate.addAll(ship.getCoordinate());
        this.ships.add(ship);
        status = true;
        }
        return status;
    }

    public boolean checkPutShip(List<List<Integer>> incomingCordinate) {
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
        System.out.println(View.ANSI_RED + "- Type horizontal coordinates -\n|A B C D E F G H I J|" + View.ANSI_RESET);
        final String userLetter1 = myObj.nextLine();  

        System.out.println(View.ANSI_RED + "- Type vertical coordinates -|0 1 2 3 4 5 6 7 8 9|" + View.ANSI_RESET);
        final String userLetter2 = myObj.nextLine();

        int input1 = Integer.valueOf(userLetter1);
        int input2 = Integer.valueOf(userLetter2);
        
        List<Square> lines = enemy.playerBoard.getSquere().get(input2);
        Square shot = lines.get(input1);
        
        List<Square> linesEnemy = playerBoard.getEnemySquere().get(input2);
        Square shotEnemy = linesEnemy.get(input1);

        //List<List<Square>> linesEnemy = playerBoard.getEnemySquere();
        
        if(shotEnemy.toString().equals("X")){
            System.out.println("dupa");
            hit(enemy);
            System.out.println("dupa");
        }
        else if(shot.toString().equals("X")){
            shotEnemy.mark();
            removeFromList(input1, input2, enemy);
        }else if(shot.toString().equals("O")) {
            System.out.println(View.ANSI_RED + "- Already hit. Try again! -" + View.ANSI_RESET);
            hit(enemy);
        }else{
            shot.empty();
            shotEnemy.empty();
        }
    }

    public void removeFromList(int coordinateX, int coordinateY, Player enemy){
        List<Integer> cordinateToRemove = new ArrayList<>();
        cordinateToRemove.add(coordinateX); cordinateToRemove.add(coordinateY);
        enemy.shipsCordinate.remove(cordinateToRemove);
    }

    public static int inputLetter(String userLetter1) {

        if (userLetter1.equals("A")) {
            int input0 = 0;
            return input0;
        }else if (userLetter1.equals("B")) {
            int input1 = 1;
            return input1;
        }else if (userLetter1.equals("C")) {
            int input2 = 2;
            return input2;
        }else if (userLetter1.equals("C")) {
            int input3 = 3;
            return input3;
        }else if (userLetter1.equals("D")) {
            int input4 = 4;
            return input4;
        }else if (userLetter1.equals("E")) {
            int input5 = 5;
            return input5;
        }else if (userLetter1.equals("F")) {
            int input6 = 6;
            return input6;
        }else if (userLetter1.equals("G")) {
            int input7 = 7;
            return input7;
        }else if (userLetter1.equals("H")) {
            int input8 = 8;
            return input8;
        }else if (userLetter1.equals("I")) {
            int input9 = 9; 
            return input9; 
        }else{
            return -1;
        }
    }

    public void setboard(){
        fleetSize.add(2); //fleetSize.add(3); //fleetSize.add(4); //fleetSize.add(5);

        for(int i : fleetSize){
            boolean status = false;
            while(status != true){
                final Scanner myObj = new Scanner(System.in);
                System.out.println(View.ANSI_RED + "- Type horizontal coordinates -\n|A B C D E F G H I J|" + View.ANSI_RESET);
                final String userLetter1 = myObj.nextLine().toUpperCase();

                System.out.println(View.ANSI_RED + "- Type vertical coordinates -\n|0 1 2 3 4 5 6 7 8 9|" + View.ANSI_RESET);
                final String userLetter2 = myObj.nextLine();

                System.out.println(View.ANSI_RED + "- Type orientation -\n|Horizontal: not empty user input|\n|Vertical: empty user input|" + View.ANSI_RESET);
                final String userLetter3 = myObj.nextLine();

                
                //inputLetter(userLetter1);
                int input1 = inputLetter(userLetter1);
                int input2 = Integer.valueOf(userLetter2);
                
                Ship statek = new Ship(input1, input2, i, userLetter3);
                
                if (setShips(statek)){
                    status = true;
                }else{
                    System.out.println(View.ANSI_RED + "- Ship colision. Try again! -" + View.ANSI_RESET);
                }

                playerBoard = new Ocean(ships);
                System.out.println(View.ANSI_BLUE + playerBoard.toString() + View.ANSI_RESET);
            }
        }

    System.out.println(shipsCordinate);
    Ocean playerBoard = new Ocean(ships);
    //System.out.println(playerBoard.toString());

    }
}