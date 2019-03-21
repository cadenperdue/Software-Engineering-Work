public class DisplayLog extends Command{
    private RemoteControl controller;
    public DisplayLog(RemoteControl controller){
        this.controller = controller;
    }

    public void execute(){
        commandName = "display log";
        for(int i = 0; i < controller.commandLog.size(); i++)
        {
            System.out.println(controller.commandLog.get(i).toString());
        }
    }
}
