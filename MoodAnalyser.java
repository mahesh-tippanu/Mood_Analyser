package moodanalyser;
public class MoodAnalyser {
    public String  analyseMood(String message) {
        if(message.contains("sad")) {
            return "SAD";
        }
        else if(message.contains("Happy"))
        {
            return "HAPPY";
        }
        else
        {
            return null;
        }

    }

}
