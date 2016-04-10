package br.com.robertodebarba.strategy;

public class OperationMultiply implements Strategy {

    @Override
    public int doOperation(final int num1, final int num2) {
        return num1 * num2;
    }

}
