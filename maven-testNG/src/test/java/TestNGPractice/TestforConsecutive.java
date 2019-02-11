package TestNGPractice;

import org.testng.Assert;
import org.testng.annotations.*;
import java.util.*;

public class TestforConsecutive {

    @Test(priority = 1)
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
        Assert.assertEquals(StringExpec, StringActual, "Error");
    }

    @Test(priority = 2)
    public void inputBlank() {
        CheckforConsecutive chc = new CheckforConsecutive();
        ArrayList<String> StringInput = new ArrayList<String>();
        StringInput.add("");
        chc.checkfunc(StringInput);
        ArrayList<String> StringExpec = new ArrayList<String>();
        StringExpec.add("Input not found");
        ArrayList<String> StringActual = new ArrayList<String>();
        StringActual = chc.checkfunc(StringInput);
        Assert.assertEquals(StringActual, StringExpec, "NO input found");

    }

}
