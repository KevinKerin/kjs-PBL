/*GenerateNumbers.java
*Kevin kerin
*Johnathan Munster
*Sebastian Ryan
*09/12/2018
*/

import java.util.Random;

public class GenerateNumber{

	//delaring our variables.
	//require 6 numbers to play the lotto
	private int [] winningNums = new int [6];
	private int GenerateNumber;

	Random random = new Random();

	//contructor
	public GenerateNumber(){
	}

	//this method generates the lottery numbers
	public void newRandom(){
		//this lines creates the first number and stores it.
		winningNums[0]=random.nextInt(40)+1;

		//generates our numbers - winningNums and add one with i++ = continues to 6.
		for (int i=1; i <winningNums.length; i++) {

			 GenerateNumber = random.nextInt(40)+1;

			 //ensuring we don't have duplication and each number is unique.
			 for (int j = 0; j<i ;j++){
				 //if we generate a new number = keep and add it the array.
				 if (GenerateNumber == winningNums [j]){
					 //if duplication = removes and start again
					 i--;
					 // ensures numbers don't increase over 40.
			     	 j=50;
			     } else{
					 //if no errors = we get out 6 numbers from our array.
					 winningNums[i] = GenerateNumber;
				 }
			}
		 }

	  }

	//getters

	public int [] getSecret(){
		return winningNums;
	}

} //end of class
