package TestNGPractice;

import java.util.ArrayList;

public class CheckforConsecutive {

    CheckforConsecutive() {
    }

    public ArrayList<String> checkfunc(ArrayList<String> con) {

        ArrayList<String> result = new ArrayList<String>();
        int counter = 0, parseS = 0, print = 0;
        String word = null;
        char alphabet1, alphabet2;
        for (counter = 0; counter < con.size(); counter++) {
            word = (String) con.get(counter);
            print = 0;
            for (parseS = 0; parseS < word.length(); parseS++) {
                alphabet1 = word.charAt(parseS);
                if ((parseS + 1) > word.length())
                    continue;
                alphabet2 = word.charAt(++parseS);
                if (alphabet1 == alphabet2) {
                    print = 1;
                    break;
                }

            }
            if (print == 1)
                result.add(word);
        }
        System.out.println(result);
        return result;
    }

}