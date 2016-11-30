package org.teachingkidsprogramming.section03ifs.Kata_and_Variations;

import java.awt.Color;

import org.teachingextensions.approvals.lite.util.ThreadUtils;
import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.Turtle.Animals;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;
import org.teachingextensions.logo.utils.EventUtils.MessageBox;

public class ChooseYourOwnAdventureVariations_01
{
  public static void main(String[] args)
  {
    Tortoise.setAnimal(Animals.Unicorn);
    startStory();
  }
  private static void startStory()
  {
    tellMoreStory("One morning the Luciano woke up in a dream.");
    animateStartStory();
    String action = askAQuestion("Do you want to 'open your eyes' or 'explore' the dream?");
    if ("open your eyes".equalsIgnoreCase(action))
    {
      openYourEyes();
    }
    else if ("explore".equalsIgnoreCase(action))
    {
      approachOoze();
    }
    else
    {
      endStory();
    }
  }
  private static void endStory()
  {
    MessageBox.showMessage("You suck at reading directions. You can't play this game. Loser.");
  }
  private static void approachOoze()
  {
    MessageBox.showMessage("You approach Donald Trump. Worried that you will get deported, you throw a bucket.");
    String input = askAQuestion("Do you want to throw the bucket 'at his face' or 'at the floor and run'?");
    if ("at the floor and run".equalsIgnoreCase(input))
    {
      escapePlan();
    }
    if ("at his face".equalsIgnoreCase(input))
    {
      trumpAbuse();
    }
    else
    {
      endStory();
    }
  }
  private static void trumpAbuse()
  {
    MessageBox.showMessage("After throwing the bucket at Trumps face, the secret service starts chasing you.");
    String input = askAQuestion(
        "As the secret service starts to chase you, do you...'Scream, Hilary is Better!' or 'Surrender'?");
    if ("Surrender".equalsIgnoreCase(input))
    {
      MessageBox.showMessage("You spend the rest of your life in jail reading books about Trump's success.");
    }
    if ("Scream, Hilary is Better!".equalsIgnoreCase(input))
    {
      startStory();
    }
    else
    {
      endStory();
    }
  }
  private static void escapePlan()
  {
    MessageBox.showMessage("As you are running, you run into Gary Johnson.");
    String input = askAQuestion("Do you want to make America Great Again?  'Yes' or 'That's dumb'");
    if ("Yes".equalsIgnoreCase(input))
    {
      MessageBox
          .showMessage("Trump Supporter! You live out the rest of your life making dinner for President Trump.");
    }
    else if ("That's dumb".equalsIgnoreCase(input))
    {
      MessageBox.showMessage(
          "Good Answer!  You live out the rest of your life with free college and eating inn and out!");
    }
    else
    {
      endStory();
    }
  }
  private static void openYourEyes()
  {
    MessageBox.showMessage("You wake up and the rest of your day sucks. The end.");
  }
  private static void animateStartStory()
  {
    Tortoise.show();
    Color color = PenColors.Grays.Black;
    for (int i = 0; i < 25; i++)
    {
      Tortoise.getBackgroundWindow().setColor(color);
      color = PenColors.lighten(color);
      ThreadUtils.sleep(100);
    }
  }
  private static void tellMoreStory(String message)
  {
    MessageBox.showMessage(message);
  }
  private static String askAQuestion(String question)
  {
    String answer = MessageBox.askForTextInput(question);
    return answer;
  }
}