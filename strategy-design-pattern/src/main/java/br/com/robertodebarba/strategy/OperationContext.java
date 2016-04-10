package br.com.robertodebarba.strategy;

public class OperationContext {

    private final Strategy strategy;

    public OperationContext(final Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(final int num1, final int num2) {
        return this.strategy.doOperation(num1, num2);
    }

}
