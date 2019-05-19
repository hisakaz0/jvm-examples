package main.pattern.interpreter;

public class Wait implements Operator {

    private Integer minutes;
    private Operand op;

    public Wait(Integer minutes, Operand op) {
        this.minutes = minutes;
        this.op = op;
    }

    @Override
    public Operand execute() {
        return new Ingredient(String.format("%s is waited in %d minutes", op.getOperandString(), minutes));
    }
}
