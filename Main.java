import java.util.Scanner; 
public class Main {
    public static void main(String[] args) {
        //preparing scanner and newline stuff
        Scanner scan = new Scanner(System.in);
        String newline = System.getProperty("line.separator");
        //explain the game
        System.out.println("This is a counting game where you can choose the number that you are counting to, as well as the interval that you will count at.");
        System.out.println("the goal is to be the player who says the target word, and both players will take turns counting up.");
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
        int startNum = target;
        while(startNum > interval) {
            startNum = startNum - (1 + interval);
        }
        if(startNum <= interval) {
            System.out.println("The computer will go first to ensure that it will win.");
        }
        else {
            System.out.println("The computer will go second to ensure that it will win.");
        }
        //print the numbers you need to say to win
        int moves = 0;
        int number = startNum;
        System.out.print("It will say the following numbers: ");
        while(target >= number) {
            System.out.print(number + " ");
            number = number + interval + 1;
            moves = moves + 2;
        }
        //print number of moves to win
        System.out.print(newline);
        if(startNum <= interval) {
            moves = moves - 1;
        }
        System.out.println("It will take at least " + moves + " moves to win");
        
    }
}
