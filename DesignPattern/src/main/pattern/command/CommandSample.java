package main.pattern.command;

public class CommandSample implements Runnable{
    @Override
    public void run() {
        Command addSalt = new AddSaltCommand();
        Command addWater = new AddWaterCommand();
        Command makeSaltWater = new MakeSaltWaterCommand();

        addSalt.setBeaker(new Beaker(100.0, 0.0));
        addWater.setBeaker(new Beaker(0.0, 10.0));
        makeSaltWater.setBeaker(new Beaker(90.0, 10.0));

        addSalt.execute();
        addWater.execute();
        makeSaltWater.execute();
    }
}
