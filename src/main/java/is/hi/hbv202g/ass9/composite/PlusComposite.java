package is.hi.hbv202g.ass9.composite;

import java.util.ArrayList;
import java.util.List;

public class PlusComposite implements MathExpression {

    private List<MathExpression> children = new ArrayList<>();

    public int getResult(){
        int result = 0;

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
