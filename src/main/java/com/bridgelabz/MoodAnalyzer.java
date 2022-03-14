package com.bridgelabz;

/**
 * Given a Message, ability to analyse and respond Happy or Sad Mood
 * Create MoodAnalyser Object - Call analyseMood function with message
 * as parameter return Happy or Sad mood
 */

public class MoodAnalyzer {
    public String analyzeMood(String message) {
        if(message.toLowerCase().contains("sad"))
            return "SAD";
        else
            return "HAPPY";
    }

    public static void main(String[] args) {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        String mood = moodAnalyzer.analyzeMood("I am in happy mood");
        System.out.println(mood);
    }
}
