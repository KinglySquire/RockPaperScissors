import java.util.Scanner;
import java.util.Random;


public class Player{
    private int choice;
    private int npcChoice;



    public void setPlayerChoice(){

        System.out.println("pick rock or paper or scissors!");
        Scanner askChoice = new Scanner(System.in);
        String pcChoice = askChoice.nextLine().toUpperCase();
        if(pcChoice.equals("ROCK")){
            this.choice = 0;
        }
        else if(pcChoice.equals("PAPER")){
            this.choice = 1;
        }
        else if(pcChoice.equals("SCISSORS"))
        this.choice = 2;
        else {
            System.out.println("you stupid, do ROCK or PAPER or SCISSORS TO PLAY THIS GAME");
            setPlayerChoice();
        }
        askChoice.close();
        }



    public void setNpcChoice(){
        //TO + do
        //make thing randomly pick 1 - 3
        Random random = new Random();
        this.npcChoice = random.nextInt(3);
    }
    public int getPlayerChoice(){
        int playerChoice = this.choice;
        return playerChoice;
    }
    public int getNpcChoice(){
        int nonPlayerChoice = this.npcChoice;
        return nonPlayerChoice;

    }


}
