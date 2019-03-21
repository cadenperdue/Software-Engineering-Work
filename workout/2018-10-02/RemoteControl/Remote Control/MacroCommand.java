public class MacroCommand extends Command{
    Command[] commands;
    String commandName;
    public MacroCommand(String commandName, Command[] commands){
        this.commands = commands;
        this.commandName = commandName;
    }

    public void execute(){
        for(int i = 0; i < commands.length; i++)
        {
            commands[i].execute();
        }
    }
}

