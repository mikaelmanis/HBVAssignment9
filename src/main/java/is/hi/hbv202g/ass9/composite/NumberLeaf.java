package is.hi.hbv202g.ass9.composite;

public class NumberLeaf implements MathExpression {
    private int number;

    public NumberLeaf(int number) {
        this.number = number;
    }

    @Override
    public int getResult() {
        return number;
    }
}
