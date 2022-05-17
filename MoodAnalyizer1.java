package moodanalyser;
public class MoodAnalyizer1 {
        private String message;
        //Default Constructor
        public void MoodAnalyzer1() {
        }
        //Parameterized Constructor
        public void MoodAnalyzer1(String message) {
            this.message = message;
        }
        //Handle Customized Exception using try-catch block
        public String analyseMood() throws MoodAnalyserExceptionHanding {
            try {
                if (message.length() == 0)
                    throw new MoodAnalyserExceptionHanding(MoodAnalyserExceptionHanding.ExceptionType.ENTERED_EMPTY , "Please enter proper message!");

                if (message.contains("sad"))
                    return "SAD";
                else
                    return "HAPPY";
            } catch(NullPointerException e) {
                throw new MoodAnalyserExceptionHanding(MoodAnalyserExceptionHanding.ExceptionType.ENTERED_NULL , "Please enter proper message!");
            }
        }
    }
