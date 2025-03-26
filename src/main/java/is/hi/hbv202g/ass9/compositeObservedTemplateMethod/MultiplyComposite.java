package is.hi.hbv202g.ass9.compositeObservedTemplateMethod;

public class MultiplyComposite extends Composite {

    public int getResult() {
        int result = 1;
        for (MathExpression child : super.children) {
            result *= child.getResult();
        }
        return result;
    }
}
