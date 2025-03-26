package is.hi.hbv202g.ass9.compositeObservedTemplateMethod;

public class PlusComposite extends Composite {

    public int getResult() {
        int result = 0;
        for (MathExpression child : super.children) {
            result += child.getResult();
        }
        return result;
    }

}
