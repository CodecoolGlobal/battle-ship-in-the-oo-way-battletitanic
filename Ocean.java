import java.util.ArrayList;
import java.util.List;

public class Ocean {
    
    private static final int WIDTH = 10;
    private static final int HEIGHT = 10;
     
    private List<List<Square>> squares;
    //private List<Ship> ships;
    private Ship ship;
    
   //public Ocean(List<Ship> ships){
    public Ocean(Ship ship){

        List<List<Square>> squares = new ArrayList<>();

        for(int j = 0; j< HEIGHT; j++){
            List<Square> line = new ArrayList<>();
            for(int i = 0; i< WIDTH; i++){
                line.add(new Square());
            }
            squares.add(line);
        }

        squares.get(ship.getCordinateX()).set(ship.getCordinateY(), ship.getSquer(0));

        this.squares = squares;
        this.ship = ship;
    }
    
    @Override
    public String toString(){

        String newLine = "\n";
        StringBuilder sb = new StringBuilder();

        for( List<Square> lines : squares){
            for(Square elements : lines){
                sb.append(elements);
                sb.append(" ");
            }
            sb.append(newLine);
        }

        return sb.toString();
    }
}
