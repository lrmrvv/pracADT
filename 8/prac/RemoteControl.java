import java.util.Stack;

public class RemoteControl {
    private Command[] onCommands;
    private Command[] offCommands;
    private Stack<Command> commandHistory;

    public RemoteControl() {
        onCommands = new Command[7];  // 7 кнопок на пульте
        offCommands = new Command[7];
        commandHistory = new Stack<>();

        Command noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPressed(int slot) {
        onCommands[slot].execute();
        commandHistory.push(onCommands[slot]);
    }

    public void offButtonWasPressed(int slot) {
        offCommands[slot].execute();
        commandHistory.push(offCommands[slot]);
    }

    public void undoButtonWasPressed() {
        if (!commandHistory.isEmpty()) {
            commandHistory.pop().undo();
        }
    }
}
