package Test.FOrTesting.src.main.test2.cmds;

import Test.FOrTesting.src.main.test2.handlers.Handler;
import Test.FOrTesting.src.main.test2.Loader;

public class HelloCmd implements Handler {
    Loader loader;

    public HelloCmd(Loader bot) {
        this.loader = bot;
    }

    @Override
    public void exe(String s) {
        System.out.println("Вы вызвали приветсвие");
    }
}
