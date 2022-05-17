package MoodAnalyizer;
import moodanalyser.MoodAnalyizer1;
import moodanalyser.MoodAnalyserExceptionHandling;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class MoodAnalyserTest {
    @Test
    public void givenMessage_WhenProper_ShouldReturnSad() {
        MoodAnalyizer1 moodAnalyser = new MoodAnalyizer1(null);
        String mood;
        try {
            mood = moodAnalyser.analyseMood();
            Assertions.assertEquals("SAD", mood);
        } catch (MoodAnalyserExceptionHandling e) {
            e.printStackTrace();
        }
    }
    @Test
    public void givenMessage_WhenProper_ShouldReturnHappy() {
        MoodAnalyizer1 moodAnalyser = new MoodAnalyizer1(null);
        try {
            moodAnalyser.analyseMood();
        } catch (MoodAnalyserExceptionHandling e) {
            System.out.println(e);
            System.out.println(e.type);
            Assertions.assertEquals(MoodAnalyserExceptionHandling.ExceptionType.ENTERED_NULL, e.type);
        }
    }
    @Test
    public void testMoodAnalysis_whenMoodIsNull_ShouldThrowException() {
        MoodAnalyizer1 moodAnalyser = new MoodAnalyizer1(null);
        try {
            moodAnalyser.analyseMood();
        } catch (MoodAnalyserExceptionHandling e) {
            System.out.println(e);
            System.out.println(e.type);
            Assertions.assertEquals(MoodAnalyserExceptionHandling.ExceptionType.ENTERED_NULL, e.type);
        }
    }
    @Test
    public void testMoodAnalysis_whenMoodIsEmpty_ShouldThrowException() {
        MoodAnalyizer1 moodAnalyzer = new MoodAnalyizer1("");
        try {
            moodAnalyzer.analyseMood();
        } catch (MoodAnalyserExceptionHandling e) {
            System.out.println(e);
            System.out.println(e.type);
            Assertions.assertEquals(MoodAnalyserExceptionHandling.ExceptionType.ENTERED_EMPTY , e.type);
        }
    }





}


