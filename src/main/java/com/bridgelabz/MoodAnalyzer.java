package com.bridgelabz;

/**
 * Given “I am in Sad Mood” message Should Return SAD
 */

public class MoodAnalyzer {
    public String analyzeMood(String message) {
        if (message.toLowerCase().contains("sad"))
            return "SAD";
        else
            return "HAPPY";
    }
}


