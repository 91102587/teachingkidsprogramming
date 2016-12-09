package org.teachingkidsprogramming.section06modelviewcontroller;

import org.teachingextensions.logo.utils.EventUtils.MessageBox;

public class AdLibs
{
  public static void main(String[] args)
  {
    String currentAdverb = MessageBox.askForTextInput("Enter an adverb");
    String currentEdVerb = MessageBox.askForTextInput("Enter a verb ending in ed");
    //  Ask the user to enter a body part, save it as currentBodyPart --#6
    String currentBodyPart = MessageBox.askForTextInput("Enter a body part");
    String currentStory = "Today "; //Model??
    currentStory = currentStory + "I woke " + currentAdverb + ", "; //Controller??
    currentStory = currentStory + "Then I " + currentEdVerb + " ";
    //  Add the words "my " + currentBodyPart + ". " to the current story --#7
    currentStory = currentStory + "my " + currentBodyPart + ", ";
    MessageBox.showMessage(currentStory); //View
  }
}