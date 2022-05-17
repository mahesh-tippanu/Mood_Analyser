package moodanalyser;
public class MoodAnalyserExceptionHandling extends Exception {
          public ExceptionType type;
        //To inform user whether the mood entered is empty or null
        public enum ExceptionType {
            ENTERED_NULL, ENTERED_EMPTY
        }
        public MoodAnalyserExceptionHandling(ExceptionType type, String message) {
            super(message);
            this.type = type;
        }
    }

