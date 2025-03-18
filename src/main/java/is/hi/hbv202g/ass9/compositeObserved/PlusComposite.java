package is.hi.hbv202g.ass9.compositeObserved;

import java.util.ArrayList;
import java.util.List;

public class PlusComposite implements Observer {

    private List<MathExpression> children = new ArrayList<>();
    private int result;

    public int getResult(){
        result = 0;

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

    public void update() {
        getResult();
    }

    public int getLastObservedResult() {
        return result;
    }
}
