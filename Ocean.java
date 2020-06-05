import java.util.ArrayList;
import java.util.List;

public class Ocean {
    
    private static final int WIDTH = 10;
    private static final int HEIGHT = 10;
    private List<List<Square>> squares;  // myBoard
    private List<List<Square>> emptySquares;  // opponentsBoard
    

    public Ocean(List<Ship> ships){

        List<List<Square>> squares = new ArrayList<>();
        List<List<Square>> emptySquares = new ArrayList<>();

        for(int j = 0; j< HEIGHT; j++){
            List<Square> line = new ArrayList<>();
            for(int i = 0; i< WIDTH; i++){
                line.add(new Square());
            }
            emptySquares.add(line);
        }

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
        this.emptySquares = emptySquares;
        //this.ship = ship;
    }


    public List<List<Square>>  getEnemySquere(){
        return this.emptySquares;
    }

    
    public static int getWIDTH(){
        return WIDTH;
    }

    public static int getHEIGHT(){
        return HEIGHT;
    }

    public List<List<Square>> getSquere(){
        return this.squares;
    }

    @Override
    public String toString(){
        String newLine = "\n";
        StringBuilder sb = new StringBuilder();
        String coordinateX = "  A B C D E F G H I J";
        String space = "    ";
        //List<Integer> coordinateY = new ArrayList<>();
        int coordinatePlayerY = 0;

        sb.append(coordinateX); sb.append(space); sb.append(" "); sb.append(coordinateX);
        sb.append(newLine);
        for(int i= 0; i < squares.size(); i++){
            sb.append(coordinatePlayerY);
            sb.append(" ");
            for(Square elements : squares.get(i)){
                sb.append(elements);
                sb.append(" ");
            }
            sb.append(space);
            sb.append(coordinatePlayerY);
            sb.append(" ");
            for(Square elements : emptySquares.get(i)){
                sb.append(elements);
                sb.append(" ");
            }
            
            sb.append(newLine);
            coordinatePlayerY++;    
        }

        return sb.toString();

    
    }


}
