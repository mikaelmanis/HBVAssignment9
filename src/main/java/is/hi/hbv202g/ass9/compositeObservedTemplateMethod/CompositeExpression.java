package is.hi.hbv202g.ass9.compositeObservedTemplateMethod;

import java.util.ArrayList;
import java.util.List;

public abstract class CompositeExpression implements MathExpression, Observer {
    protected List<MathExpression> children = new ArrayList<>();
    protected int lastObservedResult;

    public void add(MathExpression expr) {
        children.add(expr);
        if (expr instanceof Observable) {
            ((Observable) expr).addObserver(this);
        }
    }

    @Override
    public void update() {
        lastObservedResult = compute();
        System.out.println(getClass().getSimpleName() + " updated: " + lastObservedResult);
    }

    public int getLastObservedResult() {
        return lastObservedResult;
    }

    @Override
    public int getResult() {
        return compute();
    }

    protected abstract int compute();

}

