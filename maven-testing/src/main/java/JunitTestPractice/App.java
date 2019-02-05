package JunitTestPractice;

import java.util.ArrayList;

/**
 * Hello world!
 */
public class App {
    public App() {
    }

    /**
     * Says hello to the world.
     * 
     * @param args The arguments of the program.
     */
    public String check(String str) {
        return str;
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
        ArrayList<String> name = new ArrayList<String>();
        name.add("Hello");
        name.add("World");
        System.out.println(name);

    }
}
