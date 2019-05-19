package main.pattern.interpreter;

public class Ingredient implements Operand {

    private String operandString;

    public Ingredient(String operandString) {
        this.operandString = operandString;
    }

    @Override
    public String getOperandString() {
        return operandString;
    }
}
