package is.hi.hbv202g.ass9.compositeObserved;

import java.util.ArrayList;
import java.util.List;

public class MultiplyComposite implements MathExpression, Observer {
    private List<MathExpression> children = new ArrayList<>();
    private int lastObservedResult = 1;

    public void add(MathExpression mathExpression) {
        children.add(mathExpression);
        if (mathExpression instanceof Observable) {
            ((Observable) mathExpression).addObserver(this);
        }
    }

    @Override
    public int getResult() {
        if (children.isEmpty()) return 0;
        int result = 1;
        for (MathExpression mathExpression : children) {
            result *= mathExpression.getResult();
        }
        return result;
    }

    @Override
    public void update() {
        lastObservedResult = getResult();
        System.out.println("MultiplyComposite: update");
    }

    public int getLastObservedResult() {
        return lastObservedResult;
    }
}
