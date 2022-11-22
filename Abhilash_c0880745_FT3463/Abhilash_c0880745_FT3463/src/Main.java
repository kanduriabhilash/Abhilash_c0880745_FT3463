public class Main {
    public static void main(String[] args) {

        // constructing the expression 3 + 2 * 5
        Number number = new Number(3);
        Number secondNumber = new Number(2);
        Number thirdNumber = new Number(5);
        Product product = new Product();
        Sum sum = new Sum();

        product.left.value = number.evaluate();
        product.right.value = secondNumber.evaluate();

        product.evaluate();

        System.out.println(product.evaluate());

        System.out.println(number.toString());


    }
}