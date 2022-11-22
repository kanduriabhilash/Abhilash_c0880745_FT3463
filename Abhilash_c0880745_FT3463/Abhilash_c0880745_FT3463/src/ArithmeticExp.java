public abstract class ArithmeticExp {
    abstract int evaluate();

    int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
