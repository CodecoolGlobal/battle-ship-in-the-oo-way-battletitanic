import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class View {
    
    public void printTitle(String title) {
        System.out.println("");
        System.out.println(" " + title.toUpperCase());
        System.out.println("");
    }

    public void clearScreen() {
        System.out.println("\033[H\033[2J");
        System.out.flush();
    
    }

    public void printInfo(String info) {
        System.out.println(" " + info);

    }

    public String inputFromUser(String text) {
        System.out.println(" " + text + ":");
        System.out.println(" ");
        Scanner scannerFromUser = new Scanner(System.in);
        String input = scannerFromUser.nextLine();
        return input;
        
    }
    
    public int intFromUser(int text) {
        System.out.println(" " + text + ":");
        System.out.println(" ");
        Scanner scannerFromUser = new Scanner(System.in);
        int input = scannerFromUser.nextInt();
        return input;
        
    }
    
    public void pause() throws InterruptedException {
        TimeUnit.SECONDS.sleep(3);
    }

    
}