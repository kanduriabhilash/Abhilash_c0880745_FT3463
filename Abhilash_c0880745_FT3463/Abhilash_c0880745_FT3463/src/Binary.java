public abstract class Binary extends ArithmeticExp{

   ArithmeticExp left;
   ArithmeticExp right;

   public ArithmeticExp getLeft() {
      return left;
   }

   public void setLeft(ArithmeticExp left) {
      this.left = left;
   }

   public ArithmeticExp getRight() {
      return right;
   }

   public void setRight(ArithmeticExp right) {
      this.right = right;
   }
}
