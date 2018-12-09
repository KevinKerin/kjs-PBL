/*LotteryApp.java
*Kevin kerin
*Johnathan Munster
*Sebastian Ryan
*09/12/2018
*/

import java.util.Scanner;
import java.util.Arrays;

public class LotteryApp {
  public static void main(String args[]) {

  //declaring our variables
  int userGuess[][];
  int gameNumber = 0;
  int random[] = new int[6];
  int prizes[];
  int pastGames[][]= new int [100][3];
  String continuePlay;
  String winningText;

  //objects - scanner, other class etc.
  Scanner playerInput = new Scanner(System.in);
  Start startProgram = new Start();
  CheckNumbers checkNumbers = new CheckNumbers();
  checkNumbers.setStartProgram(startProgram);
  GenerateNumber randomProgram = new GenerateNumber();

  //input
  System.out.println("Welcome to our lottery game, select between 1-3 for the amount of games you'd like to play. ");
  System.out.println("Then select 6 numbers from 1-40 for each line");


  randomProgram.newRandom();
  checkNumbers.setWinningNums(random);

 // process
 do {
  gameNumber = gameNumber + 1;
  startProgram.setGameNumber(gameNumber);
  startProgram.begin();
  checkNumbers.checkNumbers();
  startProgram.wipe();

  //outputs
  //determing if they won anything
  prizes = checkNumbers.getPrizes();
  pastGames = checkNumbers.getPastGames();

  // continue Game
//prompting the user to select if they would like to play again
  System.out.println("Would you like to play again? Please input Yes or No: ");
  continuePlay = playerInput.nextLine();
  }
  while (continuePlay.toLowerCase().matches("yes|y|true"));

  if(!continuePlay.matches("yes|y|true")){
      for(int i = 0;i<pastGames.length;i++){
        for (int j = 0; j<pastGames.length;j++){
        System.out.println("Game: "+(i+1)+", Lines Played: "+pastGames[i][0]+", numnumLinesWon: "+pastGames[i][1]+" Amount won:" +pastGames[i][2]);
        }

      }
  }

  // OUTPUT
  System.out.println("Thank you for playing, see you again!");

  gameNumber = 0;
  startProgram.setGameNumber(0);

  }
}//end of class
