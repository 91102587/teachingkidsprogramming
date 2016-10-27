package org.teachingkidsprogramming.section01forloops.Variations;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;

public class CompleteSquare
{
  // Use the tortoise to draw a red square with a width and a height of 40 pixels
  //
  // Write each of the English line comments (use at least 6 line comments)
  //
  // Number each comment line so your user knows the correct order
  // to translate the code
  //
  // Verify - step one - Translate EACH comment line into Java code
  //
  // Verify - step two - Run your code after each line
  public static void main(String[] args) throws Exception
  {
    //TODO: write comment and then code here
    // Show the Tortoise -- #1
    Tortoise.show();
    // Make the Tortoise move as fast as possible -- #6
    Tortoise.setSpeed(10);
    // Do the following 4 times -- #5.1
    for (int i = 0; i < 4; i++)
    {
      //      Change the pen color to red -- #4
      Tortoise.setPenColor(PenColors.Reds.Red);
      //      Move the Tortoise 40 pixels -- #2
      Tortoise.move(40);
      //      Turn the Tortoise 90 degrees -- #3
      Tortoise.turn(90);
      // Repeat -- #5.2
    }
  }
}