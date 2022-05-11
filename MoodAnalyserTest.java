package MoodAnalyizer;
import moodanalyser.MoodAnalyser;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Test;
public class MoodAnalyserTest {
    @Test
    public void givenMessage_WhenProper_ShouldReturnSad() {
        MoodAnalyser moodAnalyser=new MoodAnalyser("I am in sad mood");
        String result=moodAnalyser.analyseMood();
        System.out.print(result);
        Assertions.assertEquals(result, "SAD");
    }
}