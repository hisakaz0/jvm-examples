package main.pattern.interpreter;

public class Expression implements Operand {

    private Operator operator;

    public Expression(Operator operator) {
        this.operator = operator;
    }

    @Override
    public String getOperandString() {
        return operator.execute().getOperandString();
    }
}
