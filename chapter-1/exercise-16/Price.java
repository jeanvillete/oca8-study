public class Price {
    public void admission() {
        // INSERT CODE HERE
        System.out.println(amount);
        }
    public static void main(String[] args) {
        new Price().admission();
    }
}

/*
* 1/A - int amount = 9L; (False)
*   It is not possible assign a long value to a int, the compiler claims about lossy presition
* 2/B - int amount = 0b101; (True)
*   It represents 5 int value
* 3/C - int amount = 0xE; (True)
*   It represents 14 int value
* 4/D - double amount = 0xE; (True)
*   It represents 14.0 double value
* 5/E - double amount = 1_2_.0_0; (False)
*   It fails, because underscores can only be placed between digits, and not right neither before nor after decimal points (dot/period).
* 6/F - int amount 1_2_; (False)
*   It fails, because underscores can only be placed between digits, and not right neither before nor after decimal points (dot/period).
* 7/G - None of the above
*/
