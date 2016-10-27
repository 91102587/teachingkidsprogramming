package org.teachingkidsprogramming.section03ifs.Kata_and_Variations;

import org.teachingextensions.approvals.lite.util.NumberUtils;
import org.teachingextensions.logo.Sound;
import org.teachingextensions.logo.utils.EventUtils.MessageBox;

//------------- Kata Question -----------//
// How would you make sure the guess is not zero?
// and end the game if the guess is zero?
// how would you make sure the guess is not a negative number
// but go to the next turn if the guess is negative
// How would you make sure the guess is less than 100
//     and end the game if the guess is greater than 100?
// Write out the steps into English
// Then translate the steps into code
// Make sure to run after each line
public class HiLow_NoZeroOr101AndNoMinusAndPlayOn_03
{
  public static void main(String[] args)
  {
    int answer = NumberUtils.getRandomInt(1, 100);
    MessageBox.showMessage("The answer is " + answer); // delete (or comment out) this line after testing the game 
    for (int i = 0; i < 5; i++)
    {
      int guess = MessageBox.askForNumericalInput("Guess a number");
      if (guess == answer)
      {
        Sound.playBeep();
        MessageBox.showMessage("You won!");
        System.exit(0);
      }
      // check if guess is less than one
      else if (guess < 1)
      {
        // Tell user to not enter values less than one
        MessageBox.showMessage("That is not a valid input.");
        // End the game
        MessageBox.askForTextInput("Try again?");
      }
      else if (guess > 100)
      {
        MessageBox.showMessage("That is not a valid input.");
        MessageBox.askForTextInput("Try again?");
      }
      else if (guess > answer)
      {
        MessageBox.showMessage("Too high");
      }
      else
      {
        MessageBox.showMessage("Too low");
      }
    }
    MessageBox.showMessage("You lost");
  }
}