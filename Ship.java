import java.util.ArrayList;
import java.util.List;

public class Ship {

    
    private List<Square> squares;
    private int x;
    private int y; 
    private int lenght; 
    private String orientation; 

    public Ship(int x, int y, int lenght, String orientation){
        
        squares = new ArrayList<>();
        Square ship = new Square();
        ship.mark();
        for(int i =0; i< lenght; i++){
            squares.add(ship);
        }

        this.x = x;
        this.y = y;
        this.lenght =lenght;
        this.orientation= orientation;

    }

    public void addSquer(){

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

    @Override
    public String toString(){

        
        StringBuilder sb = new StringBuilder();

        for( Square elements : squares){
                sb.append(elements);
                sb.append(" ");
            }
        return sb.toString();
    }
}