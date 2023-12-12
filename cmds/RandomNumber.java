package Test.FOrTesting.src.main.test2.cmds;

import Test.FOrTesting.src.main.test2.Loader;
import Test.FOrTesting.src.main.test2.handlers.Handler;

public class RandomNumber implements Handler {
    Loader loader;

    public RandomNumber(Loader loader) {
        this.loader = loader;
    }

    @Override
    public void exe(String s) {
        System.out.println("random number: "+randomRange(1, 10000));
    }
    public static String randomRange(int min, int max) {
        double rnd = Math.random();
        return String.valueOf(min + (int)(rnd * ((max - min) + 1)));
    }
}