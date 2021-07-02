package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
    @Test
    public void givenMessageWhenSadShouldReturnSad() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("This is a SAD message");
        Assert.assertEquals("SAD", mood);
    }

    @Test
    public void givenMessageWhenNotSadShouldReturnHappy() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("This is a HAPPY message");
        Assert.assertEquals("HAPPY", mood);
    }
}