package Test.FOrTesting.src.main.test2.cmds;

import Test.FOrTesting.src.main.test2.Loader;
import Test.FOrTesting.src.main.test2.Memory;
import Test.FOrTesting.src.main.test2.handlers.Handler;

import java.util.Arrays;

public class AddToMemory implements Handler {
    Loader loader;

    public AddToMemory(Loader loader) {
        this.loader = loader;
    }

    @Override
    public void exe(String s) {
        String[] args = s.split(" ");
        String id = randomRange(1, 100), mess = "параметры не указаны: /add <имя>\n";

        if (Memory.hasUser(id)) {
            mess = "Юзер: %s уже был создан ранее, поэтому вы изменили его имя на: %s\n".formatted(id, args[1]);
        }

        if (args.length > 1) {
            if (!Memory.hasUser(id)) {
                mess = "Добавлен юзер: %s, имя: %s\n".formatted(id, args[1]);
            }
            Memory.addUser(id, args[1]);
        }
        System.out.printf(mess);
    }
    public String randomRange(int min, int max) {
        double rnd = Math.random();
        return String.valueOf(min + (int)(rnd * ((max - min) + 1)));
    }
}
