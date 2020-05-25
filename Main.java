import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) {




        //List<Ship> ships = new ArrayList<>();

        List<Square> pojedynczyStatek = new ArrayList<>();
        Ship statek = new Ship(pojedynczyStatek, 9, 9);
        statek.addSquer();
        
        //System.out.println(statek.toString());

        

        //ships.add(statek);

        Ocean bałtyk = new Ocean(statek);
        System.out.println(bałtyk.toString());
    

        




    }
}