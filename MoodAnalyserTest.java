package MoodAnalyizer;
import moodanalyser.MoodAnalyser;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Test;
public class MoodAnalyserTest {
    @Test
    public void givenMessage_WhenProper_ShouldReturnSad() {
        MoodAnalyser moodAnalyser=new MoodAnalyser();
        String result=moodAnalyser.analyseMood("User is sad");
        System.out.print(result);
        Assertions.assertEquals(result, "SAD");
    }
    @Test
    public void givenMessage_WhenProper_ShouldReturnHappy() {
        MoodAnalyser moodAnalyser=new MoodAnalyser();
        String result=moodAnalyser.analyseMood("User is Happy");
        System.out.print(result);
        Assertions.assertEquals(result, "HAPPY");
    }
}
