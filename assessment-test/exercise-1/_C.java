public class _C {
  private static int $;
  public static void main(String[] main) {
    String a_b;
    System.out.print($);
    System.out.print(a_b);
} }

/**
* 1 - Compiler error on line 1. (False)
* 	There's no problem on line one, because valid class name (identifiers) may begin with letter, underscore, or dollar sign. It's is worth also mention that after a those valid begin, numbers can be part of identifiers.
* 2 - Compiler error on line 2. (False)
* 	There's no problem on line two, because valid name variables (identifiers) may begin with letter, underscore, or dollar sign. It's is worth also mention that after a those valid begin, numbers can be part of identifiers.
* 3 - Compiler error on line 4. (False)
* 4 - Compiler error on line 5. (False)
* 5 - Compiler error on line 6. (True)
* 	The local variable cannot be used (be refered) before it is initialized in somehow, it is because local variables doesn't have default values.
* 6 - 0null (False)
* 7 - nullnull (False)
*/
