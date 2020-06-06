import java.util.Random;

public class Comp extends Player{

    Random random; 

    public Comp() {
        random = new Random();
    }

    @Override
    public void setboard(){
        
        fleetSize.add(2); //fleetSize.add(3); //fleetSize.add(4); //fleetSize.add(5);

        for(int i : fleetSize){
            boolean status = false;
            //Ocean playerBoard = new Ocean(ships);
            while(status != true){
                
                int rand1 = this.random.nextInt(9);
                int rand2 = random.nextInt(9);
                String rand3 = random.nextBoolean() ? " " : "";
                
                Ship statek = new Ship(rand1, rand2, i, rand3);
                
                if (setShips(statek)){
                    status = true;
                }

                playerBoard = new Ocean(ships);
                //System.out.println(View.ANSI_BLUE + playerBoard.toString() + View.ANSI_RESET);
            }
        }

    System.out.println(View.ANSI_BLUE + playerBoard.toString() + View.ANSI_RESET);
    System.out.println(shipsCordinate);
    Ocean playerBoard = new Ocean(ships);
    //System.out.println(playerBoard.toString());


    }
    
}