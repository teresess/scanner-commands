package Test.FOrTesting.src.main.test2.cmds;

import Test.FOrTesting.src.main.test2.Loader;
import Test.FOrTesting.src.main.test2.Memory;
import Test.FOrTesting.src.main.test2.handlers.Handler;

public class ShowUsers implements Handler {
    Loader loader;
    @Override
    public void exe(String s) {
        Memory.getUsers().forEach((key, value) -> {
            System.out.println("userId: %s, name: %s".formatted(key, value));
        });
    }
    public ShowUsers(Loader loader) {
        this.loader = loader;
    }
}
