import java.util.List;

public class Ocean {
    
    private static final int WIDTH = 10;
    private static final int HEIGHT = 10;
    
    private List<List<Square>> squares;
    private List<Ship> ships;

    public Ocean(List<List<Square>> squares,
                 List<Ship> ships) {
        this.squares = squares;
        this.ships = ships;
    }

    @Override
    public String toString() {
        return "";
    }