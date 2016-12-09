package org.teachingkidsprogramming.section01forloops.Variations;

import org.teachingextensions.logo.utils.EventUtils.MessageBox;

public class Random_Variation
{
  public static void main(String[] args) throws Exception
  {
    chooseName();
  }
  private static void chooseName()
  {
    //
    String input = chooseName(
        "Hi! What would you like to be called during this game? Kam, Geneda, Sydney, Marissa, or Sadie?");
    if ("Kam".equalsIgnoreCase(input))
    {
      MessageBox.showMessage("Okay Kam lets jump into the story");
      beginStory();
    }
    if ("Geneda".equalsIgnoreCase(input))
    {
      MessageBox.showMessage("Okay Geneda lets jump into the story");
      beginStory();
    }
    if ("Sydney".equalsIgnoreCase(input))
    {
      MessageBox.showMessage("Okay Sydney lets jump into the story");
      beginStory();
    }
    if ("Marissa".equalsIgnoreCase(input))
    {
      MessageBox.showMessage("Okay Marissa lets jump into the story");
      beginStory();
    }
    if ("Sadie".equalsIgnoreCase(input))
    {
      MessageBox.showMessage("Okay Sadie lets jump into the story");
      beginStory();
    }
    // if the user chooses anything else tell them "im sorry, that name was not a given answer, would you like to try again"
    //  and give them the choice to pick another name or to end the story --#8
    else
    {
      MessageBox
          .askForTextInput("I am sorry that name was not given. Would you like to 'try again' or 'end story'?");
      if ("end story".equalsIgnoreCase(input))
      {
        endStory(input);
      }
      if ("try again".equalsIgnoreCase(input))
      {
        beginStory();
      }
      else
      {
        endStory(input);
      }
    }
  }
  private static void endStory(String input)
  {
    // endStory recipe bellow --#18.1
    // start of endStory recipe --#18.2
    MessageBox
        .askForTextInput("This is the end of the story. Goodbye. Type 'Run Again' if you would like to try again");
    if ("Run again".equalsIgnoreCase(input))
    {
      beginStory();
    }
    else
    {
      endStory(input);
    }
    // --------
    // end of endStory recipe --#18.3
  }
  private static void beginStory()
  {
    MessageBox.showMessage(
        "One day you were at lunch and you stumbled upon some newely found drama that has been going on between a threesome of 8th graders.");
    // Ask the user "do you want to be petty and 'get in the drama' or do you want to 'sit back, relax,
    // pop some popcorn, and enjoy the show' or would you like to 'not be a part of this stupidness, this is not
    //  what I come to school for'" --#12
    // if the user chooses "get in the drama" ask the user "are you sure, if you do this there is a chance that
    // you will get caught and into trouble" --#13
    // if they say "yes I am sure" start the "beefing story" --#14
    // beefingStory recipe bellow --#15.1
    // start of beefingStory recipe --#15.2
    // --------
    // dramaStory recipe bellow --#23.1
    // start the dramaStory --#23.2
    // -------
    // tell the user "you stumble upon a bunch of drama at lunch between Gio, Nadia, and Tyler" --#20
    // tell the user "you want to be included in the drama, so you start talking about people
    // and making assumptions" --#21
    // ask the user if they would like to start making assumptions about "tyler", "nadia" or "gio" --#22
    // end of dramaStory recipe --#23.3
    //
    // end of beefingStory recipe --#15.3
    // if the user chooses "sit back, relax,pop some popcorn, and enjoy the show" tell the user
    // "good choice, that is what I would do" and start the "funny drama story" --#16
    // funnyDramaStory recipe bellow --
    // start of funnyDramaStory recipe --
    // -------
    // end of funnyDramaStory recipe --
    // or if the user chooses "not be a part of this stupidness, this is not what 
    // I come to school for." --#24
    //  tell the user "good choice. You are a good child. YOU GO GLEN COCO!" and end the story --#17
    // 
  }
  private static String chooseName(String question)
  {
    String answer = MessageBox.askForTextInput(question);
    return answer;
  }
}