package moodanalyser;

public class MoodAnalyserExceptionHanding extends Exception {
          ExceptionType type;

        //To inform user whether the mood entered is empty or null
        enum ExceptionType {
            ENTERED_NULL, ENTERED_EMPTY
        }

        public MoodAnalyserExceptionHanding(ExceptionType type, String message) {
            super(message);
            this.type = type;
        }
    }

