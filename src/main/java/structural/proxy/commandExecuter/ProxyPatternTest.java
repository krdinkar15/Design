package structural.proxy.commandExecuter;

public class ProxyPatternTest {
    public static void main(String[] args) {
        CommandExecutor commandExecutor=new CommandExecutorProxy("kamal","raj");
        try {
            System.out.println(System.getProperty("user.dir"));
            commandExecutor.runCommand("ls -lrth");
            commandExecutor.runCommand(" rm -rf file.text");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
