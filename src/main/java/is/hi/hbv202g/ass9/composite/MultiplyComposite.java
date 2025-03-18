package is.hi.hbv202g.ass9.composite;

import java.util.ArrayList;
import java.util.List;

public class MultiplyComposite implements MathExpression {

    private final List<MathExpression> children = new ArrayList<>();

    public double getResult() {
        double result = 0;
        for (MathExpression child : children) {
            result *= child.getResult();
        }
        return result;
    }

    public void add(MathExpression mathExpression) {
        children.add(mathExpression);
    }

    public void remove(MathExpression mathExpression) {
        children.remove(mathExpression);
    }

    public List<MathExpression> getChildren() {
        return children;
    }
}
