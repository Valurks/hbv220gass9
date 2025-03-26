package is.hi.hbv202g.ass9.compositeObservedTemplateMethod;

public class MultiplyComposite extends Composite {

    public int startingValue() {
        return 1;
    }

    public int calculate(int result, int childResult) {
        return result * childResult;
    }
}
