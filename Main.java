import java.util.ArrayList;
import java.util.List;


public class Main {

    static List<Ship> ships = new ArrayList<>();
    static List<List<Integer>> shipsCordinate = new ArrayList<>();

    public static void main(String[] args) {

        Ship statek = new Ship(4, 6, 2, "");
        Ship drugistatek = new Ship(9, 9, 3, "");
        Ship trzecistatek = new Ship(1, 8, 2, "s");

        setShips(statek);
        setShips(drugistatek);
        setShips(trzecistatek);


        System.out.println(shipsCordinate);

        Ocean bałtyk = new Ocean(ships);

        System.out.println(bałtyk.toString());

    }

    private static void setShips(Ship ship) {
        //System.out.println(checkPutShip(ship.getCoordinate()));
        
        if (checkPutShip(ship.getCoordinate())){ 
        shipsCordinate.addAll(ship.getCoordinate());
        ships.add(ship);
        }
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

}