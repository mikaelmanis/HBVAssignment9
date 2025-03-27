package is.hi.hbv202g.ass9.composite;

import java.util.ArrayList;
import java.util.List;

public class MultiplyComposite implements MathExpression {
    private List<MathExpression> children = new ArrayList<>();

    public void add(MathExpression mathExpression) {
        children.add(mathExpression);
    }

    @Override
    public int getResult() {
        int result = 1;
        for (MathExpression mathExpression : children) {
            result *= mathExpression.getResult();
        }
        return result;
    }
}
