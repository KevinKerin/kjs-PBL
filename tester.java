
import javax.swing.JOptionPane;
import java.lang.Math;

public class tester{
  public static void main(String args[]){
    int arr1[] = {1, 2, 3, 9, 5, 6};
    int arr2[] = {6, 7, 8, 9, 1, 11};
    int correctNumAmount;


    for (int i = 0; i < 6; i++){
      for (int j = 0; j < 6; j++){
        if (arr1[i]==arr2[j]){
          System.out.println("We have a match! " + arr1[i]);
          correctNumAmount = correctNumAmount + 1;
          System.out.println(correctNumAmount);
        }
    }

  }
}
}
