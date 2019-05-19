package main.pattern.command;

public class AddSaltCommand extends Command {

    private static Integer AMOUNT_ADD_SALT = 1;

    @Override
    public void execute() {
        while (beaker.isSaltMelted()) {
            beaker.addSalt(AMOUNT_ADD_SALT);
            beaker.mix();
        }
        beaker.writeOneLine(String.format("Experiment: add salt of %d g.",
                AMOUNT_ADD_SALT));
        beaker.note();
    }
}
