package designPatterns.structural.proxy.commandExecuter;

public interface CommandExecutor {
    void runCommand(String cmd) throws Exception;
}
