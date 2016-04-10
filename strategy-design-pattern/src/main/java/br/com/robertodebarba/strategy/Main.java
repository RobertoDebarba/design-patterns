package br.com.robertodebarba.strategy;

public class Main {

    public static void main(final String[] args) {
	final OperationContext add = new OperationContext(new OperationAdd());
	System.out.println("1 + 2 = " + add.executeStrategy(1, 2));

	final OperationContext subtract = new OperationContext(new OperationSubtract());
	System.out.println("3 - 1 = " + subtract.executeStrategy(3, 1));

	final OperationContext multiply = new OperationContext(new OperationMultiply());
	System.out.println("4 * 4 = " + multiply.executeStrategy(4, 4));
    }

}
