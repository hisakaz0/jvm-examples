package main.pattern.command;

public abstract class Command {

    protected Beaker beaker;

    public void setBeaker(Beaker beaker) {
        this.beaker = beaker;
    }

    public abstract void execute();
}
