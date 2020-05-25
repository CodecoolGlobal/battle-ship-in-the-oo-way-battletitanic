import java.util.ArrayList;
import java.util.List;

public class Ship {

    
    private List<Square> squares;
    private int x;
    private int y; 

    public Ship(List<Square> squares, int x, int y){
        
        this.squares = new ArrayList<>();
        this.x = x;
        this.y = y;
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

    public Square getSquer(int index){

        return squares.get(index);
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