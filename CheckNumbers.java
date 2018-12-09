/*CheckNumbers.java
*Kevin kerin
*Johnathan Munster
*Sebastian Ryan
*09/12/2018
*/

import java.util.Arrays;

public class CheckNumbers{

	//Creating our variables
	private int[] winningNums = new int[6];
	private int[][] games;
	private int[] prizes;
	private int numberLines;

	//variables pastGames
	private int numLinesPlayed;
	//how many games the user won
	private int numLinesWon;
	private int prizeWon;
	private boolean wonLottery;
	private int [][]pastGames = new int[10][3];

	// Objects
	Start startProgram;

	//Constructor
	public CheckNumbers(){
	}

	//setters

	public void setStartProgram(Start object1){
		startProgram = object1;
	}

	public void setWinningNums(int[] winningNums){
		this.winningNums = winningNums;
	}
	public void setGuess (int[][] games){
		this.games = games;
	}
	public void setNumberLines(int numberLines){
		this.numberLines = numberLines;
	}

	public void checkNumbers(){
		//counting the amount of games played
		numberLines = startProgram.getNumberLines();
		games = new int[numberLines][6];
		games = startProgram.getUserGuess();
		prizes = new int[numberLines];
		int win = 0;
		//checking to see how many lines have one but if there's no winner the win counter remains the same.
     	for(int row = 0; row < games.length; row++){
			for(int col = 0; col < games[row].length; col++){
				for(int i = 0; i < winningNums.length; i++){
					if (winningNums[i]==games[row][col]){
						win++;
					}
				}
			prizes[row] = win;
			}
			win = 0;
		}
		int prize = 0;
		int winAmount = 0;
		for(int i = 0; i < prizes.length; i++){
		    prize = 0;
			if (prizes[i] == 3){
				prize = 100;
			} else if (prizes[i] == 4){
				prize = 250;
			} else if (prizes[i] == 5){
				prize = 1000;
			} else if (prizes[i] == 6) {
				prize = 1000000;
			}
			winAmount = winAmount + prize;
			System.out.println("Game "+(i+1)+"     "+prizes[i]+" wins    amount " + prize + " Euros");
		}
		//getting the history of the games.
		numLinesPlayed = startProgram.getNumberLines();
		numLinesWon = 0;
			for (int n = 0; n < prizes.length; n++){
				if (prizes[n] > 2) {
					numLinesWon++;
				}
			}
		prizeWon = prize;
		//store the values in the arrays
		for(int l = 0; l<pastGames.length; l++){
			for(int m = 0; m<pastGames[l].length; m++){
				pastGames[l][0]=numLinesPlayed;
				pastGames[l][1]=numLinesWon;
				pastGames[l][2]=prizeWon;
			}
		}
	}

	//getters
	public int[] getPrizes(){
		return prizes;
	}
	public int[][]getPastGames(){
		return pastGames;
	}
} //end of class
