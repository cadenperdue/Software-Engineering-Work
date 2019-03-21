public abstract class Command {
    protected String commandName;
	public abstract void execute();
    public String toString()
    {
        return commandName;
    }
}
