package org.teachingkidsprogramming.section04mastery;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.ColorWheel;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;

public class PentagonCrazy
{
  public static void main(String[] args)
  {
    Tortoise.show();
    Tortoise.setSpeed(10);
    createColorPalette();
    drawPentagon();
  }
  private static void drawPentagon()
  {
    for (int i = 0; i < 200; i++)
    {
      adjustPen();
      //        The current length of a side is the same as the number of the side you are about to draw ( 1st side = 1 pixel, 2nd side = 2 pixels, etc) --#4.2
      Tortoise.move(i);
      Tortoise.turn(360 / 5);
      Tortoise.turn(1);
    }
  }
  private static void adjustPen()
  {
    Tortoise.setPenColor(ColorWheel.getNextColor());
    //        Increase the tortoises pen width by 1 --#15 
    Tortoise.getPenWidth();
    //        If the tortoises pen width is greater than 4, then --#17
    //            Reset it to 1 --#16
  }
  private static void createColorPalette()
  {
    ColorWheel.addColor(PenColors.Blues.Blue);
    ColorWheel.addColor(PenColors.Purples.DarkOrchid);
    ColorWheel.addColor(PenColors.Blues.DarkSlateBlue);
    ColorWheel.addColor(PenColors.Blues.Teal);
    ColorWheel.addColor(PenColors.Purples.Indigo);
  }
}
