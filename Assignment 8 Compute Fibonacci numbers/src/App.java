public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        /* Direct excerpt from WIKI
         * 
         * In mathematics, the Fibonacci numbers, commonly denoted Fn , form a sequence, the Fibonacci sequence, 
         * in which each number is the sum of the two preceding ones. 
         * The sequence commonly starts from 0 and 1, although some authors start the sequence from 1 and 1 or sometimes (as did Fibonacci) from 1 and 2. 
         * Starting from 0 and 1, the first few values in the sequence are:
         * 
         * 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144.
         * 
         */
        int n = 30;


        System.out.println("Printing fibonacci number!");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }

    }

    /* IF: "The Fibonacci sequence is a series of numbers in which each number after the first two is the sum of the two preceding numbers.""
     * THEN: This calls for RECURSION algorithm
     * EXAMPLE COMPUTATION DONE: [0 + 1 = 1], [1 + 1 = 2], [1 + 2 = 3], [2 + 3 = 5], [3 + 5 = 8]
     * 
     * PATTERN: Formula states F(N) = F(N-1) + F(N-2)
     * PROBLEM: A problem arises when I start a 0. How do I incorporate 0 and 1 into the sequence?
     */
    public static int fibonacci(int num){
         if (num == 0) {
            return 0;
        } else if (num == 1) {
            return 1;
        } else {
        return fibonacci(num - 1) + fibonacci(num - 2);
        }
    }
}
