package rockpaperscissors;

import java.util.Scanner;

/**
 *
 * @author Rishadul Islam Khan
 */

public class StartGame {
    static String yesNo;

    public void startGame(){
        
        PlayGame playGame = new PlayGame();
        Exit exit = new Exit();        
        
        Scanner input = new Scanner(System.in);
        System.out.println("You want to play Rock-Paper-Scissors? (Y/N)");
        
        yesNo = input.nextLine();
        
        if(yesNo.equalsIgnoreCase("y")){
            playGame.gameStart();
        }else{
            exit.exitGame();
        }
        
    }
}
