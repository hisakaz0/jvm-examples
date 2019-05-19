package main.pattern.command;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class CommandList extends Command {

    private List<Command> commands = new LinkedList<>();

    @Override
    public void execute() {
        Iterator<Command> iterator = commands.iterator();
        Command command = null;
        while (iterator.hasNext()) {
            command = iterator.next();
            command.execute();
        }
        beaker.note();
    }

    public void addCommand(Command c) {
        commands.add(c);
    }
}
