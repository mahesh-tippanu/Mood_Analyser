package MoodAnalyizer;
import moodanalyser.MoodAnalyser;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Test;
public class MoodAnalyserTest {
    @Test
    public void givenMessage_WhenProper_ShouldReturnSad() {
        MoodAnalyser moodAnalyser=new MoodAnalyser();
        String result=moodAnalyser.analyseMood("I am in sad mood");
        System.out.print(result);
        Assertions.assertEquals(result, "SAD");
    }
  
}
