public class Product extends Binary{


    @Override
    int evaluate() {
           return left.value * right.value;
    }

    @Override
    public String toString() {
        return left.value + "*" + right.value;
    }
}
