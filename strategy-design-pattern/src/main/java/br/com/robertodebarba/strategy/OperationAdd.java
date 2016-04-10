package br.com.robertodebarba.strategy;

public class OperationAdd implements Strategy {

    @Override
    public int doOperation(final int num1, final int num2) {
        return num1 + num2;
    }

}
