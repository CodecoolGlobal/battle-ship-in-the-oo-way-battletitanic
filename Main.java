import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) {




        //List<Ship> ships = new ArrayList<>();

        //List<Square> pojedynczyStatek = new ArrayList<>();
        Ship statek = new Ship(4, 4, 4, "s");
        //statek.addSquer();
        


        Ocean bałtyk = new Ocean(statek);
        System.out.println(bałtyk.toString());
    



    }
}