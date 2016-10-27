package org.teachingkidsprogramming.section01forloops.Variations;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;
import org.teachingextensions.virtualproctor.VirtualProctor;
//
// ------- Kata Question -------
// How would you make an equilateral hexagon...
// with 20 pixel thick sides?
// with multi-colored lines
// and with side lengths of 25 that increase by 2 times??
// Write out steps in English
// Then translate the steps into code
// Make sure to run after each line

public class SquareToIncreasingThickHexagonMultiColor
{
  public static void main(String[] args) throws Exception
  {
    VirtualProctor.setClassName("Palm Digital");
    VirtualProctor.setName("Caylin and Nicole");
    // Make the line width = 20 pixels
    Tortoise.setPenWidth(20);
    Tortoise.show();
    Tortoise.setSpeed(10);
    // Make a variable named length
    // initialize Length to 25
    int length = 5;
    // Change number of sides to 6
    int sides = 6;
    for (int i = 0; i < sides; i++)
    {
      // Change the color of the line to MultiColor
      Tortoise.setPenColor(PenColors.getRandomColor());
      // Start side length at 25 pixels
      Tortoise.move(length = length * 2);
      // Make all the angles equal -- #2
      // every time through the Loop double Length
      Tortoise.turn(360 / sides);
    }
    //
    //  (Optional): Sign your work using the Virtual Proctor 
    //  See your work at http://virtualproctor.tkpjava.org
  }
}