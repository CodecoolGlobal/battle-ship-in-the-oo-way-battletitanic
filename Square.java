public class Square {
    private final static String SYMBOL = "X"; 

    public String isMark = "~";  

    public void mark(){  // markShip
        isMark = SYMBOL; 
    }

    public void redMark() {
        isMark = View.ANSI_RED + SYMBOL + View.ANSI_RESET;
    }

    public void empty(){ // markMiss
        isMark = "O";
    }

    @Override
    public String toString(){
        return isMark;
    }

}

/* 
    private final enum Symbol {
        "~",
        "X",
        "o"
    }

    private final Symbol WATER = Symbol."~"
    private final Symbol SHIP = Symbol."X"
    private final Symbol MISS = Symbol."o"
*/
