package org.teachingkidsprogramming.section01forloops.Variations;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;
//
// ------- Kata Question -------
// How would you make an equilateral triangle
// Write out steps in English
// Then translate the steps into code
// Make sure to run after each line

//
public class SquareToTriangle
{
  public static void main(String[] args) throws Exception
  {
    Tortoise.show();
    Tortoise.setSpeed(10);
    // Make 3 sides
    int sides = 3;
    for (int i = 0; i < sides; i++)
    {
      Tortoise.setPenColor(PenColors.Blues.Blue);
      Tortoise.move(50);
      // Make all the angles equal -- #2
      Tortoise.turn(360 / sides);
    }
    //
    //  (Optional): Sign your work using the Virtual Proctor 
    //  See your work at http://virtualproctor.tkpjava.org
  }
}