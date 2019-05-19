package main.pattern.command;

public class CommandSample2 implements Runnable {
    @Override
    public void run() {
        // ex.1
//        Command addSalt = new AddSaltCommand();
//        Command makeSaltWater = new MakeSaltWaterCommand();
//        makeSaltWater.setBeaker(new Beaker(100.0, 10.0));
//        makeSaltWater.execute();
//        addSalt.setBeaker(makeSaltWater.beaker);
//        addSalt.execute();

        // ex.2
        Command addSalt = new AddSaltCommand();
        Command makeSaltWater = new MakeSaltWaterCommand();
        Beaker beaker = new Beaker(90.0, 10.0);
        makeSaltWater.setBeaker(beaker);
        addSalt.setBeaker(beaker);
        CommandList list = new CommandList();
        list.addCommand(makeSaltWater);
        list.addCommand(addSalt);
        list.execute();
    }
}
