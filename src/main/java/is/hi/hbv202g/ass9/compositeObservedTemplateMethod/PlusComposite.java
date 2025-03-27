package is.hi.hbv202g.ass9.compositeObservedTemplateMethod;

public class PlusComposite extends CompositeExpression {
    @Override
    protected int compute() {
        int sum = 0;
        for (MathExpression expr : children) {
            sum += expr.getResult();
        }
        return sum;
    }
}
