import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) {




        List<Ship> ships = new ArrayList<>();

     
        Ship statek = new Ship(0, 1, 5, "s");
        Ship drugistatek = new Ship(7, 6, 1, "");
   
        ships.add(statek); ships.add(drugistatek);

        Ocean bałtyk = new Ocean(ships);

        System.out.println(bałtyk.toString());
    



    }
}