public class _C {
  private static int $;
  public static void main(String[] main) {
    String a_b;
    System.out.print($);
    System.out.print(a_b);
} }

/*
* Compiler error on line 4;
* The local variable "a_b" has not been properly initialized, so it cannot be used for assignment or other operations.
* 
* At first glance, it look tricky because the declaration of the "static int $" class member, but the "$" symbol is a valid one, so there's no error on that.
*/
