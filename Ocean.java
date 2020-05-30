import java.util.ArrayList;
import java.util.List;

public class Ocean {
    
    private static final int WIDTH = 10;
    private static final int HEIGHT = 10;
    private List<List<Square>> squares;
    

    public Ocean(List<Ship> ships){

        List<List<Square>> squares = new ArrayList<>();

        for(int j = 0; j< HEIGHT; j++){
            List<Square> line = new ArrayList<>();
            for(int i = 0; i< WIDTH; i++){
                line.add(new Square());
            }
            squares.add(line);
        }


        for (Ship ship : ships){
            int i = 0;
            for (Square elements : ship.getListSauqre()){
                if (ship.getOrientation().equals("")){
                    squares.get(ship.getCordinateY()+ i).set(ship.getCordinateX(), elements);
                }else{
                    squares.get(ship.getCordinateY()).set(ship.getCordinateX() + i, elements);
                }
                
                i++;
            }
        }
        //for (int i=0; i< ship.getLenght(); i++){
            //squares.get(ship.getCordinateX()).set(ship.getCordinateY(), ship.getSquer(0));
            //squares.get(ship.getCordinateX()+ i).set(ship.getCordinateY(), ship.getSquer(0));    
        this.squares = squares;
        //this.ship = ship;
    }
    
    public static int getWIDTH(){
        return WIDTH;
    }

    public static int getHEIGHT(){
        return HEIGHT;
    }

    @Override
    public String toString(){
        String newLine = "\n";
        StringBuilder sb = new StringBuilder();
        String coordinateX = "  A B C D E F G H I J";
        
        //List<Integer> coordinateY = new ArrayList<>();
        int coordinateY = 0;

        sb.append(coordinateX);
        sb.append(newLine);
        for( List<Square> lines : squares){
            sb.append(coordinateY);
            sb.append(" ");
            for(Square elements : lines){
                sb.append(elements);
                sb.append(" ");
            }
            sb.append(newLine);
            coordinateY++;
        }

        return sb.toString();
    }
}
