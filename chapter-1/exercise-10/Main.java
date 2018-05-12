class Main {

    {}
}

/*
* A valid gateway (for JVM process with the programmer's code) method, to be invoked from command line, has the signature;
*   access modifier "public"
*   a class method, i.e; "static"
*   it optionally can provide "final" keyword (it's not usual, but it still work)
*   return type "void"
*   named as "main"
*   Array of String as parameter
*
* 1/A - private static void main(String[] args) (False)
*   The method must have the access modifier public
* 2/B - public static final main(String[] args) (False)
*   This is not a valid method, once it doesn't have a return type declared
* 3/C - public void main(String[] args) (False)
*   This is a valid instance method, not a class (static) so not valid to be invoked from command line
* 4/D - public static void test(String[] args) (False)
*   In order to be invoked from command line, the method name must be "main"
* 5/E - public static void main(String[] args) (True)
* 6/F - public static main(String[] args) (False)
    This is not a valid method once no return type is declared
* 7/G - None of the above (False)
*/
