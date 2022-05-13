package MoodAnalyizer;
import moodanalyser.MoodAnalyser;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Test;
public class MoodAnalyserTest {
        @Test
        public void givenMessage_WhenProper_ShouldReturnSad(){
            MoodAnalyser moodAnalyser = new MoodAnalyser(null);
            String result = moodAnalyser.analyseMood();
            System.out.println(result);
            Assertions.assertEquals("SAD" , result);
        }
        @Test
        public void givenMessage_WhenProper_ShouldReturnHappy(){
            MoodAnalyser moodAnalyser = new MoodAnalyser(null);
            String result = moodAnalyser.analyseMood();
            System.out.println(result);
            Assertions.assertEquals("SAD" , result);
        }
    }




