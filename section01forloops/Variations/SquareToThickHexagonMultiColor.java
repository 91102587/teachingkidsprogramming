package org.teachingkidsprogramming.section01forloops.Variations;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;
import org.teachingextensions.virtualproctor.VirtualProctor;
//
// ------- Kata Question -------
// How would you make an equilateral hexagon...
// Write out steps in English
// Then translate the steps into code
// Make sure to run after each line

public class SquareToThickHexagonMultiColor
{
  public static void main(String[] args) throws Exception
  {
    VirtualProctor.setClassName("Palm Digital");
    VirtualProctor.setName("Caylin and Nicole");
    // Make the line width = 20 pixels
    Tortoise.setPenWidth(20);
    Tortoise.show();
    Tortoise.setSpeed(10);
    // Change number of sides to 6
    int sides = 6;
    for (int i = 0; i < sides; i++)
    {
      // Change the color of the line to MultiColor
      Tortoise.setPenColor(PenColors.getRandomColor());
      Tortoise.move(50);
      // Make all the angles equal -- #2
      Tortoise.turn(360 / sides);
    }
    //
    //  (Optional): Sign your work using the Virtual Proctor 
    //  See your work at http://virtualproctor.tkpjava.org
  }
}