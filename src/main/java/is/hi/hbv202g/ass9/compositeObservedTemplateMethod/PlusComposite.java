package is.hi.hbv202g.ass9.compositeObservedTemplateMethod;

public class PlusComposite extends Composite {

    public int startingValue() {
        return 0;
    }

    public int calculate(int result, int childResult) {
        return result + childResult;
    }

}
