package Test.FOrTesting.src.main.test2.handlers;

import Test.FOrTesting.src.main.test2.Loader;
import Test.FOrTesting.src.main.test2.cmds.AddToMemory;
import Test.FOrTesting.src.main.test2.cmds.HelloCmd;
import Test.FOrTesting.src.main.test2.cmds.RandomNumber;
import Test.FOrTesting.src.main.test2.cmds.ShowUsers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MessageHandler implements MessageEvent {
    Map<String, Handler> reg = new HashMap<>();
    List<String> cmdNames = new ArrayList<>();

    public MessageHandler(Loader loader) {
        reg("/hello", new HelloCmd(loader));
        reg("/random", new RandomNumber(loader));
        reg("/add", new AddToMemory(loader));
        reg("/show", new ShowUsers(loader));

        System.out.println("\nДоступные команды: "+cmdNames.toString().replace("[", "").replace("]", ""));
    }

    void reg(String name, Handler handler) {
        reg.put(name, handler);
        cmdNames.add(name);
    }

    @Override
    public void onMessage(String s) {
        String cmd = s.split(" ")[0];
        if (reg.containsKey(cmd)) {
            reg.get(cmd).exe(s);
        } else {
            System.out.println("Доступные команды: "+cmdNames.toString().replace("[", "").replace("]", ""));
        }
    }
}