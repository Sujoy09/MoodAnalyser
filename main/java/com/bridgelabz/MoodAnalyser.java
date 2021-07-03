package com.bridgelabz;

public class MoodAnalyser {
    public String analyseMood(String message) throws MoodAnalysisException {
        try {
            if (message.contains("SAD"))
                return "SAD";
            else
                return "HAPPY";
        } catch (NullPointerException e) {
            throw new MoodAnalysisException("Please Enter Proper Message");
        }
    }
}
