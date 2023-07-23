package designPatterns.structural.proxy.commandExecuter;

import java.io.IOException;

public class CommandExecutorImpl implements CommandExecutor{

    @Override
    public void runCommand(String cmd) throws IOException {

        // Heavy Implementation

        Runtime.getRuntime().exec(cmd);
        System.out.println(cmd +" command executed");
    }
}
