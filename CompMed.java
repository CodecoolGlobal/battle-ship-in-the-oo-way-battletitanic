import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CompMed extends Comp {

    Random random; 

    public CompMed() {
        random = new Random();
    }
    
    @Override
    public <Squer> void hit(Player enemy) {

        int rand1 = random.nextInt(9);
        int rand2 = random.nextInt(9);

        //int rand1 = 0;
        //int rand2 = 0;

        List<Square> lines = enemy.playerBoard.getSquere().get(rand2);
        Square shot = lines.get(rand1);
        
        List<Square> linesEnemy = playerBoard.getEnemySquere().get(rand2);
        Square shotEnemy = linesEnemy.get(rand1);

        if(shotEnemy.toString().equals("X")){
            System.out.println("dupa");
            hit(enemy);
            System.out.println("dupa");
        }
        else if(shot.toString().equals("X")){
            shotEnemy.mark();
            removeFromList(rand1, rand2, enemy);
        }else if(shot.toString().equals("O")) {
            hit(enemy);    
        }else{
            shot.empty();
            shotEnemy.empty();
        }
    }
    public void hitMedExtend(int rand1, int rand2, Player enemy){
        List<Integer> possibleDirection = new ArrayList<>();
        possibleDirection.add(-1);  possibleDirection.add(1);

        for (int x : possibleDirection){
            for(int y : possibleDirection){

                int coordinateX = rand1 + x;
                int coordinateY = rand2 + y;

                if (coordinateX >=0 && coordinateX < 10 &&
                    coordinateY >=0 && coordinateY < 10){
                List<Square> linesEnemy = playerBoard.getEnemySquere().get(coordinateY);
                Square shotEnemy = linesEnemy.get(coordinateX);
                List<Square> lines = enemy.playerBoard.getSquere().get(coordinateY);
                Square shot = lines.get(coordinateX);
                shot.empty();
                shotEnemy.empty();
                } 
            }
        }
    }
    
}