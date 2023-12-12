package Test.FOrTesting.src.main.test2;

import Test.FOrTesting.src.main.test2.handlers.MessageHandler;

import java.util.Scanner;

public class Loader {
    MessageHandler messageHandler;
    Memory memory;
    public Loader() {

        memory = new Memory();
        messageHandler = new MessageHandler(this);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String s = scanner.nextLine();
            messageHandler.onMessage(s);
        }
    }
    public Memory getMemory() {
        return memory;
    }
}
