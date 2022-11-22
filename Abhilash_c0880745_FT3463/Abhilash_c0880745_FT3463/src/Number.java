

public class Number extends ArithmeticExp{

    int value;

    Number(int value){
        this.value = value;
    }

    @Override
    int evaluate() {
        return value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
