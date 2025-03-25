package is.hi.hbv202g.ass9;

import is.hi.hbv202g.ass9.composite.*;

public class CompositeMain {

	/**
	 * The entry point of the program.
	 * This method demonstrates a simple arithmetic expression using a composite design pattern.
	 * It builds the expression: (1 + 2) * 4 using {NumberLeaf}, {PlusComposite},
	 * Example output:
	 * The result of (1+2)*4 is: 12
	 * @param args command-line arguments (not used in this example)
	 */
	public static void main(String[] args) {
		NumberLeaf number1 = new NumberLeaf(1);
		NumberLeaf number2 = new NumberLeaf(2);
		NumberLeaf number4 = new NumberLeaf(4);

		PlusComposite plusComposite = new PlusComposite();
		plusComposite.add(number1);
		plusComposite.add(number2);

		MultiplyComposite multiplyComposite = new MultiplyComposite();
		multiplyComposite.add(number4);
		multiplyComposite.add(plusComposite);

		System.out.println("The result of ("+number1.getResult()+"+"+number2.getResult()+")*"+number4.getResult()+" is: "+ multiplyComposite.getResult());
	}
}
