import java.util.Scanner; 
public class Main {
    public static void main(String[] args) {
        //preparing scanner and newline stuff
        Scanner scan = new Scanner(System.in);
        String newline = System.getProperty("line.separator");
        //explain the game
        System.out.println("This is a counting game where you can choose the number that you are counting to, as well as the interval that you will count at.");
        System.out.println("This program will say how many moves it will take to win, as well as who should go first to win.");
        //ask user for target number
        System.out.print("The number we will count to:");
        int target = scan.nextInt();
        System.out.print(newline);
        //ask user for interval
        System.out.print("The number of moves per turn:");
        int interval = scan.nextInt();
        System.out.print(newline);
        //determine who should go first
        int startNum = interval % target;
        if(startNum <= interval) {
            System.out.println("The computer will go first to ensure that it will win.");
        }
        else {
            System.out.println("The computer will go second to ensure that it will win.");
        }
        //determine number of moves to win
        int moves = Math.round(target / interval + 1 );
        System.out.println("It will take at least " + moves + " moves to win");
    }
}
