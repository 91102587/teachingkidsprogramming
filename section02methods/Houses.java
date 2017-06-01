package org.teachingkidsprogramming.section02methods;

import org.teachingextensions.logo.Tortoise;

public class Houses
{
  public static void main(String[] args)
  {
    Tortoise.show();
    //   Already done --#11
    Tortoise.setSpeed(10);
    //   Have the tortoise start at 200 pixels in on the X axis --#14
    //   The current height is 40 --#1.2
    //   drawHouse (recipe below) --#9.1
    drawHouse();
    //   drawHouse with height 120 (recipe below) --#10
    drawHouse(120);
    //   drawHouse with height 90 (recipe below) --#12
    drawHouse(90);
    //   drawHouse with height 20 (recipe below) --#13
    drawHouse(20);
  }
  public static void drawHouse()
  {
    int height = 40;
    //       Change the pen color of the line the tortoise draws to lightGray --#15
    //       Move the tortoise the height of a house --#1.1
    Tortoise.move(height);
    Tortoise.turn(90);
    Tortoise.move(30);
    Tortoise.turn(90);
    Tortoise.move(height);
    Tortoise.turn(-90);
    Tortoise.move(20);
    Tortoise.turn(-90);
  }
}