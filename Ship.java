import java.util.ArrayList;
import java.util.List;

public class Ship {

    
    private List<Square> squares; // shipModules, shipSquares ?
    private int x;
    private int y; 
    private int lenght; 
    private String orientation; 
    private List<List<Integer>> coordinatesList; 
    private static final int boardWIDTH = Ocean.getWIDTH();  
    private static final int boardHEIGHT = Ocean.getHEIGHT();

    /*
    private final enum Orientation {
        "VERTICAL",
        "HORIZONTAL"
    }
    */
    

    public Ship(int x, int y, int lenght, String orientation){
        

        squares = new ArrayList<>();
        List<List<Integer>> coordinatesList = new ArrayList<>();
        
        Square ship = new Square(); // shipModule ?
        ship.mark();
        
        if(checkIfIsOnBoard(x, y, lenght, orientation)){  // checkIfFits
            int coordinateX = x;
            int coordinateY = y;


            for(int i = 0; i< lenght; i++){
                List<Integer> coordinate = new ArrayList<>();
                coordinate.add(coordinateX); coordinate.add(coordinateY);
                squares.add(ship);
                coordinatesList.add(coordinate);
            
                if(orientation.equals("")){
                    coordinateY++;
                }else{
                    coordinateX++;
                }
            }}else{
                System.out.println("Ship ouf of a board");
            }

        this.x = x;
        this.y = y;
        this.lenght =lenght;
        this.orientation= orientation;
        this.coordinatesList = coordinatesList;
    }

    public void addSquer(){  // addModule ? ale czy używana ta metoda?

        Square ship = new Square();
        ship.mark();
        squares.add(ship);
    }

    public int getCordinateX(){
        return x;
    }

    public int getCordinateY(){
        return y;
    }

    public int getLenght(){
        return lenght;
    }

    public List<Square> getListSauqre(){
        return squares;
    }

    public Square getSquer(int index){
        return squares.get(index);
    }

    public String getOrientation(){
        return orientation;
    }
    
    public List<List<Integer>> getCoordinate(){
        return coordinatesList;
    }

    public boolean checkIfIsOnBoard(int x, int y, int lenght, String orientation){
        for(int i=1; i<lenght; i++)
            if(orientation.equals("")){
                y++;
            }else{
                x++;
            }
            
        if(x< boardHEIGHT && y < boardWIDTH){
            return true;
        }else{
            return false;
        }}

            
    @Override
    public String toString(){

        
        StringBuilder sb = new StringBuilder();

        for( Square elements : squares){ // element ?
                sb.append(elements);
                sb.append(" ");
            }
        return sb.toString();
    }
}