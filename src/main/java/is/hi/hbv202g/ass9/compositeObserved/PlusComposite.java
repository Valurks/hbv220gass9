package is.hi.hbv202g.ass9.compositeObserved;

import java.util.ArrayList;
import java.util.List;

public class PlusComposite implements MathExpression {

    private List<MathExpression> children = new ArrayList<>();

    public double getResult(){
        double result = 0;

        for (MathExpression expression : children) {
            result += expression.getResult();
        }
        return result;
    }

    public void add(MathExpression expression){
        children.add(expression);
    }

    public void remove(MathExpression expression){
        children.remove(expression);
    }

    public List<MathExpression> getChildren(){
        return children;
    }
}
