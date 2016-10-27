package org.teachingkidsprogramming.section02methods.Kata_and_Variations;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;
import org.teachingextensions.virtualproctor.VirtualProctor;

public class Variation_01_Batman
{
  // product owner wants to change to a pointy roof
  //-----------Kata Question-------------
  // how would you make a house with a pointy roof?
  // write out the steps in English
  // then translate the steps into code
  // make sure to run after each line
  // make a slanted roof
  public static void main(String[] args)
  {
    VirtualProctor.setClassName("Palm Digital");
    VirtualProctor.setName("Caylin and Nicole");
    Tortoise.show();
    Tortoise.setSpeed(10);
    Tortoise.setX(200);
    int height = 40;
    drawBatmanFace(height);
    drawBatman();
    //    drawBatmanFace(120);
    //    drawBatmanFace(90);
    //    drawBatmanFace(20);
  }
  private static void drawBatmanFace(int height)
  {
    Tortoise.setPenColor(PenColors.Grays.LightGray);
    Tortoise.move(height);
    drawSlantedRoof();
    Tortoise.move(height);
    Tortoise.turn(-90);
    Tortoise.move(20);
    Tortoise.turn(-90);
  }
  private static void drawHouseSlantedRoof(int height)
  {
    Tortoise.setPenColor(PenColors.Grays.LightGray);
    Tortoise.move(height);
    drawSlantedRoof();
    Tortoise.move(height);
    Tortoise.turn(-90);
    Tortoise.move(20);
    Tortoise.turn(-90);
  }
  private static void drawHousePointyRoof(int height)
  {
    Tortoise.setPenColor(PenColors.Grays.LightGray);
    Tortoise.move(height);
    drawPointyRoof();
    Tortoise.move(height);
    Tortoise.turn(-90);
    Tortoise.move(20);
    Tortoise.turn(-90);
  }
  private static void drawHouseFlatRoof(int height)
  {
    Tortoise.setPenColor(PenColors.Grays.LightGray);
    Tortoise.move(height);
    drawFlatRoof();
    Tortoise.move(height);
    Tortoise.turn(-90);
    Tortoise.move(20);
    Tortoise.turn(-90);
  }
  private static void drawBatman()
  {
    // make a Batman Head
    // turn the tortoise 45 degrees to the right --#1
    Tortoise.turn(45);
    // move the tortoise 30 pixels --#2
    Tortoise.move(30);
    // turn the tortoise 135 degrees to the right --#3
    Tortoise.turn(135);
    //  move the tortoise 20 pixels --#4 
    Tortoise.move(20);
    // turn the tortoise 90 degrees to the left --#5
    Tortoise.turn(-90);
    // move the 50 pixels --#6
    Tortoise.move(50);
    // turn the tortoise 135 degrees to the right --#7
    Tortoise.turn(135);
    //move the tortoise 30 pixels --#8
    Tortoise.move(30);
  }
  private static void drawSlantedRoof()
  {
    // make slanted roof
    // turn the tortoise 45 degrees to the right--#1
    Tortoise.turn(45);
    // move the tortoise 30 pixels--#2
    Tortoise.move(30);
    // turn the tortoise 135 degrees to the right--#3
    Tortoise.turn(135);
    //  move the tortoise 20 pixels--#4 
    Tortoise.move(20);
  }
  private static void drawPointyRoof()
  {
    // make a pointy roof
    // turn the tortoise 45 to the right--#1
    Tortoise.turn(45);
    // move the tortoise A pixels--#2
    Tortoise.move(30);
    // turn the tortoise 90 degrees to the right--#3
    Tortoise.turn(90);
    // move the tortoise A pixels--#4
    Tortoise.move(30);
    // turn the tortoise 45 to the right--#5 
    Tortoise.turn(45);
  }
  private static void drawFlatRoof()
  {
    // make flat roof
    Tortoise.turn(90);
    Tortoise.move(30);
    Tortoise.turn(90);
  }
}
