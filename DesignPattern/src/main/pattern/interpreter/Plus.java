package main.pattern.interpreter;

public class Plus implements Operator {

    private Operand op1;
    private Operand op2;

    public  Plus(Operand op1, Operand op2) {
        this.op1 = op1;
        this.op2 = op2;
    }

    @Override
    public Operand execute() {
        return new Ingredient(String.format("%s + %s",
                op1.getOperandString(), op2.getOperandString()));
    }
}
