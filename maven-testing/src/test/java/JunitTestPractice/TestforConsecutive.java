package JunitTestPractice;

import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.*;

public class TestforConsecutive {

    @Test
    public void testforcheck() {

        ArrayList<String> StringInput = new ArrayList<String>();
        ArrayList<String> StringActual = new ArrayList<String>();
        ArrayList<String> StringExpec = new ArrayList<String>();
        CheckforConsecutive obj = new CheckforConsecutive();
        StringInput.add("Hello");
        StringInput.add("Dome");
        StringInput.add("winner");
        StringExpec.add("Hello");
        StringExpec.add("winner");
        StringActual = obj.checkfunc(StringInput);
        assertEquals("Error", StringExpec, StringActual);
    }

}
