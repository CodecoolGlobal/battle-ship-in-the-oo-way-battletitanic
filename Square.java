public class Square {
    private final static String SYMBOL = "X";

    public String isMark = "~";

    public void mark(){
        isMark = SYMBOL; 
    }

    public void empty(){
        isMark = "O";
    }

    @Override
    public String toString(){
        return isMark;
    }

}


