package org.teachingkidsprogramming.section05recursion;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.Turtle.Animals;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;

public class SpiderWeb
{
  public static void main(String[] args)
  {
    Tortoise.show();
    Tortoise.setSpeed(10);
    Tortoise.setPenWidth(1);
    Tortoise.setAnimal(Animals.Spider);
    Tortoise.setPenColor(PenColors.Reds.Red);
    Tortoise.getBackgroundWindow().setBackground(PenColors.Grays.Black);
    double Length = 10.5;
    double zoom = 1.1;
    for (int i = 0; i < 10; i++)
    {
      Length = weaveOneLayer(Length, zoom);
      zoom = zoom * 1.3;
    }
  }
  private static double weaveOneLayer(double Length, double zoom)
  {
    for (int i = 0; i < 6; i++)
    {
      drawTriangle(Length);
      Tortoise.turn(360 / 6);
      Length = Length + zoom;
    }
    return Length;
  }
  private static void drawTriangle(double Length)
  {
    for (int i = 0; i < 3; i++)
    {
      Tortoise.move(Length);
      Tortoise.turn(360 / 3);
    }
  }
}
