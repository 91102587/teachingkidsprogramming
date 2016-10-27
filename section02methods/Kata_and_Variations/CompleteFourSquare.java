package org.teachingkidsprogramming.section02methods.Kata_and_Variations;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.ColorWheel;
//------------FourSquare Kata---------------//
//  Use the Tortoise to draw four squares, each with a width and height of 50 pixels
// Write out the steps in English
// Then translate the steps into code
// Make sure to run after each line
import org.teachingextensions.logo.utils.ColorUtils.PenColors;

public class CompleteFourSquare
{
  public static void main(String[] args)
  {
    Tortoise.show();
    // make the tortoise move as fast as possible --#10
    Tortoise.setSpeed(10);
    // do the following 4 times --#9
    for (int i = 0; i < 4; i++)
    {
      // call the draw square method --#8
      drawSquare();
      // turn the tortoise 90 degrees to the right --#7
      Tortoise.turn(90);
    }
  }
  // create a method called draw square --#6
  private static void drawSquare()
  {
    // do the following 4 times --#5.1
    for (int i = 0; i < 4; i++)
    {
      // make the the color wheel a random color --#4
      ColorWheel.addColor(PenColors.getRandomColor());
      // make the tortoise draw a line that changes color every time --#3
      Tortoise.setPenColor(ColorWheel.getNextColor());
      // move the tortoise 50 pixels --#1
      Tortoise.move(50);
      // turn the tortoise 90 degrees to the right --#2
      Tortoise.turn(90);
      // repeat --#5.2
    }
  }
}