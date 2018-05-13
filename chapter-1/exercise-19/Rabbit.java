public class Rabbit {
    public static void main(String[] args) {
        Rabbit one = new Rabbit();
        Rabbit two = new Rabbit();
        Rabbit three = one;
        one = null;
        Rabbit four = one;
        three = null;
        two = null;
        two = new Rabbit();
        System.gc();
} }

/*
* 1/A - The Rabbit object from line 3 is first eligible for garbage collection immediately following line 6 (False)
* 2/B - The Rabbit object from line 3 is first eligible for garbage collection immediately following line 8 (True)
* 3/C - The Rabbit object from line 3 is first eligible for garbage collection immediately following line 12 (False)
* 4/D - The Rabbit object from line 4 is first eligible for garbage collection immediately following line 9 (True)
* 5/E - The Rabbit object from line 4 is first eligible for garbage collection immediately following line 11 (False)
* 6/F - The Rabbit object from line 4 is first eligible for garbage collection immediately following line 12 (False)
*/
