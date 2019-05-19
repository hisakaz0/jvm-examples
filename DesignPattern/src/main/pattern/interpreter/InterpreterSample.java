package main.pattern.interpreter;

public class InterpreterSample implements Runnable {
    @Override
    public void run() {
        Operand op1 = new Ingredient("noodle");
        Operand op2 = new Ingredient("powder soup");
        Operand op3 = new Expression(new Plus(op1, op2));
        Operand op4 = new Expression(new Wait(3, op3));
        Operand op5 = new Ingredient("liquid soup");
        Operand res = new Expression(new Plus(op4, op5));
        System.out.println(res.getOperandString());
    }
}
