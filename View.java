import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class View {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public void printTitle(String title) {
        System.out.println(ANSI_YELLOW + " ⚓️ ⚓️ ⚓️ ⚓️ ⚓️ ⚓️ ⚓️ ⚓️ ⚓️ ⚓️ ⚓️ " + ANSI_RESET);
        System.out.println(ANSI_BLUE + "   " + title.toUpperCase() + ANSI_RESET);
        System.out.println(ANSI_YELLOW + " ⚓️ ⚓️ ⚓️ ⚓️ ⚓️ ⚓️ ⚓️ ⚓️ ⚓️ ⚓️ ⚓️ " + ANSI_RESET);
    }

    public void emptyLines(int count) {
        for (int n = 0; n <= count; n++) {
            System.out.println("");
        }
    }

    public void clearScreen() {
        System.out.println("\033[H\033[2J");
        System.out.flush();

    }

    public void printInfo(String info) {
        System.out.println(ANSI_BLUE + " " + info + ANSI_RESET);
        System.out.println("");

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

    public void pause(int seconds) {
        try {
            TimeUnit.SECONDS.sleep(seconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void keyPressed(String text) {
        System.out.println(ANSI_RED + " " + text + ANSI_RESET);
        System.out.println("");
        Scanner scannerFromUser = new Scanner(System.in);
        String input = scannerFromUser.nextLine();
                                                                                                                        
    }
}