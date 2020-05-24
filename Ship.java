import java.util.List;

public class Ship {

    
    private List<Square> squares;
    private int x;
    private int y; 

    public Ship(List<Square> squares, int x, int y){
        this.squares = squares;
        this.x = x;
        this.y = y;
    }

    
    @Override
    public String toString(){

        return "";
    }
}