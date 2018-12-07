/*
 *Kevin Kerin
 *LotteryApp.java
 *05-12-18
 */

import javax.swing.JOptionPane;
import java.lang.Math;

public class LotteryAppKevin{
  public static void main(String args[]){
    int numbers[], line1[], line2[], line3[], correctNumAmount;
    String ans;
    //numbers = lotto numbers, lines1, 2, 3 are inputs
    numbers = new int[6];
    line1 = new int[6];
    line2 = new int[6];
    line3 = new int[6];
    correctNumAmount = 0;

    for(int i = 0; i < 6; i++){
      numbers[i] = (int)(Math.random()*39 + 1);
    }
    //line below this is for testing only, get rid of it for submission
    JOptionPane.showMessageDialog(null, "Lotto numbers are... " + numbers[0] + ", " + numbers[1] + ", " + numbers[2] + ", " + numbers[3] + ", " + numbers[4] + ", " + numbers[5]);

    //i've made the line1[i-1] so that it starts as number 1 instead of 0 for user input
    for(int i = 1; i < 7; i++){
      line1[i-1] = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter line 1 number " + i));
    }

    JOptionPane.showMessageDialog(null, "You chose " + line1[0] + ", " + line1[1] + ", " + line1[2] + ", " + line1[3] + ", " + line1[4] + ", " + line1[5] + ".");


    //ans = JOptionPane.showInputDialog(null, "Would you like another line? Y/N");
    //if (ans == "Y"){
        //run the loop again - make it a separate class and then call it if user says yes maybe?
    //}

    for (int i = 0; i < 6; i++){
      for (int j = 0; j < 6; j++){
        if (line1[i]==numbers[j]){
          System.out.println("We have a match! " + line1[i]);
          correctNumAmount = correctNumAmount + 1;
          System.out.println(correctNumAmount);
        }
      }
    }

    if (correctNumAmount < 3){
      JOptionPane.showMessageDialog(null, "Unlucky bai, you've won fuck all");
    }
    else if (correctNumAmount == 3){
      JOptionPane.showMessageDialog(null, "Congrats, you've won €100!");
    }
    else if (correctNumAmount == 4){
      JOptionPane.showMessageDialog(null, "Congrats, you've won €250!");
    }
    else if (correctNumAmount == 5){
      JOptionPane.showMessageDialog(null, "Congrats, you've won €1000!");
    }
    else if (correctNumAmount == 6){
      JOptionPane.showMessageDialog(null, "Congrats, you've won the Lotto!");
    }

  }
}
