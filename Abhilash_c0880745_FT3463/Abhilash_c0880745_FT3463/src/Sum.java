public class Sum extends Binary{


    @Override
    int evaluate() {
        return left.value + right.value;
    }

    @Override
    public String toString() {
        return left.toString() + "+" + right.toString();
    }
}
