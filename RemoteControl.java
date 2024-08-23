// RemoteControl class
public class RemoteControl {
    private Command[] commands;
    private int currentCommand = 0;

    public RemoteControl() {
        commands = new Command[10];
    }

    public void setCommand(Command command) {
        commands[currentCommand] = command;
    }

    public void executeCommand() {
        commands[currentCommand].execute();
        currentCommand++;
    }

    public void undoLastCommand() {
        if (currentCommand > 0) {
            commands[currentCommand - 1].undo();
            currentCommand--;
        }
    }
}