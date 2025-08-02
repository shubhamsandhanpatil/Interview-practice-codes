public class Fibonacci {

    public static void main(String[] args) {
        int n = 10;
        int first = 0;
        int second = 1;
        System.out.println("Fibonacci Series  " + first + " " + second);  //  0 1

        for (int i = 2; i <= n; i++) {
            int next = first + second;
            System.out.println(" " + next);
            first = second;
            second = next;
        }
    }
}
// 1 2 3 5 8 13 21