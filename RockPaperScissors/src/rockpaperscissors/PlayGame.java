package rockpaperscissors;

import java.util.Scanner;

/**
 *
 * @author Rishadul Islam Khan
 */
public class PlayGame extends StartGame{
    
    Scanner input = new Scanner(System.in);
    String user, guess;
    static int countUser = 0, countPc = 0;
    final String[] rps = {"rock", "paper", "scissors"}; // rps = rockPaperScissors
    public void gameStart(){
        
        System.out.println("GAME STARTED!!!!\n");
        while(true){
            System.out.println("Guess and Type: ");
            user = takeInputFromUser();
            guess = pcGuess();
            System.out.printf("\nUser: %d\tCPU: %d\n\n",countUser, countPc);
            match(user,guess);
            if(countUser >= 2 || countPc >= 2){
                System.out.printf("\nUser: %d\tCPU: %d\n\n",countUser, countPc);
                System.out.println("GAME FINISHED" + "\n\n");
                break;
            }
        }

    }
    public String takeInputFromUser(){
        user = input.nextLine();
        return user;
    }
    public int generateRandomNumber(){
        int random;
        random = (int)(Math.random() * 3);
        return random;
    }
    
    public String pcGuess(){
        String guessPc;
        int randomIndex = generateRandomNumber();
        
        guessPc = rps[randomIndex];
        
        return guessPc;
    }
    
    public void match(String user, String guess){
        /////// start from here///////
        if(user.equalsIgnoreCase("rock") && (guess.equalsIgnoreCase("scissors"))){
            countUser++;
            System.out.println(user + "-" + guess + " (WIN)");
        }
        else if(user.equalsIgnoreCase("scissors") && (guess.equalsIgnoreCase("paper"))){
            countUser++;
            System.out.println(user + "-" + guess + " (WIN)");
        }
        else if(user.equalsIgnoreCase("paper") && (guess.equalsIgnoreCase("scissors"))){
            countPc++;
            System.out.println(user + "-" + guess + " (LOSE)");
        }
        else if(user.equalsIgnoreCase("scissors") && (guess.equalsIgnoreCase("rock"))){
            countPc++;
            System.out.println(user + "-" + guess + " (LOSE)");
        }
        else{
            System.out.println(user + "-" + guess + " (DRAW)");
        }
    }
}
