package is.hi.hbv202g.ass9.compositeObserved;

public class NumberLeaf implements MathExpression {

    private final int value;

    public NumberLeaf(int value) {
        this.value = value;
    }

    public int getResult() {
        return value;
    }
    public void setValue(int value) {
    	this.value = value;
    }
}
