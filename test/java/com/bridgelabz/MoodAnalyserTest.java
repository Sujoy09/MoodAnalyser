package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class MoodAnalyserTest {
    @Test
    public void givenMessageWhenSadShouldReturnSad() {
        ExpectedException exceptionrule = ExpectedException.none();
        exceptionrule.expect(MoodAnalysisException.class);
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = null;
        try {
            mood = moodAnalyser.analyseMood("This is a SAD message");
        } catch (MoodAnalysisException e) {
            e.printStackTrace();
        }
        Assert.assertEquals("SAD", mood);
    }

    @Test
    public void givenMessageWhenNotSadShouldReturnHappy() {
        ExpectedException exceptionrule = ExpectedException.none();
        exceptionrule.expect(MoodAnalysisException.class);
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = null;
        try {
            mood = moodAnalyser.analyseMood("This is a HAPPY message");
        } catch (MoodAnalysisException e) {
            e.printStackTrace();
        }
        Assert.assertEquals("HAPPY", mood);
    }

    @Test
    public void givenNullMoodShouldThrowException() {
        ExpectedException exceptionrule = ExpectedException.none();
        exceptionrule.expect(MoodAnalysisException.class);
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = null;
        try {
            mood = moodAnalyser.analyseMood("");
        } catch (MoodAnalysisException e) {
            Assert.assertEquals("Please Enter Proper Message",e.getMessage());
        }
    }
}