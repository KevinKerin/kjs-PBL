/*Start.java
*Kevin kerin
*Johnathan Munster
*Sebastian Ryan
*09/12/2018
*/

import java.util.Scanner;
import java.util.Arrays;

public class Start {

  // Creating our variables
  private int userGuess[][];
  private int gameNumber = 0;
  private int numberLines;
  private String userError = "";

  // objects - importing of the scanner
  Scanner playerInput = new Scanner(System.in);

  // contructors
  public Start(){
  }

  // setters
  public void setGameNumber(int gameNumber) {
    this.gameNumber = gameNumber;
  }

  public void setNumberLines(int numberLines) {
    this.numberLines = numberLines;
  }


  //Process - playing the game
  public void begin(){
    do {

		//here we're setting our game number by using 'gameNumber' to keep count
      System.out.println("Game Number " + gameNumber);
      System.out.println("How many games would you like to play from 1-3?");
      //inputted answer determines the amount of games the user plays and is stores in numberLines
      numberLines = playerInput.nextInt();

	//user has an option of 1,2 or 3 lines.
      if (numberLines==1 || numberLines==2 || numberLines==3) {
		//picks 6 numbers but can't be the same.
        userGuess = new int [numberLines][6];
        //counting by using the row=0 and increases by 1 when they user selects a number
        for (int row=0; row<numberLines; row++) {

          for (int col=0; col<=5; col++) {
            System.out.println("Guess number " + (col+1) + " out of 6 in your line " + (row+1) + " : ");
            int playerNum = playerInput.nextInt();

              // ensuring the numbers are between 1-40.
              if (playerNum>=1 && playerNum<=40){

                // ensuring that a duplicated number isn't inputted and if it is the user will have to re-try. see below
                  boolean duplicate = false;
                  for(int l = 0; l<userGuess[row].length; l++){

                    if (userGuess[row][l] == playerNum) {
                      duplicate = true;
                    }
                  }
                    // the users numbers are stored in the array below
                    if (duplicate == false) {
                      userGuess[row][col] = playerNum;
                    }

                    // this is our control of our errors and if there's an error, it removes it so the user can try again
                    else {
                      System.out.println("This number was already used, try another one");
                      col = col - 1;
                    }
              }
              // this is our control to ensure the user doesn't try to use a number outside of 1-40. it removes it so the user can try again
              else {
                System.out.println("Sorry but you selected a number outside of the range, try again with any number between 1-40.!");
                col = col - 1;
              }
            }
          }
        }
        // this is how we control if the user didn't add a number of 1-3 to select the amount of lines they'd like to play.
        else {
          userError = "Please select a number: ";
          System.out.println(userError);
        }
      }
      while (userError.equals("The lines range from 1-3, try again: "));
    }

    // this clears the array after each game to avoid line duplications
    public void wipe(){
      for (int row = 0; row < userGuess.length; row++) {
        for (int col = 0; col < userGuess[row].length; col++) {
          userGuess[row][col] = 0;
        }
      }
    }

    // getters
    public int getGameNumber(){
      return gameNumber;
    }

    public int[][] getUserGuess(){
      return userGuess;
    }

    public int getNumberLines(){
      return numberLines;
    }


} //end of class
