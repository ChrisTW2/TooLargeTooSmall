package TooLargeTooSmall;

import sun.jvm.hotspot.debugger.posix.elf.ELFSectionHeader;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by christopherworsley on 9/9/16.
 */
public class GuessingGame {
    public int count = 0;
    public int numberSize;
    public boolean win = false;
    public int ask;
    public int finalGuess;
    public int numToGuess;



    public void ask(){
        Scanner ask =new Scanner(System.in);
        System.out.println("Choose a number 1-100! ");
        numberSize =ask.nextInt();
        count++;
    }

    public void numberToGuess(){
        Random ranNumber= new Random();
        numToGuess = ranNumber.nextInt(100);

    }

    public void playGame(){
        while (!win) {
            ask();
      if (finalGuess != numberSize){
          if (numberSize > numToGuess) {
              System.out.println("The number you have chosen is too big!");
          }
          if (numberSize < numToGuess) {
              System.out.println("The number you have chsoen is too small!");
          }

      }  if (numberSize == numToGuess) {
            System.out.println("Congrats, You Won! It took you " + count +"tries");
            win =true;


    }
      }
        }



    public static void main(String[] args) {

        GuessingGame guessingGame = new GuessingGame();
        guessingGame.numberToGuess();
        //guessingGame.ask();
        guessingGame.playGame();

    }


}
