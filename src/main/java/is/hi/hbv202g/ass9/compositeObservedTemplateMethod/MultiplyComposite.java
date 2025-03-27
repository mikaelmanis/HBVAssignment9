package is.hi.hbv202g.ass9.compositeObservedTemplateMethod;

public class MultiplyComposite extends CompositeExpression {
    @Override
    protected int compute() {
        if (children.isEmpty()) return 0; // Edge case
        int product = 1;
        for (MathExpression expr : children) {
            product *= expr.getResult();
        }
        return product;
    }
}
