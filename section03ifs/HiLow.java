package org.teachingkidsprogramming.section03ifs;

import org.teachingextensions.approvals.lite.util.NumberUtils;
import org.teachingextensions.logo.Sound;
import org.teachingextensions.logo.utils.EventUtils.MessageBox;

public class HiLow
{
  public static void main(String[] args)
  {
    int answer = NumberUtils.getRandomInt(1, 100);
    for (int i = 0; i < 8; i++)
    {
      int guess = MessageBox.askForNumericalInput("What is your guess?");
      if (guess == answer)
      {
        Sound.playBeep();
        MessageBox.showMessage("You won the game");
        System.exit(0);
      }
      else if (guess > answer)
      {
        MessageBox.showMessage("Too high!");
      }
      else
      {
        MessageBox.showMessage("Too low!");
      }
    }
    //    After 8 incorrect guesses tell the user they've lost --#11
  }
}
