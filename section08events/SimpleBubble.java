package org.teachingkidsprogramming.section08events;

import org.teachingextensions.WindowUtils.ProgramWindow;
import org.teachingextensions.approvals.lite.util.NumberUtils;
import org.teachingextensions.logo.utils.ColorUtils.ColorWheel;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;
import org.teachingextensions.logo.utils.EventUtils.MouseLeftClickListener;
import org.teachingextensions.logo.utils.LineAndShapeUtils.Circle;

public class SimpleBubble implements MouseLeftClickListener
{
  //field
  private ProgramWindow programWindow;
  public SimpleBubble()
  {
    programWindow = new ProgramWindow("My Bubble");
    programWindow.setWindowVisible(true);
    programWindow.addMouseLeftClickListener(this);
    //
    prepareColorPalette();
  }
  private void prepareColorPalette()
  {
    ColorWheel.addColor(PenColors.Purples.Purple);
    ColorWheel.addColor(PenColors.Blues.LightSteelBlue);
    ColorWheel.addColor(PenColors.Blues.Blue);
    ColorWheel.addColor(PenColors.Blues.DarkBlue);
  }
  @Override
  public void onLeftMouseClick(int x, int y)
  {
    //     createBubble (recipe below) --#8.1
    //     ------------- Recipe for createBubble --#8.2
    //     Remove previous bubbles from your program window --#9
    int radius = NumberUtils.getRandomInt(10, 5000);
    Circle circle = new Circle(radius, ColorWheel.getNextColor());
    //     Move the center of the bubble to the current position of the mouse on the window --#3
    circle.setCenter(x, y);
    programWindow.add(circle);
    //    ------------- End of createBubble recipe --#8.3
  }
  public static void main(String[] args)
  {
    new SimpleBubble();
  }
}