public class Square {
    private final static String SYMBOL = "X";

    private boolean isMark;

    public void mark(){
        isMark = true; 
    }

    @Override
    public String toString(){
        return isMark ? SYMBOL : " ";
    }

}