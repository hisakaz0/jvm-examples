package main.pattern.command;

public class AddWaterCommand extends Command {

    private static Integer AMOUNT_ADD_WATER = 10;

    @Override
    public void execute() {
        while (beaker.isNotSaltMelted()) {
            beaker.addWater(AMOUNT_ADD_WATER);
            beaker.mix();
        }
        beaker.writeOneLine(String.format("Experiment: add water of %d ml.",
                AMOUNT_ADD_WATER));
    }
}
