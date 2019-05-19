package main.pattern.command;

public class MakeSaltWaterCommand extends Command {

    @Override
    public void execute() {
        beaker.mix();
        beaker.writeOneLine("Experiment: Make salt water");
        beaker.note();
    }
}
