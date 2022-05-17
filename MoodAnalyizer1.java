package moodanalyser;
public class MoodAnalyizer1 {
        private String message;

    public MoodAnalyizer1(String message) {
        this.message = message;
    }
    public String analyseMood() throws MoodAnalyserExceptionHandling {
            try {
                if (message.length() == 0)
                    throw new MoodAnalyserExceptionHandling(MoodAnalyserExceptionHandling.ExceptionType.ENTERED_EMPTY , "Please enter proper message!");

                if (message.contains("sad"))
                    return "SAD";
                else
                    return "HAPPY";
            } catch(NullPointerException e) {
                throw new MoodAnalyserExceptionHandling(MoodAnalyserExceptionHandling.ExceptionType.ENTERED_NULL , "Please enter proper message!");
            }
        }
    }
