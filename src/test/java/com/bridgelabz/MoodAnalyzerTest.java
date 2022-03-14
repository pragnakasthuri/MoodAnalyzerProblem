package com.bridgelabz;
/**
 * Given “I am in Sad Mood” message Should Return SAD
 */

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyzerTest {

    @Test
    void givenMessage_WhenSad_ShouldReturnSad() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        String mood = moodAnalyzer.analyzeMood("I am in any mood");
        Assertions.assertEquals("HAPPY", mood);
    }
}



